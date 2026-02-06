package MainPackage.mainfile;
import java.util.*;
public  class BankImplementation extends Bank {
	int damount=0;

	private int amount;

	public int getAmount(int amnt) {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void createaccount() {
		Scanner sc = new Scanner(System.in);
		int pin11 = (int)(Math.random()*90000000) + 100000000;
		System.out.println("pin generated" +pin11);
		System.out.println("enter your name");
		String name = sc.nextLine();
		
	}
	@Override
	public String deposit(int amount) {
		
		damount=damount+getAmount(amount);
		
		return "deposited amount";
	}
	


	@Override
	public String Withdraw(int amount) {
		// TODO Auto-generated method stub
		if(damount>0) {
		damount=damount - getAmount(amount);
		
	}
		return "amount withdraeal done ";
}
	@Override
	public double checkbalence() {
		// TODO Auto-generated method stub 
		System.out.println(getAmount(amount));
		
		return  damount ;
	}

	@Override
	public double displaydetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Account Details");
        System.out.println("Current Balance: " + damount);
        String name = null;
		System.out.println("name" +name);
        return damount;
		
	}

	

}
