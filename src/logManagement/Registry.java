package logManagement;

import goods.Service;

public final class Registry {
	private static final int NUMBER_OF_DAYS = 7;
	private static final int NUMBER_OF_ENTRIES = 9;
	private int currentDay = 0;

	private final LogEntry[][] registry = new LogEntry[NUMBER_OF_DAYS][NUMBER_OF_ENTRIES]; 
	private final String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

	public void add(int day, int time, LogEntry logEntry) {
		if(!this.isVacant(day, time)) {
			return;
		}

		registry[day][time] = logEntry;

		String addInfo = logEntry.getName() + " made an apointment on " + 
				weekDays[day] + " at " + (time + NUMBER_OF_ENTRIES) + ":00.";
		System.out.println(addInfo);
	}

	public String getCurrentDay() {
		String dayReport = "CURRENT DAY: " + weekDays[currentDay] + "\n";
		String time;

		for(int i = 0; i < NUMBER_OF_ENTRIES; i++) {
			time = i + NUMBER_OF_ENTRIES + ":00. ";
			dayReport += time + registry[currentDay][i] + "\n";
		}

		return dayReport;		
	}

	public void clearDay(int day) {
		for(int i = 0; i < NUMBER_OF_ENTRIES; i++) {
			registry[day][i] = new LogEntry("_____", "_________", new Service(null, 0));
		}
	}

	public void clearRegistry() {
		for(int i = 0; i < NUMBER_OF_DAYS; i++) {
			clearDay(i);
		}
	}

	public void nextDay() {
		clearDay(currentDay);
		currentDay = (currentDay == NUMBER_OF_DAYS - 1) ? 0 : ++currentDay;
	}

	public boolean isVacant(int day, int time) {
		if(day < 0 || day > NUMBER_OF_DAYS) {
			System.out.println("Day is uncorrect");
			return false;
		}

		if(time < 0 || time > NUMBER_OF_ENTRIES) {
			System.out.println("Time is uncorrect");
			return false;
		}

		if(!registry[day][time].isFree()) {
			System.out.println("Occupied!");
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String entries = "";
		String time;

		for(int i = 0; i < NUMBER_OF_DAYS; i++) {
			entries += "\n" + weekDays[i] + ":\n\n";

			for(int j = 0; j < NUMBER_OF_ENTRIES; j++) {
				time = j + NUMBER_OF_ENTRIES + ":00. ";
				entries += time + registry[i][j] + "\n";
			}
		}

		return entries;
	}

}
