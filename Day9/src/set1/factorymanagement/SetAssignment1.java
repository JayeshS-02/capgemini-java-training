package set1.factorymanagement;

import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class SetAssignment1 {
	public static void main(String[] args) {

		HashSet<Integer> machineIds = new HashSet<>();
		int machineid;

		while (true) {
			System.out.println("1. Add Machine IDs\n" + "2. Check for a Machine ID\n" + "3. Delete a Machine ID\n"
					+ "4. Display the Updated List of Machine ID\n" + "5. Count Odd Machine IDs\n"
					+ "6. Exit the Program\n");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter machine ID");
				machineid = sc.nextInt();
				if (machineIds.add(machineid)) {
					System.out.println("Machine IDs added successfully");
				} else {
					System.out.println("Duplicate Machine ID");
				}
				break;

			case 2:
				System.out.println("Enter Machine id");
				machineid = sc.nextInt();
				if (machineIds.contains(machineid)) {
					System.out.println("The machine ID " + machineid + " is present in the HashSet");
				} else {
					System.out.println("The machine ID " + machineid + " is not present in the Hashset");
				}
				break;

			case 3:
//				System.out.println("");
				System.out.println("Enter Machine id");
				machineid = sc.nextInt();
				if (machineIds.contains(machineid)) {
					machineIds.remove(machineid);
					System.out.println("The machine ID " + machineid + " was removed from HashSet");
				} else {
					System.out.println("The machine ID " + machineid + " was not present in HashSet");
				}
				break;

			case 4:

				System.out.println("Updated list of machine IDs:");
				if (machineIds.isEmpty()) {
					System.out.println("No machine IDs available");
				} else {
					for (int id : machineIds) {
						System.out.println("Machine ID:" + id);
//						machineIds.forEach(E->System.out.println("Machine ID:" + E));
					}
				}
				break;

			case 5:
				int oddCount = 0;
				for (int id : machineIds) {
					if (id % 2 != 0) {
						oddCount++;
					}
				}
				System.out.println("Number of odd machine IDs: " + oddCount);
				break;

			case 6:
				sc.close();
				System.out.println("Exiting the Factory Machine Management System. Goodbye!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
