package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)throws IllegalAccessException {
        if (firstName== null) {
            throw new IllegalAccessException("Firstname was null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws IllegalAccessException {
        if (lastName == null) {
            throw new IllegalAccessException("lastname was null");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalAccessException{
        if (email == null) {
            throw new IllegalAccessException("email was null");
        }
        this.email = email;
    }

    public String getSummary() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nEmail: " + email;
    }
}
