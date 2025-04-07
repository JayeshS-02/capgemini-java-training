package maps.assignment1;

import java.util.*;
import java.util.Scanner;

public class Campaign {
	public static void main(String[] args) {
		HashMap<Integer, Integer> campaigns = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int campaignID , budget;
		
		while(true) {
			System.out.println("\n1. Add Advertising Campaigns\n"
					+ "2. Check if a Campaign Exists\n"
					+ "3. Remove an Advertising Campaign\n"
					+ "4. Display the Updated List of Advertising Campaigns\n"
					+ "5. Calculate Average Campaign Budget\n"
					+ "6. Exit the Program\n");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Campaign ID");
				campaignID = sc.nextInt();
				if(campaigns.containsKey(campaignID)) {
					System.out.println("Duplicate Campaign ID");
					break;
				}
				System.out.println("Enter Campaign Budget");
				budget = sc.nextInt();
				campaigns.put(campaignID, budget);
				System.out.println("Campaigns added successfully.\n");
				break;
				
				
			case 2:
				System.out.println("Enter a campaign ID to check whether it exists in the system");
				campaignID=sc.nextInt();
				if(campaigns.containsKey(campaignID)) {
					System.out.println("The campaign ID ["+campaignID+"] is present in the system");
				}
				else {
					System.out.println("The campaign ID ["+campaignID+"] is not present in the system");
				}
				break;
				
				
			case 3:
				System.out.println("Enter a campaign ID  to remove it from the system");
				campaignID=sc.nextInt();
				if(campaigns.containsKey(campaignID)) {
					campaigns.remove(campaignID);
					System.out.println("The campaign ID ["+campaignID+"] was removed from the system");
				}
				else {
					System.out.println("The campaign ID ["+campaignID+"] was not found int the system");
				}
				break;
				
			case 4:
				if(campaigns.isEmpty()) {
					System.out.println("No campaigns available in the system");
				}
				else{
					System.out.println("Updated list of campaigns:");
					campaigns.forEach((k,v)->System.out.println("Campaign ID: ["+k+"], Budget: ["+v+"] "));
				}
				break;
				
			case 5:
				if(campaigns.isEmpty()) {
					System.out.println("No campaigns available to calculate the average budget");
					break;
				}
				else {
					float total = 0,avg=0;
					for(Map.Entry<Integer, Integer>entry : campaigns.entrySet()) {
						total+=entry.getValue();
					}
					avg = total/campaigns.size();
					System.out.printf("Average Budget of All Campaigns: %.2f\n",avg);
				}
				break;
				
			case 6:
				System.out.println("Exiting the Advertising Campaign Budget Management System. Goodbye!");
				sc.close();
				System.exit(0);
				break;
			default:
					break;
				
			}
		}
	}
}
