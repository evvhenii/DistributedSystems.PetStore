package work;

import enums.*;
import goods.*;
import logManagement.*;
import workers.*;

public final class Main {	
	public static void main(String[] args) {
		AccountingDogs accDogs = new AccountingDogs();
		AccountingForDogs accForDogs = new AccountingForDogs();
		Registry registry = new Registry();
		Cashier cashier1 = new Cashier("Anna", 19);
		Cleaner cleaner = new Cleaner("Andrew", 26);		
		CashRegister cashRegister = new CashRegister(cashier1);
		Report report = new Report();
		
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
		accDogs.buy(dog1);
		accDogs.buy(dog2);
		accDogs.buy(dog3);
		accDogs.buy(dog4);
		accDogs.buy(dog5);
		accDogs.buy(dog6);
		accDogs.buy(dog7);
		accDogs.buy(dog8);
		accDogs.buy(dog9);
		accDogs.buy(dog10);
		accDogs.buy(dog11);
		accDogs.buy(dog12);
		accDogs.buy(dog13);
		accDogs.buy(dog14);
		accDogs.buy(dog15);
		
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
		accForDogs.buy(accessory1);
		accForDogs.buy(accessory2);
		accForDogs.buy(accessory3);
		accForDogs.buy(accessory4);
		accForDogs.buy(accessory5);
		accForDogs.buy(accessory6);
		accForDogs.buy(accessory7);
		accForDogs.buy(accessory8);
		accForDogs.buy(accessory9);
		accForDogs.buy(accessory10);

		System.out.println("\n------------------SIMULATION OF WORK PROCCESS-------------------------\n");
		
		System.out.println("\n..........WORKERS.......\n");
		
		Groomer groomer = new Groomer("Oleg", 32);
		registry.clearRegistry();
		cleaner.work();
		cashier1.OpenRegister(cashRegister);
		cashier1.communication();
		
		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");

		accForDogs.sell(accessory1, cashRegister);
		accDogs.sell(dog9, cashRegister);
		accForDogs.sell(accessory4, cashRegister);
		accDogs.sell(dog1, cashRegister);
		accForDogs.sell(accessory7, cashRegister);
		accDogs.sell(dog4, cashRegister);
		accDogs.sell(dog8, cashRegister);
		accDogs.sell(dog15, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry1 = new LogEntry("Erika", "+98 94 59", service1);
		LogEntry logEntry2 = new LogEntry("Vika", "+99 28 87", service1);
		LogEntry logEntry3 = new LogEntry("Andrew", "+68 22 89", service3);
		LogEntry logEntry4 = new LogEntry("Peter", "+88 94 39", service4);
		LogEntry logEntry5 = new LogEntry("Veronica", "+97 92 39", service2);
		registry.add(1, 2, logEntry1);
		registry.add(2, 1, logEntry2);
		registry.add(1, 7, logEntry3);
		registry.add(1, 6, logEntry4);
		registry.add(1, 3, logEntry5);
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		groomer.service(logEntry1);
		cashier1.takeMoney(cashRegister, service1.getPrice());
		groomer.service(logEntry5);
		cashier1.takeMoney(cashRegister, service2.getPrice());
		groomer.service(logEntry4);
		cashier1.takeMoney(cashRegister, service4.getPrice());
		groomer.service(logEntry3);
		cashier1.takeMoney(cashRegister, service3.getPrice());

		cashier1.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n..........NEXT DAY.......\n");

		Cashier cashier2 = new Cashier("Eduard", 41);
		cashier2.OpenRegister(cashRegister);
		cashier2.communication();

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		accForDogs.sell(accessory2, cashRegister);
		accForDogs.sell(accessory3, cashRegister);
		accDogs.sell(dog14, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry6 = new LogEntry("Anton", "+98 78 21", service4);
		registry.add(3, 4, logEntry6);
				
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");

		cashier2.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n..........NEXT DAY.......\n");

		cashier1.OpenRegister(cashRegister);
		cashier1.communication();

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		accForDogs.sell(accessory9, cashRegister);
		accDogs.sell(dog13, cashRegister);
		accDogs.sell(dog12, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		LogEntry logEntry7 = new LogEntry("Vasilii", "+98 48 99", service1);
		LogEntry logEntry8 = new LogEntry("Oxana", "+98 22 77", service2);
		LogEntry logEntry9 = new LogEntry("Vera", "+30 71 90", service5);
		LogEntry logEntry10 = new LogEntry("Robert", "+33 20 78", service4);
		LogEntry logEntry11 = new LogEntry("Erik", "+60 08 37", service1);
		registry.add(2, 5, logEntry7);
		registry.add(5, 1, logEntry8);
		registry.add(5, 7, logEntry9);
		registry.add(6, 6, logEntry10);
		registry.add(5, 3, logEntry11);
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		groomer.service(logEntry2);
		cashier1.takeMoney(cashRegister, service2.getPrice());
		groomer.service(logEntry7);
		cashier1.takeMoney(cashRegister, service1.getPrice());

		cashier1.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n-----------REPORTS FOR LAST 7 DAYS--------------\n");
		
		System.out.println(report);
		
		System.out.println("\n----------REGISTRY AT THE MOMENT--------------\n");
		
		System.out.println(registry);
	}
}
