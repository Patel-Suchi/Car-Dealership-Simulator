/**
 * Name: Suchi Patel
 * Student ID: 500922373
 */
public class Vehicle {
    
    //Instance variables for class Vehicle (Question 1)
    private String mfr; 
    private String color; 
    public PowerSource power;
    private int numWheels; 
    //Enum constants set for the PowerSource power (Question 1)
    public static enum PowerSource{
        GAS_ENGINE, DIESEL_ENGINE, ELECTRIC_MOTOR;
    }
    
    //Constructor methods to initialize the Vehicle instance variables (Question 1a)
    public Vehicle(){
        mfr = "";
        color = "";
    }
    public Vehicle(String mfr, String color, int numWheels, PowerSource power){
        this.mfr = mfr;
        this.color = color;
        this.numWheels = numWheels;
        this.power = power;
    }
    
    //These below Get and Set methods for the instance variables (Question 1b)
    public void setMfr(String mfr){
        this.mfr = mfr;
    }
    public String getMfr(){
        return mfr;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    public void setPower(PowerSource power){
        this.power = power;
    }
    public PowerSource getPower(){
        return power;
    }
    
    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }
    public int getNumWheels(){
        return numWheels;
    }
    
    //Checks if mfg, power, and numWheels are equal with this and the other vehicle object (Question 1c)
    public boolean equals(Object other){
        Vehicle otherVehicle = (Vehicle) other ;
        return this.mfr == otherVehicle.mfr && this.power == otherVehicle.power && this.numWheels == otherVehicle.numWheels;
    }
    
    //Returns a string containing the manufaturer (mfr) name and color, separated by a space (Question 1d)
    public String display(){
        return mfr+" "+color;
    }          
}
