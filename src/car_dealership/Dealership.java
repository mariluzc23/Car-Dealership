
package car_dealership;
import java.util.*;

public class Dealership {

	public static void main(String[] args) {
		
		mainMenu();
		
			Scanner scan1 = new Scanner(System.in);
			int optionSelected = scan1.nextInt();
			
			if(optionSelected == 1) {
				System.out.println("Great! Here are the vehicles we have currently:");
				Vehicle.inventory();
				menu();
				
				
			} else if(optionSelected == 2) {
				System.out.println("Great!");
				System.out.println("Which vehicle would you like to see the price of?");
				Vehicle.inventory();
					Scanner scan2 = new Scanner(System.in);
					int option2 = scan2.nextInt();
					Vehicle.priceInquiry(option2);
				
				System.out.println("What would you like to do next?");
				menu();
				
				
			} else if(optionSelected == 3) {
				System.out.println("Great, we are very excited for you!");
				System.out.println("Which vehicle would you like to buy?");
				Vehicle.inventory();
					Scanner scan3 = new Scanner(System.in);
					int option3 = scan3.nextInt();
					Vehicle.carToBuy(option3);
					Employee.handleCustomer();	
			}
			
		}
			
	
	public static void mainMenu() {	
		
		System.out.println("Hi! Welcome to our Dealership.");
		System.out.println("Please select an option from our menu: ");
		System.out.println("1.See Inventory");
		System.out.println("2.See Vehicle Prices");
		System.out.println("3.Buy Vehicle");
	}
	
	public static void menu() {
		
		System.out.println("Please select an option from our menu: ");
		System.out.println("1. See Inventory ");
		System.out.println("2.See Vehicle Prices");
		System.out.println("3.Buy Vehicle");
		
			Scanner scan1 = new Scanner(System.in);
			int nextOption = scan1.nextInt();
			
			if(nextOption == 1) {
				System.out.println("Great! Here are the vehicles we have currently:");
				Vehicle.inventory();
				menu();	
			} else if(nextOption == 2) {
				System.out.println("Great!");
				System.out.println("Which vehicle would you like to see the price of?");
				Vehicle.inventory();
				Scanner scan2 = new Scanner(System.in);
				int option2 = scan2.nextInt();
				Vehicle.priceInquiry(option2);
				menu();
				
			} else if(nextOption == 3){
				System.out.println("Great, we are very excited for you!");
				System.out.println("Which vehicle would you like to buy?");
				Vehicle.inventory();
				Scanner scan3 = new Scanner(System.in);
				int option3 = scan3.nextInt();
				Vehicle.carToBuy(option3);
				Employee.handleCustomer();
				Employee.processFinanceTransaction(nextOption, option3);
				
			}
		}
	}



