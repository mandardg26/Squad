package Jdk;

import java.util.Scanner;

interface intraf{
	default void add() {
		int a=getdata();
		int b=getdata();
		System.out.println("addition="+(a+b));
		
	}
	
	default void sub() {
		
		int a=getdata();
		int b=getdata();
		System.out.println("subtarction="+(a-b));
		
		
	}
	
	private int getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int i=sc.nextInt();
		return i;
		
		
		
		
	}
	
}

public class Jdk9 implements intraf{
public static void main(String[] args) {
	Jdk9 m=new Jdk9();
	m.add();
	m.sub();
}
}
