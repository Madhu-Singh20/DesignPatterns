package com.ms.designPatterns.creational.builder.student;

public class Student {

    private int rollNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mother;
    private String father;
    private String city;
    private String district;
    private String state;


    public Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.getRollNo();
        this.firstName = studentBuilder.getFirstName();
        this.middleName = studentBuilder.getMiddleName();
        this.lastName = studentBuilder.getLastName();
        this.mother = studentBuilder.getMother();
        this.father = studentBuilder.getFather();
        this.city = studentBuilder.getCity();
        this.district = studentBuilder.getDistrict();
        this.state = studentBuilder.getState();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
