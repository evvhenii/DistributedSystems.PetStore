package work;

import goods.*;

public final class AccountingDogs {
	private int numberOfBulldogs;
	private int numberOfHuskies;
	private int numberOfLabradors;
	private int numberOfPoodles;
	private int numberOfRetrievers;
	private int numberOfTerriers;

	public AccountingDogs() {
		numberOfBulldogs = 0;
		numberOfHuskies = 0;
		numberOfLabradors = 0;
		numberOfPoodles = 0;
		numberOfRetrievers = 0;
		numberOfTerriers = 0;		
	}

	public int getNumberOfBulldogs() {
		return numberOfBulldogs;
	}

	public int getNumberOfHuskies() {
		return numberOfHuskies;
	}

	public int getNumberOfLabradors() {
		return numberOfLabradors;
	}

	public int getNumberOfPoodles() {
		return numberOfPoodles;
	}

	public int getNumberOfRetrievers() {
		return numberOfRetrievers;
	}

	public int getNumberOfTerriers() {
		return numberOfTerriers;
	}

	public Dog buy(Dog dog) {
		switch(dog.getBreed()) {
		case BULLDOG:
			this.numberOfBulldogs++;
			break;
		case HUSKIE:
			this.numberOfHuskies++;
			break;
		case LABRADOR:
			this.numberOfLabradors++;
			break;
		case POODLE:
			this.numberOfPoodles++;
			break;
		case RETRIEVER:
			this.numberOfRetrievers++;
			break;
		case TERRIER:
			this.numberOfTerriers++;
			break;
		}

		String buyReport = "Pet Store got a " + dog.getColor() + " " 
				+ dog.getSize() + " " + dog.getBreed() + " " 
				+ dog.getName() + ". It costs " + dog.getPrice() + ".";
		System.out.println(buyReport);

		return dog;
	}

	public void sell(Dog dog, CashRegister cashReg) {
		switch(dog.getBreed()) {
		case BULLDOG:
			this.numberOfBulldogs--;
			break;
		case HUSKIE:
			this.numberOfHuskies--;
			break;
		case LABRADOR:
			this.numberOfLabradors--;
			break;
		case POODLE:
			this.numberOfPoodles--;
			break;
		case RETRIEVER:
			this.numberOfRetrievers--;
			break;
		case TERRIER:
			this.numberOfTerriers--;
			break;
		}

		cashReg.sell(dog);	
	};
}