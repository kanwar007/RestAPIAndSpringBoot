package com.kanwartech.RestAPIAndSpringBoot.model;

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String emailAddress;
    private int phoneNumber;
   
    public User(Integer id, String firstName, String lastName, String address, String emailAddress, int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
                + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + "]";
    }


    
    
    
}
