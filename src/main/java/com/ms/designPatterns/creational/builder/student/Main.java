package com.ms.designPatterns.creational.builder.student;

public class Main {

    public static void main(String[] args){

        StudentBuilder studentBuilder=new StudentBuilder();
        Student student=studentBuilder.setRollNo(1).setFirstName("Ram").setCity("Ayodhya").setState("UP")
                .setDistrict("Faizabad").build();
        System.out.println(student.toString());
    }
}
