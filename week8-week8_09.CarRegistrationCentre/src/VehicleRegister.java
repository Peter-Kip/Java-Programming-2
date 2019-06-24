
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> register;
    
    public VehicleRegister(){
        register = new HashMap<RegistrationPlate, String>();
    }
     public boolean add(RegistrationPlate plate, String owner){
         if (register.get(plate) == null) {
            register.put(plate, owner);
            return true;
        } 
            return false;
     }
     public String get(RegistrationPlate plate){
         if(this.register.containsKey(plate)){
             return register.get(plate);
         }
        return null;      
     }
     public boolean delete(RegistrationPlate plate){
         if(this.register.containsKey(plate)){
             this.register.remove(plate);
             return true;
         }
        return false;
     }
     public void printRegistrationPlates(){
         for(RegistrationPlate p : register.keySet()){
             System.out.println(p);
         }
     }
     public void printOwners(){
         ArrayList<String> owners = new ArrayList<String>();
         for(RegistrationPlate p : register.keySet()){
             String owner = this.register.get(p);
             if(!owners.contains(owner)){
                 owners.add(owner);
             }
             
         }
         for(String name : owners){
            System.out.println(name);
         }
     }
}
