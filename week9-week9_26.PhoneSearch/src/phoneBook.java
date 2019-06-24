
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class phoneBook {
    private List<Contact> contacts;
    private Scanner reader;
    
    public phoneBook(){
        this.contacts = new ArrayList<Contact>();
        this.reader = new Scanner(System.in);
    }
    
    public void initialCommands(){
        System.out.println("phone search\n" + "available operations:");
        System.out.println(" 1 add a number\n" +
                           " 2 search for a number\n" +
                           " 3 search for a person by phone number\n" +
                           " 4 add an address\n" +
                           " 5 search for personal information\n" +
                           " 6 delete personal information\n" +
                           " 7 filtered listing\n" +
                           " x quit");
    }
    
    public void command(){
        while(true){
            System.out.print("command: ");
            String command = reader.nextLine();
            if(command.equals("1")){
                addNumber();
            }else if(command.equals("2")){
                searchNumber();
            }else if(command.equals("3")){
                searchPersonByNumber();
            }else if(command.equals("4")){
                addAddress();
            }else if(command.equals("5")){
                searchInformation();
            }else if(command.equals("6")){
                deleteInformation();
            }else if(command.equals("7")){
                filteredListing();
            }else if(command.equals("x")){
                break;
            }
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        
        Contact toSearch = new Contact(""); 
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                toSearch = c;
            }
        }
        if(contacts.contains(toSearch)){
            toSearch.addNumber(number);
        }else{
            toSearch = new Contact(name);
            toSearch.addNumber(number);
            contacts.add(toSearch);
        }
    }

    private void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Set<String> numbers = new HashSet<String>();
        
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                numbers.add(c.getNumber().toString());
                System.out.println(numbers);
            }else{
                System.out.println("not found");
            }
        }
        
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        
        for(Contact c: contacts){
            if(c.getNumber().contains(number)){
                System.out.println(c.getName());
            }else{
                System.out.println("not found"); 
            }
        }      
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        
        String address = street + " " + city;
        Contact toSearch = new Contact("");
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                toSearch = c;
            }
        }
        if(contacts.contains(toSearch)){
            toSearch.addAddress(address);
        }else{
            toSearch = new Contact(name);
            toSearch.addAddress(address);
            contacts.add(toSearch);
        }
    }

    private void searchInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        Contact toSearch = new Contact("");
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                toSearch = c;
            }
        }
        if(contacts.contains(toSearch)){
            System.out.println(toSearch);
        }else{
            System.out.println("not found");
        }
    }

    private void deleteInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        Contact toRemove = new Contact("");
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                toRemove = c;
            }
        }
        if(contacts.contains(toRemove)){
            contacts.remove(toRemove);
        }else{
            System.out.println("not found");
        }
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String key = reader.nextLine();
        
        Collection<Contact> newList = new ArrayList<Contact>();
        Collections.sort(contacts);
        for(Contact c : contacts){
            if(key.isEmpty() || c.getName().contains(key)|| c.getAddress().contains(key)){
                newList.add(c);
            }
        }
        if(newList.isEmpty()){
            System.out.println("not found");
        }else{
            for(Contact c : newList){
                System.out.println(c.getName());
                System.out.println(c);
            }
        }
    }
    
}
