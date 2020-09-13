package Registration;

public final class Registry {
	private int currentDay = 0;
	private final LogEntry[][] registry = new LogEntry[7][9]; 
	private final String[] weekDays = {
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
			"Sunday"
	};

	public LogEntry getEntry(int day, int time) {
		return registry[day][time];
	}

	public void add(int day, int time, LogEntry logEntry) {
		if(!this.isVacant(day, time)) {
			return;
		}
		registry[day][time] = logEntry;
		System.out.println(logEntry.getName() + " made an apointment on " 
				+ weekDays[day] + " at " + (time + 9) + ":00.");
	}

	public String getCurrentDay() {
		return "CURRENT DAY: " + weekDays[currentDay] + "\n" +
				"09:00. " + registry[currentDay][0].toString() + "\n" +
				"10:00. " + registry[currentDay][1].toString() + "\n" +
				"11:00. " + registry[currentDay][2].toString() + "\n" +
				"12:00. " + registry[currentDay][3].toString() + "\n" +
				"13:00. " + registry[currentDay][4].toString() + "\n" +
				"14:00. " + registry[currentDay][5].toString() + "\n" +
				"15:00. " + registry[currentDay][6].toString() + "\n" +
				"16:00. " + registry[currentDay][7].toString() + "\n" +
				"17:00. " + registry[currentDay][8].toString();		
	}

	public void clearDay(int day) {
		for(int i = 0; i < 9; i++) {
			registry[day][i] = new LogEntry("Empty", "Empty    ", null, 0);
		}
	}

	public void clearRegistry() {
		for(int i = 0; i < 7; i++) {
			clearDay(i);
		}
	}

	public void nextDay() {
		clearDay(currentDay);
		currentDay = (currentDay == 6) ? 0 : ++currentDay;

	}

	public boolean isVacant(int day, int time) {
		if(day < 0 || day > 7) {
			System.out.println("Day is uncorrect");
			return false;
		}

		if(time < 0 || time > 8) {
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
		for(int i = 0; i < 7; i++) {
			entries += weekDays[i] + ":\n\n";
			for(int j = 0; j < 9; j++) {
				entries += i + 9 + ". " + registry[i][j].toString() + "\n";
			}
		}
		return entries;
	}

}
