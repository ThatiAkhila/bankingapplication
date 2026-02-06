package Task.MAINFILE;

import java.util.Scanner;

import MainPackage.mainfile.BankImplementation;

public class BankMangement  {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	BankImplementation bi= new BankImplementation();
	System.out.println("enter amunt");
	int amnt=sc.nextInt();
	System.out.println("select the chioce");
	int option= sc.nextInt();
	bi.setAmount(amnt);
	bi.getAmount(amnt);
	
	switch (option) {
	case 1:
	  System.out.println(bi.deposit(amnt)); 
		break;
	case 2:
		System.out.println(bi.Withdraw(amnt)); 
		break;
		
	case 3:
		System.out.println(bi.checkbalence());
		break;
	case 4:
		System.out.println(bi.displaydetails());
		break;
	case 5:
		bi.createaccount();
		break;
	default:
		System.out.println("enter valid option");
		break;
	}
	
	
}
}
