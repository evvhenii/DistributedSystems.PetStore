package services;

import goods.Dog;
import goods.ForDog;
import goods.Service;
import work.CashRegister;
import work.DogStorage;
import work.ForDogStorage;
import workers.Cashier;

public class StorageService {
	private DogStorage dogStorage = new DogStorage();
	private ForDogStorage forDogStorage = new ForDogStorage();

	public String getStorageState() {
		return  "Залишок тварин:\n" +
				"Бульдоги:  " + dogStorage.getNumberOfBulldogs() + "\n" +
				"Хаскі:     " + dogStorage.getNumberOfHuskies() + "\n" +
				"Лабрадори: " + dogStorage.getNumberOfLabradors() + "\n" +
				"Пуделі:    " + dogStorage.getNumberOfPoodles() + "\n" +
				"Ретривери: " + dogStorage.getNumberOfRetrievers() + "\n" +
				"Терєри:    " + dogStorage.getNumberOfTerriers() + "\n" + "Залишок аксесуарів:\n" +
				"Повідки:   " + forDogStorage.getNumberOfLeashes() + "\n" +
				"Їжа:       " + forDogStorage.getNumberOfFeed() + "\n" +
				"Будиночки: " + forDogStorage.getNumberOfCages() + "\n";
	}

	public void sellFromStore(Cashier cashier, CashRegister cashRegister, Dog dog) {
		final int newAmountOfCash = cashRegister.getAmountOfCash() + dog.getPrice();

		cashRegister.setAmountOfCash(newAmountOfCash);
		dogStorage.takeFromStorage(dog);
		cashier.purchaseReport(dog);
	}

	public void sellFromStore(Cashier cashier, CashRegister cashRegister, ForDog forDog) {
		final int newAmountOfCash = cashRegister.getAmountOfCash() + forDog.getPrice();

		cashRegister.setAmountOfCash(newAmountOfCash);
		forDogStorage.takeFromStorage(forDog);
		cashier.purchaseReport(forDog);
	}
	
	public void sellFromStore(Cashier cashier, CashRegister cashRegister, Service service) {
		final int newAmountOfCash = cashRegister.getAmountOfCash() + service.getPrice();
		
		cashRegister.setAmountOfCash(newAmountOfCash);
		cashier.purchaseReport(service);
	}

	public void takeInStore(Dog dog) {
		dogStorage.putInStorage(dog);
	}

	public void takeInStore(ForDog forDog) {
		forDogStorage.putInStorage(forDog);
	}
}
