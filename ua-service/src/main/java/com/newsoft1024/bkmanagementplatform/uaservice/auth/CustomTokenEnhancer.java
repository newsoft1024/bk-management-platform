package com.newsoft1024.bkmanagementplatform.uaservice.auth;

import com.newsoft1024.bkmanagementplatform.uaservice.model.Account;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        final Map<String, Object> additionalInfo = new HashMap<>();
        Authentication userAuthentication = authentication.getUserAuthentication();
        if (userAuthentication != null) {
            Account user = (Account) userAuthentication.getPrincipal();
//            additionalInfo.put("ownerId", user.getOpenId());
//            additionalInfo.put("authorities", user.getAuthorities());
//            additionalInfo.put("id", user.getId());
//            additionalInfo.put("username", user.getUsername());
//            additionalInfo.put("nickname", user.getNickname());
//            additionalInfo.put("userType", user.getUserType());
//            additionalInfo.put("mobile", user.getMobile());
//            additionalInfo.put("status", user.getStatus());
//            additionalInfo.put("source", user.getSource());
//            additionalInfo.put("openId", user.getOpenId());
//            additionalInfo.put("tenantId", user.getTenantId());
//            additionalInfo.put("regTime", user.getRegTime());
//
//            additionalInfo.put("token", user.getToken());
        }
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
        return accessToken;
    }
}











