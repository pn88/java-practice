package com.pinodev.basics.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private  String myNumber;
    private ArrayList<Contact> myContact;
    private static Scanner scanner = new Scanner(System.in);


    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();


    }
    public boolean addNewConctact(Contact contact){
        if(findContact(contact) < 0 ){
            this.myContact.add(contact);
            System.out.println(contact.getName() +" has been added");
            return true;
        }
        System.out.println(contact.getName() +" already exist");
        return false;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            this.myContact.set(position,newContact);
            System.out.println(oldContact.getName() +" has been replaced successfully by "+ newContact.getName());
            return true;
        }
        System.out.println("contact doesn't exist");
        return false;
    }
    public boolean removeContact(Contact contact){
        if(findContact(contact) >= 0){
            this.myContact.remove(contact);
            System.out.println(contact.getName() + " has been deleted successfully" );
            return true;
        }
        else {
            System.out.println(contact.getName()  +" doesn't exist");
            return false;
        }
    }
    private int findContact(Contact contact){
        if(this.myContact.size()>0){
            for(int i = 0; i < this.myContact.size();i++) {
                if (this.myContact.get(i).equals(contact)) {
                    return i;
                }
            }
        }
        return -1;
    }
    private int findContact(String contactName){
        if(this.myContact.size()>0){
            for(int i = 0; i < this.myContact.size();i++){
                Contact contact = this.myContact.get(i);
                if(contact.getName().equals(contactName)){
                    return i;
                }
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }

        return null;
    }
    public Contact queryContact(String name){
        if(findContact(name) >= 0){
            return this.myContact.get(findContact(name));
        }

        return null;
    }

    public void printContact(){
        for(int i = 0; i  < this.myContact.size();i++){
            if(this.myContact.get(i) != null){
                System.out.println("Contact List: ");
                System.out.println((i+1)+". "+ this.myContact.get(i).getName() + " -> "+ this.myContact.get(i).getphoneNumber());
            }
        }

        System.out.println("Contact List is empty");
    }
    public void turnOnPhone() {
        boolean quit = false;
        System.out.println("The phone is turning on to the number ");
        while (!quit) {//while quit is true
            System.out.println("Welcome to the menu, select one option \n" +
                    "1 : To add a contact\n" +
                    "2 : To update a contact\n" +
                    "3 : To remove a contact\n" +
                    "4 : To query a contact\n" +
                    "5 : To print contact list\n" +
                    "6 : To quit!\n");
            int value = scanner.nextInt();
            scanner.nextLine();
            switch (value) {
                case 1:
                    System.out.println("Enter a new contact :");
                    System.out.print("Edit contact's name :");
                    String name = scanner.nextLine();
                    System.out.print("Edit contact's number :");
                    String phoneNumber = scanner.nextLine();
                    if(findContact(name) >= 0){
                        System.out.println("contact already exist");
                        break;
                    }
                    Contact contact = Contact.createContact(name, phoneNumber);
                    addNewConctact(contact);
                    break;
                case 2:
                    System.out.println("Enter old contact :");
                    String oldContact = scanner.nextLine();
                    if(queryContact(oldContact) == null){
                        System.out.println("contact doesn't exist");
                        break;
                    }
                    System.out.print("Edit contact's name :");
                    name = scanner.nextLine();
                    System.out.print("Edit contact's number :");
                    phoneNumber = scanner.nextLine();
                    contact = Contact.createContact(name, phoneNumber);
                    updateContact(this.myContact.get(findContact(oldContact)), contact);
                    break;
                case 3:
                    System.out.println("Enter contact to delete :");
                    oldContact = scanner.nextLine();
                    if (queryContact(oldContact) == null) {
                        System.out.println(oldContact + " doesn't exist");
                        break;
                    }
                    removeContact(this.myContact.get(findContact(oldContact)));
                    break;
                case 4:
                    System.out.println("Enter contact to query :");
                    oldContact = scanner.nextLine();
                    if (queryContact(oldContact) == null) {
                        System.out.println(oldContact + " doesn't exist");
                        break;
                    }
                    queryContact(oldContact);
                    break;
                case 5:
                    printContact();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    System.out.println(this.myContact.size());
                    break;
                case 8:
                    System.out.print("Edit contact's name :");
                    name = scanner.nextLine();
                    System.out.println(this.myContact.get(findContact(name)));
                    break;
                case 9:
                    System.out.print("Edit contact's name :");
                    name = scanner.nextLine();
                    System.out.println(findContact(name));
                    System.out.println(queryContact(name));
                    break;

            }
        }
    }
}