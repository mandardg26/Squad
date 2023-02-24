
package exceptionhandling;

import java.util.Scanner;

class checkBalance{
	
	private double num;
	private double balance;
	
	checkBalance(double num){
		
		this.num=num;
	}
	public double getnum() {
		
		return num;
	}
	public void  setnum(double num) {
		
		this.num=num;
		
	}
public double getbalance() {
		
		return balance;
	}
	public void  setbalance(double balance) {
		
		this.balance=balance;
		
	}
	
	void depoist(double amount) {
		
		balance=balance+amount;
	}
	
	void withdraw(double amount) {
		
		if(balance>amount) {
			
			balance=balance-amount;
		}
		else {
			
			throw new InsufficientBalanceException("your account balance is low");
		}
	}
	
	
	public String toString() {
		
		return "Number: "+num +"/nBalance: "+balance;
	}
}

class InsufficientBalanceException extends RuntimeException {
	
	String msg;
	InsufficientBalanceException(String msg){
		
		super(msg);
		
		
	}
	
}





public class BankBalance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	checkBalance cb=new checkBalance(123);
	System.out.println("the account number is: "+cb.getnum());
	cb.setbalance(9000);
	System.out.println("The balance in your acoount is: "+cb.getbalance());
	System.out.println("Enter the deposit amount: ");
	double damount=sc.nextDouble();
	cb.depoist(damount);
	System.out.println("the current balance: "+cb.getbalance());
	System.out.println("enter the withdraw amount: ");
	double dwithdraw=sc.nextDouble();
	cb.withdraw(dwithdraw);
	System.out.println(" remaining balance: "+cb.getbalance());

	
	
	
	
}
}
