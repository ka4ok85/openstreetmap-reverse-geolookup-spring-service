package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.dto.Call;
import com.example.dto.PlaceContainer;

@EnableBinding(Processor.class) 
public class ZipProcessor {

	@Autowired
	private ReverseGeoLookupResource reverseGeoLookupResource;
	
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Call transformToUpperCase(Call call) { // enrich Call object with Zip Code
		// TODO: Add Hystrix Support
		PlaceContainer place = reverseGeoLookupResource.getAddressDetails(call.getLatitude(), call.getLongitude());
		call.setZip(place.getAddress().getPostcode());
		
        return call;
    }
}
