package String;

import java.util.Scanner;


class  InvalidPasswordException extends RuntimeException{
	String msg;
	
	InvalidPasswordException(String msg){
		
		super(msg);
	}
}
public class demo3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the password: ");
	String pass =sc.next();
	String  password=new String (pass);
	System.out.println("confirm password: ");
	String confirm =sc.next();
	String con=new String(confirm);
	int i=pass.compareTo(con);
	if(i==0) {
		
		System.out.println("password match successful");
	}
	else {
		
		throw new InvalidPasswordException("password is incorrect");
	}
}
}
