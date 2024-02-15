package com.launchdarkly.config;

import com.launchdarkly.common.FlagProvider;
import com.launchdarkly.sdk.server.LDClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaunchDarklyConfig {
    @Value("${launch-darkly.key}")
    String SDKKEY ;
    @Bean
    public LDClient sdkLDClient() {
         return new LDClient(SDKKEY);
    }
    @Bean
    public FlagProvider flagProvider(LDClient ldClient){
        return new FlagProvider(ldClient);
    }
}
