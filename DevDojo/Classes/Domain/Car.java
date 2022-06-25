package Domain;

public class Car {
	private String brand;
	private double maxVelocity;
	private static double limVelocity = 250;
	
	
	
	public Car(String brand, double maxVelocity) {
		this.brand = brand;
		this.maxVelocity = maxVelocity;
	}

	public void construct(){
		System.out.println("---------");
		System.out.println("Brand " + this.brand);
		System.out.println("Maximum velocity " + this.maxVelocity);
		System.out.println("Limit velocity " + Car.limVelocity);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getMaxVelocity() {
		return maxVelocity;
	}
	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	public static double getLimVelocity() {
		return limVelocity;
	}
	public static void setLimVelocity(double limVelocity) {
		Car.limVelocity = limVelocity;
	}
	
}
