package services;

import work.CashRegister;
import workers.Cashier;

public class CashRegisterService {
	private CashRegister cashReg = new CashRegister();
	private Cashier cashier;
	
	public CashRegisterService(Cashier cashier) {
		this.cashier = cashier;
	}
	
	public CashRegister getCashRegister() {
		return cashReg;
	}
	
	public int getAmountOfCash() {
		return cashReg.getAmountOfCash();
	}

	public void openCashRegister(Cashier cashier) {
		cashier.startToWork();
	}

	public void closeCashRegister() {
		cashReg.setAmountOfCash(0);
		cashier.completeTheWork();
	}
}
