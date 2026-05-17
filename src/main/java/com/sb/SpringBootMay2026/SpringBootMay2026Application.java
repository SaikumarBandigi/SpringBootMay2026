package com.sb.SpringBootMay2026;

import com.sb.SpringBootMay2026.model.Animal;
import com.sb.SpringBootMay2026.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Objects;

@SpringBootApplication
class SpringBootMay2026Application {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootMay2026Application.class, args);
    }


}
