
public class AirPlanePilot implements IntDrive {

	
	public void safelyLandVehicle() {
		System.out.println("Land aeroplane");

	}

	
	public void flyTheVehicle() {
		System.out.println("Fly with areoplane");

	}

	
	public void manouverVehicle() {
		System.out.println("Making manouwer with aeroplane");
	}

	
	public void takeOffVehicle() {
		System.out.println("taking off with aeroplane");

	}

	
	public void startEngine() {
		System.out.println("Starting aeroplane engine");

	}

	
	public void stopEngine() {
		System.out.println("Stoping aeroplane engine");

	}


	@Override
	public void autoPilot() {
		startEngine();
		takeOffVehicle();
		flyTheVehicle();
		manouverVehicle();
		safelyLandVehicle();
		stopEngine();
		
	}

}
