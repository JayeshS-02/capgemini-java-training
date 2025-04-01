package interfaces.practice1;

interface Vehicle {
	void start();
	void stop();
	int getFuelLevel();	
	
	default String getVehicleType() {
		return "Unknown Vehicle";
	}
	
	static boolean serviceRequired() {
		return true;
	}
	
	private void log(String message) {
		System.out.println("Log: "+message);
	}
	
	default void startWithLog() {
		log("Vehicle started");
        start();
	}
}
