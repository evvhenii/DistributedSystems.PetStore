package Working;

import Goods.Pet;
import Goods.Accessory;

final class CashRegister {
	private static int amountOfCash;
	private static Cashier cashier;

	public static int getAmountOfCash() {
		return amountOfCash;
	}

	public static void setAmountOfCash(int amount) {
		CashRegister.amountOfCash = amount;
	}

	public static Cashier getCashier() {
		return cashier;
	}

	public static void setCashier(Cashier cashier) {
		CashRegister.cashier = cashier;
	}

	public static void sell(Pet pet) {
		Cashier.takeMoney(pet.getPrice());
		System.out.println(pet.getBreed() + " " + pet.getName() + " was sold\n");
	}

	public static void sell(Accessory accessory) {
		Cashier.takeMoney(accessory.getPrice());
		System.out.println(accessory.getType() + " was sold\n");
	}

	public static void giveMoney() {
		amountOfCash = 0;
	}

}
