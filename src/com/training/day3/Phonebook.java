package com.training.day3;

import java.util.ArrayList;
import java.util.List;

// create a java class Phonebook, Phonebook will have collection of Contact(firstName, lastName, phoneNo)
// the tester class should able to add a new contact, view all contacts, remove contact, view a
// contact by phone number

public class Phonebook {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        for(Contact contact: contacts) {
            System.out.println("First Name: "+ contact.getFirstName() + "Last Name: "+contact.getLastName()+"Phone No: "+contact.getContactNo());
        }
    }

    public void removeContact(Contact contact) {
        System.out.println("Contact removed: "+ contact);
        contacts.remove(contact);
    }

    public void viewByPhoneNo(String contactNo) {
        for(Contact contact: contacts) {
            if(contact.getContactNo().equals(contactNo)) {
                System.out.println("Contact: "+ contact);
            }
        }
    }



}
