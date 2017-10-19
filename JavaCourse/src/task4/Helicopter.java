package task4;

public class Helicopter extends Airplane{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Helicopter must take off.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Helicopter must land after fly.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Helicopter can fly");
	}
}
