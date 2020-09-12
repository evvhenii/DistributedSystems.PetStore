package Working;

import Goods.*;
import Registration.*;
import Enums.*;
import Workers.*;


public final class Main {	
	public static void main(String[] args) {
		AccountingDogs accDogs = new AccountingDogs();
		AccountingForDogs accForDogs = new AccountingForDogs();
		Registry registry = new Registry();
		Cashier w1 = new Cashier("Anna", 19);
		Cleaner w2 = new Cleaner("Andrew", 26);		
		CashRegister cashRegister = new CashRegister(w1);
		Report report = new Report();
		
		System.out.println("---------------------BUYING DOGS----------------------\n");
		
		Dogs p1 = accDogs.buyPet(new Dogs(Breed.LABRADOR, "Tom", Color.WHITE, Size.SMALL, 1400));
		Dogs p2 = accDogs.buyPet(new Dogs(Breed.RETRIEVER, "John", Color.BLUE, Size.MEDIUM, 300));
		Dogs p3 = accDogs.buyPet(new Dogs(Breed.TERRIER, "Bob", Color.RED, Size.LARGE, 850));
		Dogs p4 = accDogs.buyPet(new Dogs(Breed.BULLDOG, "Rose", Color.GREEN, Size.SMALL, 450));
		Dogs p5 = accDogs.buyPet(new Dogs(Breed.HUSKIE, "Charles", Color.BLACK, Size.MEDIUM, 1890));
		Dogs p6 = accDogs.buyPet(new Dogs(Breed.HUSKIE, "Nathan", Color.WHITE, Size.LARGE, 1050));
		Dogs p7 = accDogs.buyPet(new Dogs(Breed.RETRIEVER, "Emma", Color.WHITE, Size.LARGE, 1090));
		Dogs p8 = accDogs.buyPet(new Dogs(Breed.TERRIER, "Toby", Color.RED, Size.MEDIUM, 2000));
		Dogs p9 = accDogs.buyPet(new Dogs(Breed.POODLE, "Max", Color.WHITE, Size.SMALL, 700));
		Dogs p10 = accDogs.buyPet(new Dogs(Breed.BULLDOG, "Leo", Color.GREEN, Size.SMALL, 1400));
		Dogs p11 = accDogs.buyPet(new Dogs(Breed.HUSKIE, "Olivia", Color.BLUE, Size.SMALL, 1200));
		Dogs p12 = accDogs.buyPet(new Dogs(Breed.TERRIER, "Ava", Color.RED, Size.MEDIUM, 1880));
		Dogs p13 = accDogs.buyPet(new Dogs(Breed.POODLE, "Emily", Color.WHITE, Size.SMALL, 1000));
		Dogs p14 = accDogs.buyPet(new Dogs(Breed.LABRADOR, "Michael", Color.BLACK, Size.LARGE, 570));
		Dogs p15 = accDogs.buyPet(new Dogs(Breed.RETRIEVER, "Anna", Color.BLUE, Size.LARGE, 690));
		
		System.out.println("\n---------------BUYING THINGS FOR DOGS-------------------\n");

		ForDogs a1 = accForDogs.buyAccessory(new ForDogs(Type.FEED, Color.BLUE, Size.SMALL, 200));
		ForDogs a2 = accForDogs.buyAccessory(new ForDogs(Type.FEED, Color.RED, Size.SMALL, 300));
		ForDogs a3 = accForDogs.buyAccessory(new ForDogs(Type.FEED, Color.BLACK, Size.MEDIUM, 400));
		ForDogs a4 = accForDogs.buyAccessory(new ForDogs(Type.FEED, Color.BLACK, Size.LARGE, 550));
		ForDogs a5 = accForDogs.buyAccessory(new ForDogs(Type.HOUSE, Color.BLUE, Size.LARGE, 1400));
		ForDogs a6 = accForDogs.buyAccessory(new ForDogs(Type.HOUSE, Color.GREEN, Size.MEDIUM, 1000));
		ForDogs a7 = accForDogs.buyAccessory(new ForDogs(Type.HOUSE, Color.RED, Size.LARGE, 1450));
		ForDogs a8 = accForDogs.buyAccessory(new ForDogs(Type.LEASH, Color.WHITE, Size.SMALL, 150));
		ForDogs a9 = accForDogs.buyAccessory(new ForDogs(Type.LEASH, Color.BLACK, Size.MEDIUM, 240));
		ForDogs a10 = accForDogs.buyAccessory(new ForDogs(Type.LEASH, Color.BLUE, Size.LARGE, 320));

		System.out.println("\n------------------SIMULATION OF WORK PROCCESS-------------------------\n");
		
		System.out.println("\n..........WORKERS.......\n");
		
		Groomer w5 = new Groomer("Oleg", 32);
		registry.clearRegistry();
		w2.work();
		w1.OpenRegister(cashRegister);
		w1.communication();
		
		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");

		accForDogs.sell(a1, cashRegister);
		accDogs.sell(p9, cashRegister);
		accForDogs.sell(a4, cashRegister);
		accDogs.sell(p1, cashRegister);
		accForDogs.sell(a7, cashRegister);
		accDogs.sell(p4, cashRegister);
		accDogs.sell(p8, cashRegister);
		accDogs.sell(p15, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		registry.add(1, 2, new LogEntry("Erika", "+98 94 59", Service.BATHING, 980));
		registry.add(2, 1, new LogEntry("Vika", "+99 28 87", Service.CLIPPING, 780));
		registry.add(1, 7, new LogEntry("Andrew", "+68 22 89", Service.EAR_CLEAN, 450));
		registry.add(1, 6, new LogEntry("Peter", "+88 94 39", Service.TEETH_BRUSHING, 550));
		registry.add(1, 3, new LogEntry("Veronica", "+97 92 39", Service.CLIPPING, 500));
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		w5.service(registry.getEntry(1, 2));
		w1.takeMoney(cashRegister, registry.getEntry(1, 2).getPrice());
		w5.service(registry.getEntry(1, 3));
		w1.takeMoney(cashRegister, registry.getEntry(1, 3).getPrice());
		w5.service(registry.getEntry(1, 6));
		w1.takeMoney(cashRegister, registry.getEntry(1, 6).getPrice());
		w5.service(registry.getEntry(1, 7));
		w1.takeMoney(cashRegister, registry.getEntry(1, 7).getPrice());

		w1.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n..........NEXT DAY.......\n");

		Cashier w3 = new Cashier("Eduard", 41);
		w3.OpenRegister(cashRegister);
		w3.communication();

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		accForDogs.sell(a2, cashRegister);
		accForDogs.sell(a3, cashRegister);
		accDogs.sell(p14, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		registry.add(3, 4, new LogEntry("Anton", "+98 78 21", Service.BATHING, 640));
				
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");

		w3.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n..........NEXT DAY.......\n");

		w1.OpenRegister(cashRegister);
		w1.communication();

		System.out.println("\n.......CUSTOMERS BUY DOGS AND THINGS FOR IT.......\n");
		
		accForDogs.sell(a9, cashRegister);
		accDogs.sell(p13, cashRegister);
		accDogs.sell(p12, cashRegister);
		
		System.out.println("\n.......CUSTOMERS MAKE APPOINTMENTS.......\n");
		
		registry.add(2, 5, new LogEntry("Vasilii", "+98 48 99", Service.EAR_CLEAN, 300));
		registry.add(5, 1, new LogEntry("Oxana", "+98 22 77", Service.CLIPPING, 250));
		registry.add(5, 7, new LogEntry("Vera", "+30 71 90", Service.EAR_CLEAN, 420));
		registry.add(6, 6, new LogEntry("Robert", "+33 20 78", Service.TEETH_BRUSHING, 730));
		registry.add(5, 3, new LogEntry("Erik", "+60 08 37", Service.CLIPPING, 850));
		
		System.out.println("\n.......GROOMER MAKES APPOINTMENTS.......\n");
		
		w5.service(registry.getEntry(2, 1));
		w1.takeMoney(cashRegister, registry.getEntry(2, 1).getPrice());
		w5.service(registry.getEntry(2, 5));
		w1.takeMoney(cashRegister, registry.getEntry(2, 5).getPrice());

		w1.CloseOutRegister(accDogs, accForDogs, cashRegister, registry, report);

		System.out.println("\n-----------REPORTS FOR LAST 7 DAYS--------------\n");
		
		System.out.println(report.toString());
		
		System.out.println("\n----------REGISTRY AT THE MOMENT--------------\n");
		
		System.out.println(registry.toString());
	}
}
