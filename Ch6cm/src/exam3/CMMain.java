package exam3;
import Cheolman.Car;


public class CMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		Byunghyun.Car car3 = new Byunghyun.Car();
		
		car.SetSpeed(20);
		
		
		//System.out.println("Car speed is " + car.speed);
		//System.out.println("Car position is " + car.positionX);
		//System.out.println("Number of Cars is" + car.numOfCars);
		
		Calculator cal = new Calculator();
//		System.out.println("pi is "+ cal.pi);
//		System.out.println("pi is "+ Calculator.pi);
		
		System.out.println("2 + 3 is " + Calculator.plus(2, 3));
		//Calculator.SetColor("Blue");
		cal.SetColor("Blue");
		CMMain main = new CMMain();
		
	}
	
	void sayHi() {
		System.out.println("Hi");
	}

}
