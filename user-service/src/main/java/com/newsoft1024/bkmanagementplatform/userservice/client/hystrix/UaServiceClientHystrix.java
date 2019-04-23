package com.newsoft1024.bkmanagementplatform.userservice.client.hystrix;

import com.newsoft1024.bkmanagementplatform.entity.JWT;
import com.newsoft1024.bkmanagementplatform.userservice.client.UaServiceClient;

public class UaServiceClientHystrix implements UaServiceClient {
	@Override
	public JWT getToken(String authorization, String grantType, String username, String password) {
		return null;
	}

	@Override
	public JWT refreshToken(String authorization, String grantType, String refreshToken) {
		return null;
	}
}
