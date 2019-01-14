

public class App {

	
	public static void main(String[] args) {
		
		
		IntDrive dr = new CarDriver();
		dr.autoPilot();
		
		IntDrive dr2 = new HelicopterPilot();
		dr2.autoPilot();
		
		IntDrive dr3 = new AirPlanePilot();
		dr3.autoPilot();
		
		IntDrive dr4 = new ShipPilot();
		dr4.autoPilot();
		
		
		
	}
	
	
}
