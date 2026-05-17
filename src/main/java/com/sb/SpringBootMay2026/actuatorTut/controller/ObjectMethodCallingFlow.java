package com.sb.SpringBootMay2026.actuatorTut.controller;

public class ObjectMethodCallingFlow {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.startProcess();
    }
}

class Employee {

    void startProcess() {

        System.out.println("Start Process");

        SalaryService salaryService = new SalaryService();

        salaryService.calculateSalary();
    }
}

class SalaryService {

    void calculateSalary() {

        System.out.println("Calculate Salary Method");

        TaxService taxService = new TaxService();

        taxService.calculateTax();
    }
}

class TaxService {

    void calculateTax() {

        System.out.println("Calculate Tax Method");

        BonusService bonusService = new BonusService();

        bonusService.addBonus();
    }
}

class BonusService {

    void addBonus() {

        System.out.println("Add Bonus Method");

        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification();
    }
}

class NotificationService {

    void sendNotification() {

        System.out.println("Send Notification Method");

        generateFinalSalary();
    }

    void generateFinalSalary() {

        int salary = 50000;
        int bonus = 10000;
        int tax = 5000;

        int finalSalary = salary + bonus - tax;

        System.out.println("Final Salary : " + finalSalary);
    }
}