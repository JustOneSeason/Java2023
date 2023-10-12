package Cheolman;

public class Car {
	static int numOfCars = 0;
	static double maxSpeed = 100;
	static double minSpeed = 0;
	
	private double speed;
	double positionX = 0.0;

	
	public Car(){
		numOfCars++;
	}
	
	
	public void SetSpeed(double speed) {
		if(speed > 100) speed = maxSpeed;
		if(speed < minSpeed) speed = minSpeed;
		this.speed = speed;
	}
	
	public void PushRightArrow() {
		positionX += speed;
	}
}
