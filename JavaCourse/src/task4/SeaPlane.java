package task4;

public class SeaPlane extends Airplane implements Sailer{

	@Override
	public void dock() {
		// TODO Auto-generated method stub
		System.out.println("Seaplane is in dock. ");
	}

	@Override
	public void cruise() {
		// TODO Auto-generated method stub
		System.out.println("Seaplane can take people to fly.");
	}

}
