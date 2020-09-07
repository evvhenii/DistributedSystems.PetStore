package Workers;

public final class Cleaner extends Worker{
	public Cleaner(String name, int age) {
		super(name, age);
	}

	public void work() {
		System.out.println("Hello! My name is " + super.getName() + 
				" .I'm " + super.getAge() + " .I'm cleaning");
	}
}
