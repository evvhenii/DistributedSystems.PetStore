package Working;

import Goods.*;

public final class AccountingForDogs {
	private int numberOfLeashes;
	private int numberOfFeed;
	private int numberOfCages;

	public AccountingForDogs() {
		numberOfLeashes = 0;
		numberOfFeed = 0;
		numberOfCages = 0;
	}

	public int getNumberOfLeashes() {
		return numberOfLeashes;
	}

	public int getNumberOfFeed() {
		return numberOfFeed;
	}

	public int getNumberOfCages() {
		return numberOfCages;
	}

	public ForDogs buyAccessory(ForDogs accessory) {
		switch(accessory.getType()) {
		case LEASH:
			this.numberOfLeashes++;
			break;
		case FEED:
			this.numberOfFeed++;
			break;
		case HOUSE:
			this.numberOfCages++;
			break;
		}

		System.out.println("Pet Store got a " + accessory.getColor() + " "
				+ accessory.getSize() + " " + accessory.getType() + ". It costs " 
				+ accessory.getPrice() + ".");

		return accessory;
	}

	public void sell(ForDogs accessory, CashRegister cashReg) {
		switch(accessory.getType()) {
		case LEASH:
			this.numberOfLeashes--;
			break;
		case FEED:
			this.numberOfFeed--;
			break;
		case HOUSE:
			this.numberOfCages--;
			break;
		}

		cashReg.sell(accessory);
	};
}
