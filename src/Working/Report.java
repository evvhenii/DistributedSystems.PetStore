package Working;

import java.util.LinkedList;
import java.util.Queue;
import java.time.LocalDateTime;

public final class Report {
	private static Queue<String> reports = new LinkedList<>();

	public static void add() {
		if(reports.size() >= 7) {
			reports.remove();
		}
		reports.add("Звіт за " + LocalDateTime.now() + "\n" + "Залишок тварин:\n" +
				"Коти: " + Accounting.getNumberOfCats() + "\n" +
				"Собаки: " + Accounting.getNumberOfDogs() + "\n" +
				"Папуги: " + Accounting.getNumberOfParrots() + "\n" +
				"Риби: " + Accounting.getNumberOfFishes() + "\n" +
				"Жаби: " + Accounting.getNumberOfFrogs() + "\n" + "Залишок аксесуарів:\n" +
				"Повідки: " + Accounting.getNumberOfLeashes() + "\n" +
				"Їжа: " + Accounting.getNumberOfFeed() + "\n" +
				"Клітки: " + Accounting.getNumberOfCages() + "\n" +
				"Отримані гроші за день:" + CashRegister.getAmountOfCash() + "\n" +	
				"Касир:" + CashRegister.getCashier().getName() + "\n\n");
	}

	public static void showReport() {
		String rep;
		while((rep = reports.poll()) != null) {
			System.out.println(rep);
		}
	}
}
