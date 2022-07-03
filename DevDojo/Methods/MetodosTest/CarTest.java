package MetodosTest;


import MetodosDomain.Car;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setNome("ferrari do pai");
		System.out.println(Car.MAX_VELOCITY);
		System.out.println(car.BUYER);
		car.BUYER.setName("dinheirudo");
		System.out.println(car.BUYER);
	}
}
