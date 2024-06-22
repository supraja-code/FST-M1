package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		
		plane.onboard("Polymorphism");
		plane.onboard("Inheritance");
		plane.onboard("Abstraction");
		
		System.out.println("Plane took off time: " + plane.takeOff());
		
		System.out.println("People on the plane: " + plane.getPassengers());
		
		Thread.sleep(5000);
		
		plane.land();
		
		System.out.println("Plane landing time: " + plane.getLastTimeLanded());
		
		System.out.println("People on the plane after landing: " + plane.getPassengers());

	}

}
