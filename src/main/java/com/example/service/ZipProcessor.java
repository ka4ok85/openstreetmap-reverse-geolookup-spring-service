package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.dto.Call;
import com.example.dto.PlaceContainer;

@EnableBinding(Processor.class) 
public class ZipProcessor {

	private static final Logger log = LoggerFactory.getLogger(ZipProcessor.class);
	
	@Autowired
	private ReverseGeoLookupResource reverseGeoLookupResource;
	
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Call transformToUpperCase(Call call) { // enrich Call object with Zip Code
		// TODO: Add Hystrix Support
		PlaceContainer place = reverseGeoLookupResource.getAddressDetails(call.getLatitude(), call.getLongitude());
		call.setZip(place.getAddress().getPostcode());
		if (call.getZip() == null) {
			log.warn("Can not lookup Zip! Service: {}. Incident: {}", "openstreetmap-reverse-geolookup", call.getIncidentNumber());
		}

        return call;
    }
}
