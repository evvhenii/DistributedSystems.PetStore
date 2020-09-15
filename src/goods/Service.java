package goods;

import enums.serviceType;

public class Service {
	private final serviceType service;
	private final int price;

	public Service(serviceType service, int price){
		this.service = service;
		this.price = price;
	}
	
	public serviceType getServiceType(){
		return service;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return service + " - " + price + " Hryvnia";
	}

}
