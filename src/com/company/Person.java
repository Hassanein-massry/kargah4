package com.company;

public class Person {
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
    public Person(String firstName , String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
    }

}
