package work;

import java.util.LinkedList;
import logManagement.Registry;
import java.time.LocalDateTime;

public final class Report {
	private LinkedList<String> reports = new LinkedList<>();
	private static int NUMBER_OF_REPORTS = 7;

	public void add(AccountingDogs accDogs, AccountingForDogs accForDogs, Registry reg, CashRegister cashReg) {
		if(reports.size() >= NUMBER_OF_REPORTS) {
			reports.remove();
		}

		String dayReport = "Звіт за\t" + LocalDateTime.now() + "\n" + "Залишок тварин:\n" +
				"Бульдоги:  " + accDogs.getNumberOfBulldogs() + "\n" +
				"Хаскі:     " + accDogs.getNumberOfHuskies() + "\n" +
				"Лабрадори: " + accDogs.getNumberOfLabradors() + "\n" +
				"Пуделі:    " + accDogs.getNumberOfPoodles() + "\n" +
				"Ретривери: " + accDogs.getNumberOfRetrievers() + "\n" +
				"Терєри:    " + accDogs.getNumberOfTerriers() + "\n" + "Залишок аксесуарів:\n" +
				"Повідки:   " + accForDogs.getNumberOfLeashes() + "\n" +
				"Їжа:       " + accForDogs.getNumberOfFeed() + "\n" +
				"Будиночки: " + accForDogs.getNumberOfCages() + "\n" +
				"КЛІЄНТИ:" + "\n" + reg.getCurrentDay() + "\n" +
				"Отримані гроші за день:" + cashReg.getAmountOfCash() + "\n" +	
				"Касир:" + cashReg.getCashier().getName() + "\n\n";

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
