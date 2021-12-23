/**
 * Name: Suchi Patel
 * Student ID: 500922373
 */
public class ElectricCar extends Car{
    
    //Instance variables for class ElectricCar (Question 3)
    private int rechargeTime;
    private String batteryType; 

    //Constructor method with parameters that initializes the classes from class Car and the inherited variables from class Vehicle (Question 3a)
    public ElectricCar(String mfr, String color, Model model, PowerSource power, double safetyRating, int maxRange, boolean AWD, double price, int rechargeTime) {
        super(mfr, color, model, power, safetyRating, maxRange, AWD, price);
        this.rechargeTime = rechargeTime;
        batteryType = "Lithium";
    }
    
    //Public methods to Get and Set the new instance variables (Question 3b)
    public void setRechargeTime(int rechargeTime){
        this.rechargeTime = rechargeTime;
    }
    public int getRechargeTime(){
        return rechargeTime;
    }
    
    public void setBatteryType(String batteryType){
        this.rechargeTime = rechargeTime;
    }
    public String getBatteryType(){
        return batteryType;
    }
    
    //Returns the string from the display() method from class Car and adds the string instance variables from this ElectricCar class (Question 3c)
    @Override
    public String display(){
        return super.display()+" EL, BAT: "+batteryType+" RCH: "+rechargeTime;
    }
}
