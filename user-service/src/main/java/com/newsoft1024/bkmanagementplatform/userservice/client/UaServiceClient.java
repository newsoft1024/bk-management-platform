package com.newsoft1024.bkmanagementplatform.userservice.client;

import com.newsoft1024.bkmanagementplatform.entity.JWT;
import com.newsoft1024.bkmanagementplatform.userservice.client.hystrix.UaServiceClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "uaa-service", fallback = UaServiceClientHystrix.class)
@Component
public interface UaServiceClient {
	@PostMapping(value = "/oauth/token")
	JWT getToken(@RequestHeader("Authorization") String authorization,
				 @RequestParam("grant_type") String grantType,
				 @RequestParam("username") String username,
				 @RequestParam("password") String password);

	@PostMapping(value = "/oauth/token")
	JWT refreshToken(@RequestHeader("Authorization") String authorization,
					 @RequestParam("grant_type") String grantType,
					 @RequestParam("refresh_token") String refreshToken);
}
