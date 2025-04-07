package maps.assignment5;

import java.util.Map;
import java.util.TreeMap;

import maps.assignment4.Book;

import java.util.*;

public class VehicleMap {
	TreeMap<String, Vehicle> vehicles;
	Scanner sc = new Scanner(System.in);
	String newOwnerName;
	String regNo;
	public VehicleMap() {
		vehicles=new TreeMap<>();
	}
	
	public void registerNewVehicle() {
		System.out.println("Enter registration number");
		regNo=sc.nextLine();
		if(vehicles.containsKey(regNo)) {
			System.out.println("Duplicate registration number is entered");
			return;
		}
		Vehicle obj = new Vehicle();
		obj.acceptData();
		vehicles.put(regNo, obj);
		System.out.println("Vehicles registered successfully.");
	}
	
	public void checkVehicleOwnership() {
		System.out.println("Enter registration number");
		regNo=sc.nextLine();
		if(vehicles.containsKey(regNo)) {
			System.out.println("The vehicle with registration number ["+regNo+"] belongs to ["+vehicles.get(regNo).getOwner()+"]. ");
			return;
		}
		System.out.println("No vehicle found with registration number ["+regNo+"].");
	}
	
	public void removeVehicle() {
		System.out.println("Enter registration number");
		regNo=sc.nextLine();
		if(vehicles.containsKey(regNo)) {
			vehicles.remove(regNo);
			System.out.println("The vehicle with registration number ["+regNo+"] was removed from the system.");
			return;
		}
		System.out.println("The vehicle with registration number ["+regNo+"] was not found in the system. ");
	}
	
	public void updateVehicleOwner() {
		System.out.println("Enter registration number");
		regNo=sc.nextLine();
		if (!vehicles.containsKey(regNo)) {
			System.out.println("The vehicle with registration number ["+regNo+"] was not found in the system ");
			return;
		}
		System.out.println("Enter new owner name");
		newOwnerName = sc.nextLine();
//		sc.nextLine();
//		Book book = bookMap.get(isbn);
//		book.setPrice(newPrice);
		vehicles.get(regNo).setOwner(newOwnerName);
		System.out.println("Ownership of vehicle ["+vehicles.get(regNo)+"] updated to ["+vehicles.get(regNo).getOwner()+"].");
	}
	
	public void displayAllVehicles() {
		if (vehicles.isEmpty()) {
			System.out.println("No Vehicle are available in the System ");
		} else {
			System.out.println("Registered Vehicles:");
			vehicles.forEach((K, V) -> {
				System.out.println("Reg No: ["+K+"], Make: ["+V.getMake()+"], Model: ["+V.getModel()+"], Owner: ["+V.getOwner()+"] ");
			});
		}
	}
	
	public void findVehicleOwner() {
		System.out.println("Enter Owner Name");
		String owner=sc.nextLine();
		Vehicle vehicle = null;
		boolean ownerFlag = false;
		for (Map.Entry<String, Vehicle> entry: vehicles.entrySet()) {
			vehicle=entry.getValue();
			if(vehicle.getOwner().equalsIgnoreCase(owner)){
				ownerFlag=true;
				System.out.println("Reg No: ["+entry.getKey()+"], Make: ["+vehicle.getMake()+"], Model: ["+vehicle.getModel()+"] ");
			}
		}
		if(!ownerFlag) {
			System.out.println("No vehicles found for owner ["+owner+"].");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
