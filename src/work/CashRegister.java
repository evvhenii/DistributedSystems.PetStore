package Working;

import Goods.*;
import Workers.Cashier;

public final class CashRegister {
	private int amountOfCash;
	private Cashier cashier;

	public CashRegister(Cashier cashier) {
		this.cashier = cashier;
		amountOfCash = 0;
	}

	public int getAmountOfCash() {
		return amountOfCash;
	}

	public void setAmountOfCash(int amount) {
		this.amountOfCash = amount;
	}

	public Cashier getCashier() {
		return cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public void sell(Dogs pet) {
		cashier.takeMoney(this, pet.getPrice());
		System.out.println(pet.getBreed() + " " + pet.getName() + " was sold\n");
	}

	public void sell(ForDogs accessory) {
		cashier.takeMoney(this, accessory.getPrice());
		System.out.println(accessory.getType() + " was sold\n");
	}

	public void giveMoney() {
		amountOfCash = 0;
	}
}
