package services;

import java.time.LocalDateTime;
import java.util.LinkedList;

public final class AccountingService {
	private LinkedList<String> reports = new LinkedList<>();
	private static int NUMBER_OF_REPORTS = 7;

	public void add(StorageService storageServ, RegistryService registryServ, CashRegisterService cashRegServ) {
		if(reports.size() >= NUMBER_OF_REPORTS) {
			reports.remove();
		}

		String dayReport = "Звіт за\t" + LocalDateTime.now() + "\n"+
				storageServ.getStorageState() + "\n\n Гроші за день:\n\n" +
				registryServ.getCurrentDayEntries() + "\n" + cashRegServ.getAmountOfCash();

		reports.add(dayReport);
	}

	@Override
	public String toString() {
		String report = "";

		for(String item : reports) {
			report += item + "\n";
		}

		return report;
	}
}
