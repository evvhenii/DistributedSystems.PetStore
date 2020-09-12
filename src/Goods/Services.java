package Goods;

import Enums.Service;

public class Services {
	private final Service service;
	private final int price;

	public Services(Service service, int price){
		this.service = service;
		this.price = price;
	}

	@Override
	public String toString() {
		return service + " - " + price + "$";
	}

}
