package set1.factorymanagement;

import java.util.HashSet;
import java.util.Scanner;

public class SetAssignment2 {
	public static void main(String[] args) {
		HashSet<String> licenceIds = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String licNo;

		while (true) {
			System.out.println("1. Park a Vehicle (Add License Plate)\n" + "2. Check if a Vehicle is Parked\n"
					+ "3. Remove a Vehicle (Unpark)\n" + "4. Display All Parked Vehicles\n"
					+ "5. Count Vehicles with Odd-Ending License Plates\n" + "6. Exit the Program\n");

//			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {

			case 1:
				System.out.println("Enter license plate number");
				licNo = sc.nextLine();
				if (licenceIds.add(licNo)) {
					System.out.println("Vehicle with license plate [" + licNo + "] parked successfully");
				} else {
					System.out.println("Vehicle with license plate [" + licNo + "] is already parked");
				}
				break;

			case 2:
				System.out.println("Enter license plate number");
				licNo = sc.nextLine();
				if (licenceIds.contains(licNo)) {
					System.out.println("The vehicle with license plate [" + licNo + "] is parked in the lot");
				} else {
					System.out.println("The vehicle with license plate [" + licNo + "] is not in the lot");
				}
				break;

			case 3:
				System.out.println("Enter license plate number");
				licNo = sc.nextLine();
				if (licenceIds.contains(licNo)) {
					licenceIds.remove(licNo);
					System.out.println("The vehicle with license plate ["+licNo+"] has left the parking lot.");
				} else {
					System.out.println("The vehicle with license plate ["+licNo+"] was not found in the parking lot.");
				}
				break;

			case 4:
				if (licenceIds.isEmpty()) {
					System.out.println("No vehicles are parked in the lot.");
				}
				for(String st : licenceIds) {
					System.out.println("License Plate: ["+st+"]");
				}
				break;

			case 5:
				int oddCount=0;
				for(String s : licenceIds) {
					if(s.endsWith("1")||s.endsWith("3")||s.endsWith("5")||s.endsWith("7")|| s.endsWith("9")) {
						oddCount++;
					}
				}
				System.out.println("Number of vehicles with odd-ending license plates: [" + oddCount+"]");
				break;

			case 6:
				sc.close();
				System.out.println("Exiting the Vehicle Parking Management System. Goodbye!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
