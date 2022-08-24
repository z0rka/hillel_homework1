package com.homework1.company;

public class Employee {

    private String fullName;
    private String jobTitle;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String fullName,String jobTitle, String email, int phoneNumber, int age){
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void printInfo(){
        System.out.print(fullName+" "+jobTitle+" "+email+" "+phoneNumber+" "+age);
    }
}
