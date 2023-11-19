package car_dealership;

public class Vehicle {
	
	private String make;
	private String model;
	private int year; 
	private double price;
	
	static Vehicle car1;
	static Vehicle car2;
	static Vehicle car3;
	
	public Vehicle(String make, String model, int year, double price) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	
	public static void inventory() {
		car1 = new Vehicle("Toyota", "Camry", 2019, 25000);
		car2 = new Vehicle("Toyota", "Avalon", 2023, 56000);
		car3 = new Vehicle("Toyota", "Tacoma", 2021, 34000);
		
	
		System.out.println("1. " + car1.year + " " + car1.make + " " + car1.model);
		System.out.println("2. " + car2.year + " " + car2.make + " " + car2.model);
		System.out.println("3. " + car3.year + " " + car3.make + " " + car3.model);
	
		
	}
	
	public static void priceInquiry(int opt) {
		
		if(opt == 1) {
			System.out.println(car1.price);
		} else if(opt == 2) {
			System.out.println(car2.price);
		} else if(opt == 3) {
			System.out.println(car3.price);
		}
		
	}
	
	public static void carToBuy(int choice) {
		
		if(choice == 1) {
			System.out.println("Great! We are excited for your " + car1.year + " " + car1.make + " " + car1.model);
		} else if(choice == 2) {
			System.out.println("Great! We are excited for your " + car2.year + " " + car2.make + " " + car2.model);
		} else if(choice == 3) {
			System.out.println("Great! We are excited for your " + car3.year + " " + car3.make + " " + car3.model);
		}
		
	}
}
