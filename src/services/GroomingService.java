package services;

import work.LogEntry;
import workers.Cashier;
import workers.Cleaner;
import workers.Groomer;

public class GroomingService {
	Groomer groomer;
	Cleaner cleaner;
	
	public GroomingService(Groomer groomer, Cleaner cleaner) {
		this.groomer = groomer;
		this.cleaner = cleaner;
	}

	public void toCompleteEntry(LogEntry logEntry, StorageService storServ, Cashier cashier, CashRegisterService cashRegServ) {
		groomer.work(logEntry);
		cleaner.work();
		groomer.askToPay(logEntry);
		storServ.sellFromStore(cashier, cashRegServ.getCashRegister(), logEntry.getService());
	}
}
