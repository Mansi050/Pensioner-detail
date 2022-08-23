package com.cts.code.Controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.code.entity.PensionerDetailEntity;
import com.cts.code.service.PensionerService;

@RestController
@CrossOrigin(origins = "*")
public class PensionerDetailController {
	
	Logger logger = LoggerFactory.getLogger(PensionerDetailController.class);
	
	@Autowired
	private PensionerService service;
	
//	@Autowired
//	ValidateProxy proxy;
	
	@GetMapping("/get-health")
	public ResponseEntity<?> healthCheckMethod() {
		logger.debug("Health check method");
		return ResponseEntity.ok("Health check successful");
	}
	
	@GetMapping("/pensioner-detail")
	public HashMap<Long,PensionerDetailEntity> retrieveDetail(@RequestHeader(name="Authorization") String token) throws Exception{
		logger.info("Validating Token");
//		proxy.validatingAuthorizationToken(token);
//	    if(proxy.validatingAuthorizationToken(token).getStatusCodeValue() == 200) {
		logger.info("Token Validated");
		HashMap<Long,PensionerDetailEntity> map = service.getValues();
		logger.info("Pensioner Found,returing List");
		return map;
	}
//	    return null;
//}
		
	
	@GetMapping("/pensioner-detail/{adharCard}")
	public PensionerDetailEntity retrieveDetail(@RequestHeader(name="Authorization") String token, @PathVariable("adharCard") Long adharCard) throws Exception{
		    logger.info("Validating Token");
//		    proxy.validatingAuthorizationToken(token);
//		    if(proxy.validatingAuthorizationToken(token).getStatusCodeValue() == 200) {
			logger.info("Valid Token");
			logger.info("Toekn Validated");
			HashMap<Long, PensionerDetailEntity> map = service.getValues();
			if (map.get(adharCard)==null )
			{	
				logger.info("No Aadhar Card Found");
				return new PensionerDetailEntity();
			}
			logger.info("Details Found");
			return map.get(adharCard);
		
	}
//		    else {
//		    	return null;
//		    }}

}
