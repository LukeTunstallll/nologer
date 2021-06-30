package com.nology.nologer;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private String[] interests;

    public Student(String firstName, String lastName, int age, String location, String[] interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.interests = interests;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String[] getInterests() {
        return interests;
    }
}
