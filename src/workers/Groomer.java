package workers;

import logManagement.*;

public final class Groomer extends Worker{

	public Groomer(String name, int age){
		super(name, age);
		final String report = "Hi! My name is " + name + ". I'm " + age 
				+ ". I can cut your dog";
		System.out.println(report);
	}

	public void service(LogEntry logEntry) {
		final String workingReport = "I'm making the order: " + logEntry.getService();
		final String askingToPay = "-You need to pay for it at the register: " 
				+ logEntry.getService().getPrice() + " Hryvnia";

		System.out.println(workingReport);
		System.out.println(askingToPay);
	}	
}

