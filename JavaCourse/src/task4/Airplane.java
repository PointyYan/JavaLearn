package task4;

public abstract class Airplane extends Vehicle	implements Flyer{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Airplane must take off.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airpanle must land after fly.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane can fly");
	}

	
}
