package com.sb.SpringBootMay2026.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public void print() {
        System.out.println("Dog");
    }

}