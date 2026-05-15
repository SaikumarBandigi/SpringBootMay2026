package com.sb.SpringBootMay2026.configurationmanagementTut.config;

import com.sb.SpringBootMay2026.configurationmanagementTut.EnableConfigurationPropsTut;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EnableConfigurationPropsTut.class)
class MyConfiguration {


}