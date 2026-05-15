package com.sb.SpringBootMay2026.configurationmanagementTut;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "india")
public class ConfigurationPropsExample {

    private String homeminister;

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

    private String pm;

    @GetMapping("/getIndiaDetailsCP")
    public String getIndiaDetailsCP() {
        return homeminister + " " + pm;
    }


}
