package com.launchdarkly.common;

import com.launchdarkly.sdk.LDUser;
import com.launchdarkly.sdk.server.LDClient;
public class FlagProvider{
    String USER = "user";

    LDClient ldClient;
    public FlagProvider(LDClient ldClient){
        this.ldClient = ldClient;
    }
    public  Boolean isFeatureEnable(String key,String country) {
        LDUser ldUser = new LDUser.Builder(USER).country(country).build();
        return ldClient.boolVariation(key,ldUser, false);
    }
    public  Boolean isFeatureEnable(String key) {
        LDUser ldUser = new LDUser.Builder(USER).build();
        return ldClient.boolVariation(key,ldUser, false);
    }
}
