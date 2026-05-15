package com.sb.SpringBootMay2026.configurationmanagementTut;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private EnableConfigurationPropsTut ecpt;

    @GetMapping("/getIndiaDetailsECP")
    public String getIndiaDetailsECP() {
        return ecpt.getHomeminister() + " " + ecpt.getPm();
    }

}
