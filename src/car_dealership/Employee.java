package car_dealership;

import java.util.Scanner;

public class Employee{
	
	private static String name;
	private static int employeeId;
	
	public Employee(String name, int employeeId) {
		super();
		Employee.name = name;
		Employee.employeeId = employeeId;	
	}
	
	//figure this out with an object Customer instead of string
	//boolean finance, Vehicle vehicle
	public static void handleCustomer() {
		Employee.introduction();
		//Employee.processTransaction(); // try to deduct the down payment
		
	}
	
	public static void introduction() {
		
		Employee emp1 = new Employee("John", 908475);
		
		System.out.println("My name is " + Employee.name);
		System.out.println("I will be processing your transaction today.");
		System.out.println("Can I please have your name?");
		
		Scanner scan1 = new Scanner(System.in);
		String custName = scan1.nextLine();
		
		System.out.println("Great! " + custName + " Can I please have your address?");
		Scanner scan2 = new Scanner(System.in);
		String custAddress = scan2.nextLine();
		
		System.out.println("Great! Can I also have your phone number");
		Scanner scan3 = new Scanner(System.in);
		String custPhone = scan3.nextLine();
		
		System.out.println("Would you like to finance the vehicle? (Y/N)");
		Scanner scan4 = new Scanner(System.in);
		String response = scan4.next();
		
		double custCashOnHand = 0;
		
		if(response.equals("Y")) {	
			System.out.println("How much cash would you like to offer as down payment?");
			Scanner scan5 = new Scanner(System.in);
			custCashOnHand = scan5.nextDouble();	
			System.out.println("Thank you for all that information.");
			Employee.runCreditHistory();
			//Employee.processFinanceTransaction(custCashOnHand);
		} else if(response.equals("N")) {
			System.out.println("Great! We'll start with the buying process right away.");
			Employee.processCashTransaction();
		} else {
			System.out.println("Please respond with 'Y' or 'N'.");
		}
		
		Employee.gatherInformation(custName, custAddress, custPhone, custCashOnHand);		
	}
	
	public static void gatherInformation(String custName, String custAddress, String custPhone, double custCashOnHand) {
		Customer customer = new Customer();
		customer.setName(custName);
		customer.setAddress(custAddress);
		customer.setPhoneNumber(custPhone);
		customer.setCashOnHand(custCashOnHand);		
	}
	
	public static void runCreditHistory() {
		
		System.out.println("In order to finance the vehicle, we will run your credit.");
		System.out.println("This will only take a few minutes.");
		System.out.println("...");
		System.out.println("Great news! You've been approved!");	
	}
	
	public static void processFinanceTransaction(double cash, int car) {
		double carPrice = 0;
		double total = carPrice - cash;
		if(car == 1) {
			carPrice = 25000;
			System.out.println("Your finance total will be: " + total);
		} else if(car == 2) {
			carPrice = 56000;
			System.out.println("Your finance total will be: " + total);
		} else if(car == 3) {
			carPrice = 34000;
			System.out.println("Your finance total will be: " + total);
		}
		System.out.println("Thank you for purchasing your Vehicle with us!");	
	}
	
	public static void processCashTransaction() {
		System.out.println("Thank you for purchasing your Vehicle with us!");
	}
}
