package com.sb.SpringBootMay2026.paginationTut.controller;


import com.sb.SpringBootMay2026.paginationTut.model.Employee;
import com.sb.SpringBootMay2026.paginationTut.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControllerr {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public Page<Employee> getEmployees(@RequestParam int page, @RequestParam int size) {
        return service.getEmployees(page, size);
    }

}