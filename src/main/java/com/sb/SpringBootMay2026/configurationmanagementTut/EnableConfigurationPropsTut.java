package com.sb.SpringBootMay2026.configurationmanagementTut;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "india")
public class EnableConfigurationPropsTut {

    private String homeminister;
    private String pm;

    public String getHomeminister() {
        return homeminister;
    }

    public void setHomeminister(String homeminister) {
        this.homeminister = homeminister;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

}


