package application;

import java.text.ParseException;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {

	Account acc = new Account(1000, "Vanessa", 5000.00);
	BusinessAccount bacc = new BusinessAccount(1001, "Kerstin", 5000.00, 6000.00);
	
	System.out.println(acc);
	
	//upcasting
	Account acc1=bacc;
	Account acc2= new BusinessAccount(1002, "Mike", 100.00, 500.00);
	Account acc3= new SavingsAccount(1003, "Phi", 200.00, 0.05);
	
	System.out.println(acc1);
	System.out.println(acc2);
	System.out.println(acc3);
	
	//downcasting
	BusinessAccount acc4 = (BusinessAccount)acc2;
	acc4.loan(100.00);
	
	System.out.println(acc4);
	
	//BusinessAccount acc5 = (BusinessAccount)acc3;
	if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(200.00);
		System.out.println("Loan!" + acc5);
		
	}
	
	if (acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount)acc3;
		acc5.updateBalance();
		System.out.println("Update " + acc5);
		
	}
	
	
	
}
}
