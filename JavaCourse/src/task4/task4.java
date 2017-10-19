package task4;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airplane helicopter = new Helicopter();
		helicopter.takeoff();
		helicopter.fly();
		helicopter.land();
		
		System.out.println("------------------");
		
		SeaPlane seaPlane = new SeaPlane();
		seaPlane.dock();
		seaPlane.cruise();
		
		System.out.println("------------------");
		
		RiverBarge riverBarge = new RiverBarge();
		riverBarge.dock();
		riverBarge.cruise();
	}

}
