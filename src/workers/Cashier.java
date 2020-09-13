package Workers;

import Registration.Registry;
import Working.*;

public final class Cashier extends Worker{

	public Cashier(String name, int age){
		super(name, age);
	}

	public void communication() {
		System.out.println("I'm speaking with clients");
	}

	public void takeMoney(CashRegister cashRegister,  int money) {
		System.out.println("I'm taking clients' money: " + money);
		cashRegister.setAmountOfCash( cashRegister.getAmountOfCash() + money);
		System.out.println("Cash register : " + cashRegister.getAmountOfCash() + " Hryvnia");
	}

	public void OpenRegister(CashRegister cashRegister){
		cashRegister.setCashier(this);
		System.out.println("Hello! My name is " + super.getName() + 
				" .I'm a cashier. I'm " + super.getAge() + ".");
		System.out.println("I started to work. So I opened my cash register");
	}

	public void CloseOutRegister(AccountingDogs accDogs, AccountingForDogs accForDogs,CashRegister cashRegister, Registry registry, Report report){
		System.out.println("Cash register was closed out");
		report.add(accDogs, accForDogs, registry, cashRegister);
		cashRegister.giveMoney();
		registry.nextDay();
	}
}

