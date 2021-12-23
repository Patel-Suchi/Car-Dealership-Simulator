/**
 * Name: Suchi Patel
 * Student ID: 500922373
 */
public class Car extends Vehicle implements Comparable{

    //Instance variables for class Car (Question 2)
    Model model;
    private int maxRange;
    private double safetyRating;
    private boolean AWD;
    private double price;
    //Enum constants set for the Model model (Question 2)
    public static enum Model{
        SEDAN, SUV, SPORTS, MINIVAN; 
    }

    //Constructor method with parameters to initialize the Car instance variables (Question 2a)
    public Car(String mfr, String color, Model model, PowerSource power, double safetyRating, int maxRange,  boolean AWD, double price){
        super.setMfr(mfr);
        super.setColor(color);
        super.setPower(power);
        this.model = model;
        this.safetyRating = safetyRating;
        this.maxRange = maxRange;
        this.AWD = AWD;
        this.price = price;
    }
    
    public void setMaxRange(int maxRange){
        this.maxRange = maxRange;
    }
    public int getMaxRange(){
        return maxRange;
    }
    
    public void setSafetyRating(double safetyRating){
        this.safetyRating = safetyRating;
    }
    public double getSafetyRating(){
        return safetyRating;
    }
    
    public void setAWD(boolean AWD){
        this.AWD = AWD;
    }
    public boolean getAWD(){
        return AWD;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    
    //Returns the string variables from the Vehicle class and adds the new string variables from this Car class (Question 2b)
    @Override
    public String display(){
        return super.display()+" "+model+" "+price+"$ SF: "+safetyRating+" RNG: "+maxRange;
    }
    
    //Checks if the model and AWD are equal with the other Car object, also checks if the equals method from Vehicle class is true (Question 2c)
    public boolean equals(Object other){
        Car otherCar = (Car)other;
        if (super.equals(other) && this.model == otherCar.model && this.AWD == otherCar.AWD){
    	  return true;
        }
        else{
    	  return false;
        }  
    }

    //Compares the price with this Car object and the other Car object (Question 2d)
    public int compareTo(Object other){  
        Car otherCar= (Car)other;
        if(this.price>otherCar.price){
            return 1;
        }
        else if (this.price<otherCar.price){
            return -1;
        }
        else{ //this.price==otherCar.price
            return 0;
        }
    }

}
