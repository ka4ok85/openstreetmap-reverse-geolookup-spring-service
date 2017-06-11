package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.config.FeignConfiguration;
import com.example.dto.PlaceContainer;

@FeignClient(name = "reverse-geo-lookup-service", url = "http://nominatim.openstreetmap.org/reverse?format=json&addressdetails=1", configuration = FeignConfiguration.class)
public interface ReverseGeoLookupResource {
	@RequestMapping(method = RequestMethod.GET)
	public PlaceContainer getAddressDetails(@RequestParam("lat") float lat, @RequestParam("lon") float lon);
}
