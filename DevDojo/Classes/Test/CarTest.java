package Test;

import Domain.Car;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("BMW" , 280);
		Car car2 = new Car("Mercedes" , 300);
		Car car3 = new Car("Audi" , 290);
		
		Car.setLimVelocity(180);
		car1.construct();
		car2.construct();
		car3.construct();
	}
}
