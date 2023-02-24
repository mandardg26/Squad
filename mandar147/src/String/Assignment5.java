package String;

import java.util.Iterator;
import java.util.Scanner;

public class Assignment5 {
public static void main(String[] args) {
	String rem2="";
	String rev3="";
	
	System.out.println("enter the String: ");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	String rem="";
	String s=name;
	
	for (int i =s.length()-1; i >=0; i--) {
		
		
		
		
		 rem=rem+s.charAt(i);
	}
	String s2=rem.toUpperCase();
	System.out.println(s2);
	
	rem2=rem2+s2.charAt(0);
	String First=rem2.toLowerCase();
	
	for (int j = 1; j <=s2.length()-1; j++) {
		 rev3=rev3+s2.charAt(j);
		 
		 
		
	}
		System.out.println(First+rev3);
		
	}
	
}

