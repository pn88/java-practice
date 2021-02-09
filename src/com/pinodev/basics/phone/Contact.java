package com.pinodev.basics.phone;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name){
        this.name = name;
    }
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getphoneNumber(){
        return this.phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}