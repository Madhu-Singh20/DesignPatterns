package com.ms.designPatterns.creational.builder.student;

import lombok.Data;

@Data
public class StudentBuilder {

    private int rollNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mother;
    private String father;
    private String city;
    private String district;
    private String state;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setMother(String mother) {
        this.mother = mother;
        return this;
    }

    public StudentBuilder setFather(String father) {
        this.father = father;
        return this;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public StudentBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
