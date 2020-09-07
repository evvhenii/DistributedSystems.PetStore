package Goods;

import Enums.*;

public final class Pet{
	private final Breed breed;
	private final String name;
	private final Color color;
	private final Size size;
	private final int price;

	public Pet(Breed breed, String name, Color color, Size size, int price){
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public Breed getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}
}
