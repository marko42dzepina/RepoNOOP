
public class ShipPilot implements IntDrive{

	
	public void navigateBoat() {
		System.out.println("navigating ship");

	}

	
	public void sailIntoHarbor() {
		System.out.println("Sailing to harbor");

	}

	
	public void sailOutHarbor() {
		System.out.println("Sailing out of harbor");

	}

	
	public void startEngines() {
		System.out.println("Starting ship engines");

	}

	
	public void stopEngines() {
		System.out.println("Stoping ships engines");

	}


	@Override
	public void autoPilot() {
		startEngines();
		sailOutHarbor();
		navigateBoat();
		sailIntoHarbor();
		stopEngines();
		
	}

}
