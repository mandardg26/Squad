package Encapsulation;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the qunatity of food: ");
	int n= sc.nextInt();
	for (int i = 0; i <n; i++) {
		food f=new food();
		System.out.println("enter the id of the food: ");
		int id =sc.nextInt();
		f.setfid(id);
		System.out.println("enter the name of the food: ");
		String name=sc.next();
		f.setfname("name");
		System.out.println("the price of one food quantity is : ");
		int price=sc.nextInt();
		f.setfprice(n*price);
		System.out.println("the  quantity of food is: ");
		int qty =sc.nextInt();
		f.setfquantity(qty);
		
		
		System.out.println(f);
	}
	
	
	
	
	
	
	
}
}
