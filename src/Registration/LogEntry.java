package Registration;

import Enums.Service;

public class LogEntry {
	private final String name;
	private final String mobileNumber;
	private final Service service; 
	private final int price; 

	public LogEntry(String name, String mobileNumber, Service service, int price) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.service = service;
		this.price = price;
	}

	public Service getService() {
		return service;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public boolean isFree() {
		return name == "Empty";
	}

	@Override
	public String toString() {
		return name == null ? "Empty" : name + "\t" + mobileNumber + "\t" + service + "\t" + price + " Hryvnia";
	}
}
