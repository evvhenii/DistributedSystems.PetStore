package logManagement;

import goods.Service;

public class LogEntry {
	private final String name;
	private final String mobileNumber;
	private final Service service;

	public LogEntry(String name, String mobileNumber, Service service) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.service = service;
	}

	public Service getService() {
		return service;
	}

	public String getName() {
		return name;
	}

	public boolean isFree() {
		return name == "_____";
	}

	@Override
	public String toString() {
		return name == null ? "Empty" : name + "\t" + mobileNumber + "\t" + service;
	}
}
