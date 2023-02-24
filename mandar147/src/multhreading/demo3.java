package multhreading;//join method

import java.util.Scanner;

class calculator extends Thread{
	int total_marks;
	
	public void run() {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the marks1: ");
		int marks1=sc.nextInt();
		System.out.println("enter the marks 2: ");
		int marks2=sc.nextInt();
		total_marks=marks1+marks2;
		
	}
}


public class demo3 {
public static void main(String[] args) {
	calculator th=new calculator();
	
	th.start();
	 
	
	try {
		th.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	double per=th.total_marks/200.0*100;
	System.out.println("percentage:  "+per);
	
}
}
