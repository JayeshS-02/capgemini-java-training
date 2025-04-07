package set4.assignemnt;
import java.util.Scanner;

public class DeviceManagement {
	public static void main(String[] args) {
		DeviceSet ds = new DeviceSet();
		Scanner sc=new Scanner(System.in);
		int deviceID;
		String deviceType;
		while(true) {
			System.out.println("\n1. Add Devices\n"
					+ "2. Check for a Device\n"
					+ "3. Delete a Device\n"
					+ "4. Display All Devices\n"
					+ "5. Count Devices by Type\n"
					+ "6. Exit\n");
			
			int choice =sc.nextInt();
			switch(choice) {
			
			case 1:
				ds.addDevice();
				break;
				
			case 2:
				System.out.println("Enter Device id to be checked");
				deviceID=sc.nextInt();
				ds.checkDevice(deviceID);
				break;
				
			case 3:
				System.out.println("Enter Device id to be removed");
				deviceID=sc.nextInt();
				ds.removeDevice(deviceID);
				break;
				
			case 4:
				ds.displayAllDevice();
				break;
				
			case 5:
				System.out.println("Enter Device Type to get Count");
				deviceType=sc.nextLine();
				ds.countDeviceByType(deviceType);
				break;
				
			case 6:
				sc.close();
				System.out.println("Program Terminated Successfully");
				System.exit(0);
				break;
				
			default:
				break;
			}
		}
		
	}
}
