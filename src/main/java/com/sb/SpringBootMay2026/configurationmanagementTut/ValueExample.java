package com.sb.SpringBootMay2026.configurationmanagementTut;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueExample {

    @Value("${india.pm}")
    private String pmName;

    @Value("${india.homeminister}")
    private String homeminister;


    @GetMapping("/getIndiaDetails")
    public String getIndiaDetails() {
        return pmName + " " + homeminister;
    }

}
