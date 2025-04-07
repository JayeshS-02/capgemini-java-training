package set4.assignemnt;

import java.util.HashSet;

public class DeviceSet {
	HashSet<Device> deviceSet;
	
	public DeviceSet() {
		deviceSet=new HashSet<Device>();
	}
	
	public void addDevice() {
		Device d = new Device();
		d.acceptData();
		if(deviceSet.add(d)) {
			System.out.println("Devices added successfully.");
		}
		else {
			System.out.println("Duplicate Devices.");	
		}
	}
	
	
	public void checkDevice(int deviceID) {
		for(Device device:deviceSet) {
			if(device.getDeviceID()==deviceID) {
				System.out.println(": The device with ID ["+deviceID+"] is present in the HashSet");
				return;
			}
		}
		System.out.println(": The device with ID ["+deviceID+"] is not present in the HashSet");		
	}
	
	
	public void removeDevice(int deviceID) {
		boolean result = deviceSet.removeIf((E)->E.getDeviceID()==deviceID);
		if(result) {
			System.out.println("The device with ID [deviceID] was removed from the HashSet");
		}
		else {
			System.out.println("The device with ID [deviceID] was not found in the HashSet");
		}
	}
	
	
	public void displayAllDevice() {
		if(deviceSet.isEmpty()) {
			System.out.println("No devices available");
			return;
		}
		deviceSet.forEach(System.out::println);
	}
	
	public int countDeviceByType(String type) {
		int count=0;
		for(Device device:deviceSet) {
			if(device.getDeviceType().equalsIgnoreCase(type)) {
				count++;
			}
		}
		return count;
	}
	
}
