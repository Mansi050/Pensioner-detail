//package com.cts.code.proxy;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//
//import com.cts.code.entity.AuthorizationResponse;
//
//@FeignClient(name = "authorization-microservice", url="localhost:8083")
//public interface ValidateProxy {
//	
//	@GetMapping("/validate")
//	public ResponseEntity<AuthorizationResponse> validatingAuthorizationToken(
//			@RequestHeader(name = "Authorization")String tokenDup);
//
//}
