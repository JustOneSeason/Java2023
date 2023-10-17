package ch7;

public class Car {
	
	double speed = 0.0;
	double position = 0.0;
	
	
	public Car() {}
	Car(double speed, double position){
		this.speed = speed;
		this.position = position;
	}
	
	
	public void Setspeed(double speed) {
		this.speed = speed;
	}
	
	public void Move() {
		position += speed;
	}
}
