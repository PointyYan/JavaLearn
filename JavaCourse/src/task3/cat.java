package task3;

public class cat extends animal implements pet{
	
	public String name = "cat";
	
	public  cat() {
		name();
		cry();
		eat();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
	System.out.println("Cat eats fish.");
		
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Cat cry 'meow'");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("This is a "+name);
	
	}
}