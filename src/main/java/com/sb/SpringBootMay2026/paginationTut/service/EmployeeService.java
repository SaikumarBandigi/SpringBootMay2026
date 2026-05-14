package com.sb.SpringBootMay2026.paginationTut.service;

import com.sb.SpringBootMay2026.paginationTut.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static final List<Employee> employees = new ArrayList<>();

    static {

        employees.add(new Employee(1, "Ram"));
        employees.add(new Employee(2, "Shyam"));
        employees.add(new Employee(3, "John"));
        employees.add(new Employee(4, "David"));
        employees.add(new Employee(5, "Scott"));
        employees.add(new Employee(6, "Martin"));
        employees.add(new Employee(7, "Sai"));
        employees.add(new Employee(8, "Kumar"));

    }

    public Page<Employee> getEmployees(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), employees.size());

        List<Employee> employeeList = employees.subList(start, end);
        return new PageImpl<>(employeeList, pageable, size);
    }
    /*

        Pageable pageable = PageRequest.of(page, size);

        int start = (int) pageable.getOffset();

        int end = Math.min(start + pageable.getPageSize(), employees.size());

        List<Employee> pageContent = employees.subList(start, end);
        return new PageImpl<>(pageContent, pageable, employees.size());
     */

}