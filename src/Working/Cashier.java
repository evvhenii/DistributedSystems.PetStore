package Working;

final class Cashier extends Worker{

	public Cashier(String name, int age){
		super(name, age);
	}

	public void communication() {
		System.out.println("I'm speaking with clients");
	}

	public static void takeMoney( int money) {
		System.out.println("I'm taking clients' money: " + money);
		CashRegister.setAmountOfCash( CashRegister.getAmountOfCash() + money);
		System.out.println("Cash register : " + CashRegister.getAmountOfCash() + " Hryvnia");
	}

	public void OpenRegister(){
		CashRegister.setCashier(this);
		System.out.println("Hello! My name is " + super.getName() + 
				" .I'm a cashier. I'm " + super.getAge() + ".");
		System.out.println("I started to work. So I opened my cash register");
	}

	public void CloseOutRegister(){
		System.out.println("Cash register was closed out");
		Report.add();
		CashRegister.giveMoney();
	}
}
