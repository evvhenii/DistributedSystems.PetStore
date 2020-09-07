package Working;

import Goods.*;
import Enums.*;
import Workers.*;

public final class Main {	
	public static void main(String[] args) {
		Pet p1 = Accounting.buyPet(new Pet(Breed.CAT, "Tom", Color.WHITE, Size.SMALL, 1400));
		Pet p2 = Accounting.buyPet(new Pet(Breed.DOG, "John", Color.BLUE, Size.MEDIUM, 300));
		Pet p3 = Accounting.buyPet(new Pet(Breed.FISH, "Bob", Color.RED, Size.LARGE, 850));
		Pet p4 = Accounting.buyPet(new Pet(Breed.FROG, "Rose", Color.GREEN, Size.SMALL, 450));
		Pet p5 = Accounting.buyPet(new Pet(Breed.PARROT, "Charles", Color.BLACK, Size.MEDIUM, 1890));
		Pet p6 = Accounting.buyPet(new Pet(Breed.CAT, "Nathan", Color.WHITE, Size.LARGE, 1050));
		Pet p7 = Accounting.buyPet(new Pet(Breed.DOG, "Emma", Color.WHITE, Size.LARGE, 1090));
		Pet p8 = Accounting.buyPet(new Pet(Breed.FISH, "Toby", Color.RED, Size.MEDIUM, 2000));
		Pet p9 = Accounting.buyPet(new Pet(Breed.PARROT, "Max", Color.WHITE, Size.SMALL, 700));
		Pet p10 = Accounting.buyPet(new Pet(Breed.FROG, "Leo", Color.GREEN, Size.SMALL, 1400));
		Pet p11 = Accounting.buyPet(new Pet(Breed.DOG, "Olivia", Color.BLUE, Size.SMALL, 1200));
		Pet p12 = Accounting.buyPet(new Pet(Breed.FISH, "Ava", Color.RED, Size.MEDIUM, 1880));
		Pet p13 = Accounting.buyPet(new Pet(Breed.PARROT, "Emily", Color.WHITE, Size.SMALL, 1000));
		Pet p14 = Accounting.buyPet(new Pet(Breed.CAT, "Michael", Color.BLACK, Size.LARGE, 570));
		Pet p15 = Accounting.buyPet(new Pet(Breed.DOG, "Anna", Color.BLUE, Size.LARGE, 690));
		
		System.out.println("");

		Accessory a1 = Accounting.buyAccessory(new Accessory(Type.FEED, Color.BLUE, Size.SMALL, 200));
		Accessory a2 = Accounting.buyAccessory(new Accessory(Type.FEED, Color.RED, Size.SMALL, 300));
		Accessory a3 = Accounting.buyAccessory(new Accessory(Type.FEED, Color.BLACK, Size.MEDIUM, 400));
		Accessory a4 = Accounting.buyAccessory(new Accessory(Type.FEED, Color.BLACK, Size.LARGE, 550));
		Accessory a5 = Accounting.buyAccessory(new Accessory(Type.CAGE, Color.BLUE, Size.LARGE, 1400));
		Accessory a6 = Accounting.buyAccessory(new Accessory(Type.CAGE, Color.GREEN, Size.MEDIUM, 1000));
		Accessory a7 = Accounting.buyAccessory(new Accessory(Type.CAGE, Color.RED, Size.LARGE, 1450));
		Accessory a8 = Accounting.buyAccessory(new Accessory(Type.LEASH, Color.WHITE, Size.SMALL, 150));
		Accessory a9 = Accounting.buyAccessory(new Accessory(Type.LEASH, Color.BLACK, Size.MEDIUM, 240));
		Accessory a10 = Accounting.buyAccessory(new Accessory(Type.LEASH, Color.BLUE, Size.LARGE, 320));

		System.out.println("");

		Cashier w1 = new Cashier("Anna", 19);
		Cleaner w2 = new Cleaner("Andrew", 26);		
		w2.work();
		w1.OpenRegister();
		w1.communication();

		System.out.println("");

		Accounting.sell(a1);
		Accounting.sell(p9);
		Accounting.sell(a4);
		Accounting.sell(p1);
		Accounting.sell(a7);
		Accounting.sell(p4);
		Accounting.sell(p8);
		Accounting.sell(p15);

		w1.CloseOutRegister();

		System.out.println("");

		System.out.println("NEXT DAY\n");

		Cashier w3 = new Cashier("Eduard", 41);
		w3.OpenRegister();
		w3.communication();

		System.out.println("");

		Accounting.sell(a2);
		Accounting.sell(a3);
		Accounting.sell(p14);

		w1.CloseOutRegister();

		System.out.println("");

		System.out.println("NEXT DAY\n");

		w1.OpenRegister();
		w1.communication();

		System.out.println("");

		Accounting.sell(a9);
		Accounting.sell(p13);
		Accounting.sell(p12);

		w1.CloseOutRegister();

		System.out.println("\nREPORT:\n");
		Report.showReport();
	}
}
