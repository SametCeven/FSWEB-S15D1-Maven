package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone;
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("John Doe", "123123123");
        contacts.add(contact1);
        contacts.add(new Contact("Jane Doe", "124124124"));
        contacts.add(new Contact("Baby Doe", "125125125"));
        System.out.println(contacts.contains(contact1));
        mobilePhone = new MobilePhone("11111111", contacts);


        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(contact);
        System.out.println(mobilePhone.findContact(contact.getName()));
    }

}
