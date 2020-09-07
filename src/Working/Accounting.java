package Working;

import Goods.*;

final class Accounting {
	private static int numberOfCats = 0;
	private static int numberOfDogs = 0;
	private static int numberOfFrogs = 0;
	private static int numberOfParrots = 0;
	private static int numberOfFishes = 0;

	private static int numberOfLeashes = 0;
	private static int numberOfFeed = 0;
	private static int numberOfCages = 0;

	public static int getNumberOfCats() {
		return numberOfCats;
	}

	public static int getNumberOfDogs() {
		return numberOfDogs;
	}

	public static int getNumberOfFrogs() {
		return numberOfFrogs;
	}

	public static int getNumberOfParrots() {
		return numberOfParrots;
	}

	public static int getNumberOfFishes() {
		return numberOfFishes;
	}

	public static int getNumberOfLeashes() {
		return numberOfLeashes;
	}

	public static int getNumberOfFeed() {
		return numberOfFeed;
	}

	public static int getNumberOfCages() {
		return numberOfCages;
	}

	public static Pet buyPet(Pet pet) {
		switch(pet.getBreed()) {
		case CAT:
			Accounting.numberOfCats++;
			break;
		case DOG:
			Accounting.numberOfDogs++;
			break;
		case FROG:
			Accounting.numberOfFrogs++;
			break;
		case PARROT:
			Accounting.numberOfParrots++;
			break;
		case FISH:
			Accounting.numberOfFishes++;
			break;
		}

		System.out.println("Pet Store got a " + pet.getColor() + " " + pet.getSize() + 
				" " + pet.getBreed() + " " + pet.getName() +
				". It costs " + pet.getPrice() + ".");

		return pet;
	}

	public static void sell(Pet pet) {
		switch(pet.getBreed()) {
		case CAT:
			Accounting.numberOfCats--;
			break;
		case DOG:
			Accounting.numberOfDogs--;
			break;
		case FROG:
			Accounting.numberOfFrogs--;
			break;
		case PARROT:
			Accounting.numberOfParrots--;
			break;
		case FISH:
			Accounting.numberOfFishes--;
			break;
		}

		CashRegister.sell(pet);	
	};

	public static Accessory buyAccessory(Accessory accessory) {
		switch(accessory.getType()) {
		case LEASH:
			Accounting.numberOfLeashes++;
			break;
		case FEED:
			Accounting.numberOfFeed++;
			break;
		case CAGE:
			Accounting.numberOfCages++;
			break;
		}

		System.out.println("Pet Store got a " + accessory.getColor() + " " + 
				accessory.getSize() + " " + accessory.getType() + 
				". It costs " + accessory.getPrice() + ".");

		return accessory;
	}

	public static void sell(Accessory accessory) {
		switch(accessory.getType()) {
		case LEASH:
			Accounting.numberOfLeashes--;
			break;
		case FEED:
			Accounting.numberOfFeed--;
			break;
		case CAGE:
			Accounting.numberOfCages--;
			break;
		}

		CashRegister.sell(accessory);
	};
}
