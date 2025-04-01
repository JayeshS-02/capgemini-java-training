package interfaces.practice1;

class Car implements Vehicle{
	
	protected int fuelLevel = 100;
	
	@Override
	public void start() {
		System.out.println("Car is starting");
	}
	@Override
	public void stop() {
		System.out.println("Car is stopping");	
	}
	
	@Override
	public int getFuelLevel() {
		return fuelLevel;
	}
	
	public String getVehicleType() {
		return "Car";
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.getFuelLevel();
		
		System.out.println("Vehicle type : "+c.getVehicleType());
		System.out.println("Service Required : "+ Vehicle.serviceRequired());
		
		c.startWithLog();
	}
	
	
}
