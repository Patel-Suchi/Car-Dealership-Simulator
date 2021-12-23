/**
 * Name: Suchi Patel
 * Student ID: 500922373
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipSimulator 
{
  public static void main(String[] args)
  {
	  // Create a CarDealership object (Question 5)
      CarDealership carDealership = new CarDealership();
         // Creates a Car object to check the reference.
      Car reference = null;
	  // Then create an (initially empty) array list of type Car
      ArrayList<Car> newCars = new ArrayList<Car>();
      // Then create some new car objects of different types
	  // See the cars file for car object details
	  // Add the car objects to the array list
      // The ADD command should hand this array list to CarDealership object via the addCars() method	  
	newCars.add(new Car("Toyota", "blue", Car.Model.SEDAN, Vehicle.PowerSource.GAS_ENGINE, 9.5, 500, false, 25000));
        newCars.add(new Car("Honda", "red", Car.Model.SPORTS, Vehicle.PowerSource.GAS_ENGINE, 9.2, 450, false, 30000));
        newCars.add(new Car("Kia", "white", Car.Model.MINIVAN, Vehicle.PowerSource.GAS_ENGINE, 9.7, 550, false, 20000));
        newCars.add(new Car("BMW", "black", Car.Model.SEDAN, Vehicle.PowerSource.GAS_ENGINE, 9.6, 600, true, 55000));
        newCars.add(new ElectricCar("Tesla", "red", Car.Model.SEDAN, Vehicle.PowerSource.ELECTRIC_MOTOR, 9.1, 425, true, 85000, 30));
        newCars.add(new Car("Chevy", "red", Car.Model.MINIVAN, Vehicle.PowerSource.GAS_ENGINE, 9.25, 475, false, 40000));
        newCars.add(new ElectricCar("ChevyVolt", "green", Car.Model.SEDAN, Vehicle.PowerSource.ELECTRIC_MOTOR, 8.9, 375, true, 37000, 45));
        newCars.add(new Car("Bentley", "black", Car.Model.SEDAN, Vehicle.PowerSource.GAS_ENGINE, 9.8, 575, false, 150000));
        newCars.add(new ElectricCar("NissanLeaf", "green", Car.Model.SEDAN, Vehicle.PowerSource.ELECTRIC_MOTOR, 8.8, 325, true, 32000, 55));
	  // Create a scanner object
	  Scanner scan = new Scanner(System.in);
          //Initializes the input
          String input = "";
	  // this while loop checks if input is NOT 'Q' or 'q'
          while(!input.equalsIgnoreCase("Q")){
              System.out.print(">"); //Prints out '>' to indicate that this line is where user inputs command
	  //    read the input line
              input=scan.nextLine();
	  //    create another scanner object (call it "commandLine" or something) using the input line instead of System.in
              Scanner commandLine = new Scanner(input);
	  //    read the next word from the commandLine scanner
              String readCommand = ""; 
              readCommand = commandLine.next();
      //	check if the word (i.e. string) is equal to one of the commands and if so, call the appropriate method via the CarDealership object 
              //If user enters "L" then the program calls the dealership object’s displayInventory() method (Question 5a) 
              if(readCommand.equalsIgnoreCase("L")){
                carDealership.displayInventory();
              }
              //If user enters "Q" then the program quits (Question 5b)
              else if(readCommand.equalsIgnoreCase("Q")){
                  System.out.print("Program quit!");
              }
              //If the user enters "BUY" then the program reads an integer from the current input line that represents an index of a car the user wants to buy, it calls the dealership object's buyCar() method (Question 5c)
              else if(readCommand.equalsIgnoreCase("BUY")){
                  String index = commandLine.next();
                  reference = carDealership.buyCar(Integer.parseInt(index));
              }
              //If the user enters "RET" then the program returns the last car that was bought. See class CarDealership returnCar() method (Question 5d)
              else if(readCommand.equalsIgnoreCase("RET")){
                  carDealership.returnCar(reference);
                  reference=null;
              }
              //If the user enters "ADD" then the program uses class CarDealership’s addCars() method to add the array list of car objects you created to the dealership object’s array list (Question 5e)
              else if(readCommand.equalsIgnoreCase("ADD")){
                  carDealership.addCars(newCars);
              }
              //Calls the dealership object's sortByPrice() method (Question 5f)
              else if(readCommand.equalsIgnoreCase("SPR")){
                  carDealership.sortByPrice();
              }    
              //Calls the dealership object's sortBySafetyRating() method (Question 5f)
              else if(readCommand.equalsIgnoreCase("SSR")){
                  carDealership.sortBySafetyRating();
              } 
              //Calls the dealership object's sortByMaxRange() method (Question 5f)              
              else if(readCommand.equalsIgnoreCase("SMR")){
                  carDealership.sortByMaxRange();
              } 
              //Calls the dealership object's filterByPrice() method and enters the minPrice and maxPrice (Question 5g)                            
              else if(readCommand.equalsIgnoreCase("FPR")){
                  Double minPrice = Double.parseDouble(commandLine.next());
                  Double maxPrice = Double.parseDouble(commandLine.next());
                  carDealership.filterByPrice(minPrice, maxPrice);
              } 
              //Calls the dealership object's filterByElectric() method and enters the minPrice and maxPrice (Question 5g)                                          
              else if(readCommand.equalsIgnoreCase("FEL")){
                  carDealership.filterByElectric();
              } 
              //Calls the dealership object's filterByAWD() method (Question 5g)                                                        
              else if(readCommand.equalsIgnoreCase("FAW")){
                  carDealership.filterByAWD();
              } 
              //Calls the dealership object's filtersClear() method (Question 5g)                                                                      
              else if(readCommand.equalsIgnoreCase("FCL")){
                  carDealership.filtersClear();
              } 
              //Handles commands that is not recognized (Question 5h)
              else{
                  System.out.println("This command is INVALID! Try again.");
              }
	 }
  }
}