package work;

import enums.*;
import goods.*;
import workers.*;
import services.*;

public final class Main {	
	public static void main(String[] args) {
		Cashier cashier1 = new Cashier("Anna", 19);
		Groomer groomer = new Groomer("Oleg", 32);
		Cleaner cleaner = new Cleaner("Andrew", 26);
		
		AccountingService accServ = new	AccountingService();
		CashRegisterService cashRegServ = new CashRegisterService(cashier1);
		GroomingService groomServ = new GroomingService(groomer, cleaner);
		RegistryService regServ = new RegistryService();
		StorageService storServ = new StorageService();
		
		Service service1 = new Service(serviceType.EAR_CLEAN, 300);
		Service service2 = new Service(serviceType.CLIPPING, 400);
		Service service3 = new Service(serviceType.TEETH_BRUSHING, 200);
		Service service4 = new Service(serviceType.BATHING, 500);
		Service service5 = new Service(serviceType.SMTH_ELSE, 250);
		
		System.out.println("---------------------SERVICES----------------------\n");
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		System.out.println(service4);
		System.out.println(service5);
		
		System.out.println("\n---------------------BUYING DOGS----------------------\n");
		
		Dog dog1 = new Dog(Breed.LABRADOR, "Tom", Color.WHITE, Size.SMALL, 1400);
		Dog dog2 = new Dog(Breed.RETRIEVER, "John", Color.BLUE, Size.MEDIUM, 300);
		Dog dog3 = new Dog(Breed.TERRIER, "Bob", Color.RED, Size.LARGE, 850);
		Dog dog4 = new Dog(Breed.BULLDOG, "Rose", Color.GREEN, Size.SMALL, 450);
		Dog dog5 = new Dog(Breed.HUSKIE, "Charles", Color.BLACK, Size.MEDIUM, 1890);
		Dog dog6 = new Dog(Breed.HUSKIE, "Nathan", Color.WHITE, Size.LARGE, 1050);
		Dog dog7 = new Dog(Breed.RETRIEVER, "Emma", Color.WHITE, Size.LARGE, 1090);
		Dog dog8 = new Dog(Breed.TERRIER, "Toby", Color.RED, Size.MEDIUM, 2000);
		Dog dog9 = new Dog(Breed.POODLE, "Max", Color.WHITE, Size.SMALL, 700);
		Dog dog10 = new Dog(Breed.BULLDOG, "Leo", Color.GREEN, Size.SMALL, 1400);
		Dog dog11 = new Dog(Breed.HUSKIE, "Olivia", Color.BLUE, Size.SMALL, 1200);
		Dog dog12 = new Dog(Breed.TERRIER, "Ava", Color.RED, Size.MEDIUM, 1880);
		Dog dog13 = new Dog(Breed.POODLE, "Emily", Color.WHITE, Size.SMALL, 1000);
		Dog dog14 = new Dog(Breed.LABRADOR, "Michael", Color.BLACK, Size.LARGE, 570);
		Dog dog15 = new Dog(Breed.RETRIEVER, "Anna", Color.BLUE, Size.LARGE, 690);
		storServ.takeInStore(dog1);
		storServ.takeInStore(dog2);
		storServ.takeInStore(dog3);
		storServ.takeInStore(dog4);
		storServ.takeInStore(dog5);
		storServ.takeInStore(dog6);
		storServ.takeInStore(dog7);
		storServ.takeInStore(dog8);
		storServ.takeInStore(dog9);
		storServ.takeInStore(dog10);
		storServ.takeInStore(dog11);
		storServ.takeInStore(dog12);
		storServ.takeInStore(dog13);
		storServ.takeInStore(dog14);
		storServ.takeInStore(dog15);
		
		System.out.println("\n---------------BUYING THINGS FOR DOGS-------------------\n");

		ForDog accessory1 = new ForDog(Type.FEED, Color.BLUE, Size.SMALL, 200);
		ForDog accessory2 = new ForDog(Type.FEED, Color.RED, Size.SMALL, 300);
		ForDog accessory3 = new ForDog(Type.FEED, Color.BLACK, Size.MEDIUM, 400);
		ForDog accessory4 = new ForDog(Type.FEED, Color.BLACK, Size.LARGE, 550);
		ForDog accessory5 = new ForDog(Type.HOUSE, Color.BLUE, Size.LARGE, 1400);
		ForDog accessory6 = new ForDog(Type.HOUSE, Color.GREEN, Size.MEDIUM, 1000);
		ForDog accessory7 = new ForDog(Type.HOUSE, Color.RED, Size.LARGE, 1450);
		ForDog accessory8 = new ForDog(Type.LEASH, Color.WHITE, Size.SMALL, 150);
		ForDog accessory9 = new ForDog(Type.LEASH, Color.BLACK, Size.MEDIUM, 240);
		ForDog accessory10 = new ForDog(Type.LEASH, Color.BLUE, Size.LARGE, 320);
		storServ.takeInStore(accessory1);
		storServ.takeInStore(accessory2);
		storServ.takeInStore(accessory3);
		storServ.takeInStore(accessory4);
		storServ.takeInStore(accessory5);
		storServ.takeInStore(accessory6);
		storServ.takeInStore(accessory7);
		storServ.takeInStore(accessory8);
		storServ.takeInStore(accessory9);
		storServ.takeInStore(accessory10);

		System.out.println("\n------------------SIMULATION OF WORK PROCCESS-------------------------\n");
		
		System.out.println("\n..........WORKERS.......\n");
		
		
		regServ.clearRegistry();
		cashRegServ.openCashRegister(cashier1);
		
		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");

		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory1);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog9);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory4);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog1);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory7);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog4);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog8);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog15);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry1 = new LogEntry("Erika", "+98 94 59", service1);
		LogEntry logEntry2 = new LogEntry("Vika", "+99 28 87", service1);
		LogEntry logEntry3 = new LogEntry("Andrew", "+68 22 89", service3);
		LogEntry logEntry4 = new LogEntry("Peter", "+88 94 39", service4);
		LogEntry logEntry5 = new LogEntry("Veronica", "+97 92 39", service2);
		regServ.add(1, 2, logEntry1);
		regServ.add(2, 1, logEntry2);
		regServ.add(1, 7, logEntry3);
		regServ.add(1, 6, logEntry4);
		regServ.add(1, 3, logEntry5);
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		groomServ.toCompleteEntry(logEntry1, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service1.getPrice());
		groomServ.toCompleteEntry(logEntry5, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service2.getPrice());
		groomServ.toCompleteEntry(logEntry4, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service4.getPrice());
		groomServ.toCompleteEntry(logEntry3, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service3.getPrice());

		//cashier1.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);
		cashRegServ.closeCashRegister();
		accServ.add(storServ, regServ, cashRegServ);

		System.out.println("\n..........NEXT DAY.......\n");

		cashRegServ.openCashRegister(cashier1);

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory2);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory3);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog14);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry6 = new LogEntry("Anton", "+98 78 21", service4);
		regServ.add(3, 4, logEntry6);
				
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");

		cashRegServ.closeCashRegister();
		accServ.add(storServ, regServ, cashRegServ);
		
		System.out.println("\n..........NEXT DAY.......\n");

		cashRegServ.openCashRegister(cashier1);

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), accessory9);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog13);
		storServ.sellFromStore(cashier1, cashRegServ.getCashRegister(), dog12);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry7 = new LogEntry("Vasilii", "+98 48 99", service1);
		LogEntry logEntry8 = new LogEntry("Oxana", "+98 22 77", service2);
		LogEntry logEntry9 = new LogEntry("Vera", "+30 71 90", service5);
		LogEntry logEntry10 = new LogEntry("Robert", "+33 20 78", service4);
		LogEntry logEntry11 = new LogEntry("Erik", "+60 08 37", service1);
		regServ.add(2, 5, logEntry7);
		regServ.add(5, 1, logEntry8);
		regServ.add(5, 7, logEntry9);
		regServ.add(6, 6, logEntry10);
		regServ.add(5, 3, logEntry11);
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		groomServ.toCompleteEntry(logEntry2, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service2.getPrice());
		groomServ.toCompleteEntry(logEntry7, storServ, cashier1, cashRegServ);
		//cashier1.takeMoney(cashRegister, service1.getPrice());

		cashRegServ.closeCashRegister();
		accServ.add(storServ, regServ, cashRegServ);
		
		System.out.println("\n-----------REPORTS FOR LAST 7 DAYS--------------\n");
		
		System.out.println(accServ);
		
		System.out.println("\n----------REGISTRY AT THE MOMENT--------------\n");
		
		System.out.println(regServ);
	}
}
