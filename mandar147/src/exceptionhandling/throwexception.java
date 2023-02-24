package exceptionhandling;

import java.util.Scanner;


class InvalidAgeException extends RuntimeException{
	String msg;
	
	InvalidAgeException(String msg){
		super(msg);
		
	}
	
	
	
	
	
}
public class throwexception {

	public static void main(String[] args) {
		System.out.println("enter age= " );
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();

		try {
		if(age>=18) {
			System.out.println("age is valid for voting!!!");
			
		}
		else {
			 throw new InvalidAgeException("age invalid for voting!!!");
			
		}
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("hello");
	}
	
}

