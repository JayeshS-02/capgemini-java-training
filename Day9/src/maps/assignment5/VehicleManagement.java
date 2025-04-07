package maps.assignment5;

import java.util.Scanner;

import maps.assignment4.BookMap;

public class VehicleManagement {
	public static void main(String[] args) {
		VehicleMap vehicleData = new VehicleMap();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n1. Register New Vehicles \n"
					+ "2. Check Vehicle Ownership \n"
					+ "3. Remove a Vehicle from Records \n"
					+ "4. Update Owner of a Vehicle \n"
					+ "5. Display All Vehicles (Sorted Order) \n"
					+ "6. Find Vehicle by Owner \n"
					+ "7. Exit the Program \n");
			
			int choice = sc.nextInt();
			switch(choice) {
				
			case 1:
				vehicleData.registerNewVehicle();
				break;
				
			case 2:
				vehicleData.checkVehicleOwnership();
				break;
				
			case 3:
				vehicleData.removeVehicle();
				break;
				
			case 4:
				vehicleData.updateVehicleOwner();
				break;
				
			case 5:
				vehicleData.displayAllVehicles();
				break;
				
			case 6:
				vehicleData.findVehicleOwner();
				break;
				
			case 7:
				System.out.println("Exiting the Vehicle Registration Management System. Goodbye!");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
