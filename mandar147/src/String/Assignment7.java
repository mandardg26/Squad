package String;

import java.util.Iterator;
import java.util.Scanner;

public class Assignment7 {
public static void main(String[] args) {
	System.out.println("enterv the String : ");
	Scanner sc=new Scanner (System.in);
	String name=sc.next();
	
	String s=name;
    for (int i = 0; i <s.length(); i++) {
    	
    	if (i%2==0) {
    		System.out.println(s.charAt(i));//this is charAt method
			
		}
    	
		
	}
	
}
}
