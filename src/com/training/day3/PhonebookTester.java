package com.training.day3;

public class PhonebookTester {
    public static void main(String... args) {
        Phonebook phonebook = new Phonebook();
        Contact c1 = new Contact("Shivam", "Sharma", "123456");
        Contact c2 = new Contact("Prakash", "Sharma", "734838");
        Contact c3 = new Contact("Vijay", "Sharma", "823279");
        phonebook.addContact(c1);
        phonebook.addContact(c2);
        phonebook.addContact(c3);
        phonebook.removeContact(c1);
        phonebook.viewContacts();
        phonebook.viewByPhoneNo("734838");
    }
}
