package com.sb.SpringBootMay2026.propertysourceTut;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropAnotherController {

    private final PropAnotherService propAnotherService;

    public PropAnotherController(PropAnotherService propAnotherService) {
        this.propAnotherService = propAnotherService;
    }

    @GetMapping("/getPropAnother")
    public String getPropAnother() {
        return propAnotherService.getDad() + " " + propAnotherService.getMom();
    }
}
