package com.ms.designPatterns.creational.prototype;

class Employee implements Prototype {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Employee(this.name, this.department);
    }

    public String toString() {
        return name + " - " + department;
    }
}

