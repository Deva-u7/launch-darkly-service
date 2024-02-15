package com.launchdarkly.Controller;

import com.launchdarkly.common.FlagProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
public class TestController {

    private final FlagProvider flagProvider;
    String COUNTRY_FLAG = "test-flag";
    String TEST_FLAG1 = "test";

    @GetMapping("/api/test")
    public Boolean testFlag(@RequestParam("country") String country) {
        Boolean featureEnable = flagProvider.isFeatureEnable(COUNTRY_FLAG, country);
        return featureEnable;
    }
    @GetMapping("/api/test1")
    public Boolean testFlag() {
        Boolean featureEnable = flagProvider.isFeatureEnable(TEST_FLAG1);
        return featureEnable;
    }
}
