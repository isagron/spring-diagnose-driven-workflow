package com.github.isagron.springdiagnoseserver.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "diagnose.setting.arrayBlockingQueue")

public class DiagnsoeServerProperties {

    @Getter
    @Setter
    private String diagnoseReport;
}
