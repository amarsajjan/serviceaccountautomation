package com.juniper.serviceImpl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.juniper.service.ServiceAccountService;

@Service
public class ServiceAccountServiceImpl implements ServiceAccountService{

	@Value( "${restURL}" )
	private String restURL;
	
	public Object createServiceAccount(){
		System.out.println("restURL."+restURL);
		RestTemplate restTemplate = new RestTemplate();
	  //  String result = restTemplate.execute(restURL, String.class);
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<Object> result = restTemplate.exchange(restURL, HttpMethod.GET, entity, Object.class);
	    
	    
	    return result;
	}
}
