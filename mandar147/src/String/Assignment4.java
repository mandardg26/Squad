package String;

import java.util.Scanner;

public class Assignment4 {
public static void main(String[] args) {
	System.out.println("Enter the name: ");
	Scanner sc=new Scanner (System.in);
	String name=sc.nextLine();
	
	String s=name;
	String s2=s.toUpperCase();
	
	String s1[]=s2.split(" ");
	
	for (int i = 0; i <s1.length; i++) {
		
		String s3=s1[i];
		System.out.print(s3.charAt(0)+".");
	}
			
			
}
}
