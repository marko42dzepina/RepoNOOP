
public class HelicopterPilot implements IntDrive{

	
	public void safelyLandVehicle() {
		System.out.println("Land helicopter");

	}

	
	public void flyTheVehicle() {
		System.out.println("Fly with helicopter");

	}

	
	public void manouverVehicle() {
		System.out.println("Making manouwer with helicopter");
	}

	
	public void takeOffVehicle() {
		System.out.println("taking off with helicopter");

	}

	
	public void startEngine() {
		System.out.println("Starting helicopter engine");

	}

	
	public void stopEngine() {
		System.out.println("Stoping helicopter engine");

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
