package exceptionhandling;

import java.util.Scanner;

class TooOldAgeException extends RuntimeException{
	String msg;
	TooOldAgeException(String msg){
		super(msg);
		
	}
	
}

class TooYoungAgeException extends RuntimeException{
	
	String msg;
	
	TooYoungAgeException(String msg){
		super(msg);
	}
}

public class MArriage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age: " );
	int age=sc.nextInt();
	try {
	if(age>18) {
		if(age<=60) {
			
			System.out.println("you are eligible for marriage");
			
		}
		else {
			
			 throw new TooOldAgeException("your age is exceed for marriage");
		}
		
	}
	else {
		throw new TooYoungAgeException("don't take tension wait you will get sutiable women for marriage");
	}
	}
	catch(TooOldAgeException e) {
		e.printStackTrace();
		
	}
	catch(TooYoungAgeException e) {
		e.printStackTrace();
	}
	System.out.println("hello");
}
	
}
