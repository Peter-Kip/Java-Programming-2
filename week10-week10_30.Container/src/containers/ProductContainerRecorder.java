/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Kiplagat
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        containerHistory = new ContainerHistory();
        containerHistory.add(initialVolume);
    }
    
    public String history(){
        return containerHistory.toString();
    } 
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.containerHistory.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        this.containerHistory.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName()+ "\n" +
                            "History: " + this.history()+ "\n" +
                            "Greatest product amount: " + this.containerHistory.maxValue() + "\n" +
                            "Smallest product amount: " + this.containerHistory.minValue() + "\n" +
                            "Average: " + this.containerHistory.average() + "\n" +
                            "Greatest change: " + this.containerHistory.greatestFluctuation() + "\n" +
                            "Variance: " + this.containerHistory.variance());
        
    }
    
}
