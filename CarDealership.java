/**
 * Name: Suchi Patel
 * Student ID: 500922373
 */
import java.util.*;
public class CarDealership {
    
    //Referece to an ArrayList of Car objects (Question 4)
    private ArrayList<Car> cars;
    
    //Theese three instance variables are the boolean filters (Question 4f)
    private boolean filterByElectric;
    private boolean filterByAWD;
    private boolean filterByPrice;
    
    private double minPrice;
    private double maxPrice;

    //Constructor method that creates an empty ArrayList of Car objects (Question 4a)
    public CarDealership(){
        cars = new ArrayList<Car>();
    }
    
    //Takes a reference to an array list of Car objects (newCars) as parameter and adds the car objects on this list to the instance variable array list in the CarDealership object (Question 4b)
    public void addCars(ArrayList<Car> newCars){
        cars = newCars;
    }
    
    //Removes the index car object from the array list and returns a reference to it (Question 4c)
    public Car buyCar(int index){
        Car reference;
        if(index<cars.size()){
            reference = cars.get(index);
            cars.remove(cars.get(index));
        }
        else{
            reference = null;
        }
        return reference;
    }
    
    //Takes the reference to the Car object and adds it back to the array list (Question 4d)
    public void returnCar(Car car){
        if(car!=null){
            cars.add(car);
        }
        else{
            System.out.println("The reference is null!");
        }
    }
    
    //Prints information about cars in the array list based on a set of filter values (Question 4e)
    public void displayInventory(){
        for(int i = 0; i < cars.size(); i++){
            if(filterByElectric==true && cars.get(i).power != Vehicle.PowerSource.ELECTRIC_MOTOR){
                continue;
            }
            if(filterByAWD == true && cars.get(i).getAWD() != true){
                continue;
            }
            else if(filterByPrice == true && !(cars.get(i).getPrice() >= minPrice && cars.get(i).getPrice() <= maxPrice)){
                continue;
            }
            System.out.println(Integer.toString(i)+" "+cars.get(i).display());
        }
    }
    
    //These three methods below are used to set the Boolean filters to true if it's called (Question 4f)
    public void filterByElectric(){
        filterByElectric = true;
    }
    
    public void filterByAWD(){
        filterByAWD = true;
    }
    
    public void filterByPrice(double minPrice, double maxPrice){
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        filterByPrice = true;
    }
    
    //Sets the Boolean filters to false to clear the filters (Question 4f)
    public void filtersClear(){
        filterByElectric = false;
        filterByAWD = false;
        filterByPrice = false;
    }
    
    //These three methods below are used to sort the array list of car objects based on different attributes (Question 4g)
    public void sortByPrice(){
        Collections.sort(cars);
    }
    public void sortBySafetyRating(){
        Collections.sort(cars, new SafetyRatingComparator());
    }
    public void sortByMaxRange(){
        Collections.sort(cars, new RangeComparator());
    }
    
    //These two inner classes below are to compare safety rating, and max range in order to sort them (Question 4g)
    private class SafetyRatingComparator implements Comparator<Car>{
        public int compare(Car a, Car b){
            if(a.getSafetyRating()<b.getSafetyRating()){return 1;}
            else if(a.getSafetyRating()>b.getSafetyRating()){return -1;}
            else {return 0;}
        }
    }
    private class RangeComparator implements Comparator<Car>{
        public int compare(Car a, Car b){
            if(a.getMaxRange()<b.getMaxRange()){return 1;}
            else if(a.getMaxRange()>b.getMaxRange()){return -1;}
            else {return 0;}
        }
    }
    
}
