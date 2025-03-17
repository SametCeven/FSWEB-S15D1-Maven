package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public List myContacts(){
        return myContacts;
    }
    public String getMyNumber() {
        return myNumber;
    }
    public List<Contact> getMyContacts(){
        return myContacts;
    }
    public MobilePhone(String myNumber,List myContacts){
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }
    public boolean addNewContact(Contact Contact){
        if(!myContacts.contains(Contact)){
            myContacts.add(Contact);
            return true;
        }else{
            return false;
        }
    }
    public boolean updateContact(Contact OldContact, Contact NewContact){
        if(myContacts.contains(OldContact)){
            myContacts.set(myContacts.indexOf(OldContact),NewContact);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeContact(Contact ContactToRemove){
        if(myContacts.contains(ContactToRemove)){
            myContacts.remove(ContactToRemove);
            return true;
        }else{
            return false;
        }
    }
    public int findContact(Contact ContactToFind){
        if(myContacts.contains(ContactToFind)){
            return myContacts.indexOf(ContactToFind);
        }else{
            return -1;
        }
    }
    public int findContact(String ContactToFind){
        int index=0;
        for(Contact myContact:myContacts){
            if(myContact.getName().equals(ContactToFind)){
                index = myContacts.indexOf(myContact);
            }else{
                index = -1;
            }
        }
        return index;
    }
    public Contact queryContact(String contactName){
        Contact contactFound=null;
        for(Contact myContact:myContacts){
            if(myContact.getName().equals(contactName)){
                contactFound = myContacts.get(myContacts.indexOf(myContact));
            }else{
                contactFound = null;
            }

        }
        return contactFound;
    }
    public void printContact(){
        for(Contact myContact:myContacts){
            System.out.println(myContact);
        }
    }




}
