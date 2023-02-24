package test;

import java.util.Scanner;

public class exam2chandani {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String rev=" ";
		String rev1=" ";
		String rev3=" ";
		String s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		String s2=rev.toUpperCase();
        System.out.println("rev String is"+rev);
        System.out.println("upper case String "+s2);
        
		
	}

}
