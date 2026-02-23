package com.ms.designPatterns.creational.prototype;

public class Client {

    public static void main(String[] args){
        Employee emp1 = new Employee("Ram", "Engineering");
        Employee emp2 = (Employee) emp1.clone();

        emp2.setName("Riya");

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
