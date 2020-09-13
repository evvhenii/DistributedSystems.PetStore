package workers;

import logManagement.Registry;
import work.*;

public final class Cashier extends Worker{

	public Cashier(String name, int age){
		super(name, age);
	}

	public void communication() {
		final String report = "I'm speaking with clients";
		System.out.println(report);
	}

	public void takeMoney(CashRegister cashRegister,  int money) {
		final int newAmountOfCash = cashRegister.getAmountOfCash() + money;
		cashRegister.setAmountOfCash(newAmountOfCash);

		final String askingMoney = "I'm taking clients' money: " + money;
		final String amountReport = "Cash register : " + cashRegister.getAmountOfCash() + " Hryvnia";
		System.out.println(askingMoney);
		System.out.println(amountReport);
	}

	public void OpenRegister(CashRegister cashRegister){
		cashRegister.setCashier(this);

		final String openingReport = "Hello! My name is " + super.getName() + 
				" .I'm a cashier. I'm " + super.getAge() + ".\n" +
				"I started to work. So I opened my cash register";
		System.out.println(openingReport);
	}

	public void CloseOutRegister(AccountingDogs accDogs, AccountingForDogs accForDogs,CashRegister cashRegister, Registry registry, Report report){		
		report.add(accDogs, accForDogs, registry, cashRegister);
		cashRegister.giveMoney();
		registry.nextDay();

		final String closingReport = "Cash register was closed out.\n" + 
				"New repport was added.\n" + 
				"Money were given to the bank.";
		System.out.println(closingReport);
	}
}

