
public class CarDriver implements IntDrive {

	
	public void startCar() {
		System.out.println("Starting car");

	}

	
	public void stopCar() {
		System.out.println("Stoping car");

	}

	
	public void driveCar() {
		System.out.println("Driving car");

	}

	
	public void changeSpeed() {
		System.out.println("Changing speed");

	}


	@Override
	public void autoPilot() {
		startCar();
		driveCar();
		changeSpeed();
		stopCar();
		
	}

}
