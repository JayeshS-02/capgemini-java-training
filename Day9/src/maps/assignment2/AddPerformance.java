package maps.assignment2;

//import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AddPerformance {
	public static void main(String[] args) {
		Map<Integer, Integer> advertise = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int addID , clicks;

		while(true) {
			System.out.println("\n1. Register New Ads\n"
					+ "2. Check Ad Performance\n"
					+ "3. Remove an Ad Record\n"
					+ "4. Update Click Count for an Ad\n"
					+ "5. Display Ads Sorted by ID\n"
					+ "6. Find the Most Popular Ad\n"
					+ "7. Exit the Program\n");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Ad ID");
				addID = sc.nextInt();
				if(advertise.containsKey(addID)) {
					System.out.println("Duplicate Ad ID");
					break;
				}
				System.out.println("Enter click counts");
				clicks = sc.nextInt();
				advertise.put(addID, clicks);
				System.out.println("Ads registered successfully\n");
				break;
				
				
			case 2:
				System.out.println("Enter an Ad ID to check whether it exists and retrieve its click count");
				addID=sc.nextInt();
				if(advertise.containsKey(addID)) {
					System.out.println("The Ad ID ["+addID+"] has ["+advertise.get(addID)+"] clicks");
				}
				else {
					System.out.println("The Ad ID ["+addID+"] is not present in the system");
				}
				break;
				
				
			case 3:
				System.out.println("Enter an Ad ID to remove its record from the system");
				addID=sc.nextInt();
				if(advertise.containsKey(addID)) {
					advertise.remove(addID);
					System.out.println("The Ad ID ["+addID+"] was removed from the system");
				}
				else {
					System.out.println("The Ad ID ["+addID+"] was not found in the system");
				}
				break;
				
			case 4:
				System.out.println("Enter an Ad ID and provides a new click count to update its performance");
				addID=sc.nextInt();
				if(advertise.isEmpty()) {
					System.out.println("The Ad ID ["+addID+"] was not found in the system");
				}
				else if(advertise.containsKey(addID)){
					System.out.println("Enter click counts");
					clicks = sc.nextInt();
					advertise.put(addID, clicks);
					System.out.println("The Ad ID ["+addID+"] click count updated to ["+advertise.get(addID)+"].");
				}
				break;
				
			case 5:
				if(advertise.isEmpty()) {
					System.out.println("No ad records available in the system.\n");
					break;
				}
				else {
					advertise.forEach((key,value)->System.out.println("Campaign ID: ["+key+"], Budget: ["+value+"] "));
				}
				break;
				
			case 6:
				int maxClick=0;
				int adId=-1;
				if(advertise.isEmpty()) {
					System.out.println("No ads available to determine the most popular one");
				}
				else {
					for(Map.Entry<Integer, Integer> entry: advertise.entrySet()) {
						if(entry.getValue()>maxClick) {
							maxClick=entry.getValue();
							adId=entry.getKey();
						}
					}
					System.out.println("The most popular Ad is ["+adId+"] with ["+maxClick+"] clicks. ");
				}
				break;
				
			case 7:
				System.out.println("Exiting the Digital Marketing Ad Performance Tracker. Goodbye!");
				sc.close();
				System.exit(0);
				break;
				
			default:
					System.out.println("Invalid Entry");
					break;
				
			}
		}
	}
}
