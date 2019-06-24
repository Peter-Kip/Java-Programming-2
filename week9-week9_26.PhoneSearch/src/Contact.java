
import java.util.HashSet;
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
public class Contact implements Comparable<Contact>{
    private String name;
    private Set<String> phoneNumbers;
    private String address;
    
    public Contact(String name){
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.address = "";
    }
    
    public String getName(){
        return this.name;
    }
    
    public Set<String> getNumber(){
        return this.phoneNumbers;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void addNumber(String number){
        this.phoneNumbers.add(number);
    }
    
    public void addAddress(String address){
        this.address = address;
    }
    
    public String toString(){
        if(this.getNumber().isEmpty() && this.getAddress().isEmpty()){
            return "address unknown" + "\n"+ "phone number not found";
        }else if(!this.getNumber().isEmpty() && this.getAddress().isEmpty()){
            return "address unknown" + "\n" + "phone numbers: " + "\n" + this.getNumber();
        }else if(this.getNumber().isEmpty() && !this.getAddress().isEmpty()){
            return "address: " + this.getAddress() + "\n" + "phone number not found";
        }else{
            return "address: " + this.getAddress() + "\n" + "phone numbers: " + "\n" + this.getNumber();
        }
        
    }

    @Override
    public int compareTo(Contact o) {
         return this.name.compareToIgnoreCase(o.getName());
    }
    
}
