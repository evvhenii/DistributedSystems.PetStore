package Workers;

import Registration.*;

public final class Groomer extends Worker{

	public Groomer(String name, int age){
		super(name, age);
		System.out.println("Hi! My name is " + name + ". I'm " + age 
				+ ". I can cut your dog");
	}

	public void service(LogEntry logEntry) {
		System.out.println("I'm making the order: " + logEntry.getService());
		System.out.println("-You need to pay for it at the register: " 
				+ logEntry.getPrice() + " Hryvnia");
	}	
}

