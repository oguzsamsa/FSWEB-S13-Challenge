package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        operations();
    }

    public static void operations() {
        String[] employees = new String[5];
        employees[0] = "oğuz";
        employees[1] = "ali";
        Company company = new Company(1,"workintech", 5000, employees );
        company.addEmployee(1, "veli");
        company.addEmployee(4, "ahmet");
        company.addEmployee(7, "merve");
        System.out.println(company);


    }
}