package gymjava;

import java.util.Scanner;
import java.util.*;

public class maingym {
 
	String name,nid;
	int age,time;
	long phoneno;
	String pack;
	String Address;
	int count=0;
	int Total;
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Gym> c=new ArrayList<>();
	
	public void plan() {
		ArrayList<plan> p=new ArrayList<>();
		plan p1=new plan(101,"Gym only",5000);
		plan p2=new plan(102,"cardio only",3000);
		plan p3=new plan(103,"Gym+cardio",7000);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		System.out.println();
		
		for (plan plans : p) {
			System.out.println(plans);
		}
		
		System.out.println("Enter Your Plan Choice : ");
		int choice = sc.nextInt();
		int cost=0;
		switch (choice) {
		case 101: 
			cost=p1.getRev();
			break;
			
		case 102: 
			cost=p2.getRev();
			break;
			
		case 103: 
			cost=p3.getRev();
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		Total=cost;
	}
	
	
	void operations() {
		System.out.println("1.Add Customer: ");
		System.out.println("2.Update Customer: ");
		System.out.println("3.Delete Customer: ");
		System.out.println("4.Search Customer: ");
		System.out.println("5.Get All Customer: ");
		System.out.println("6.Exit: ");
		System.out.println(" ");
		
		
	}
	
	public long phone1() {
		System.out.println("Enter the Mobile No: ");
	String	phone =sc.next();
		if (phone.length() == 10) {
			phoneno = Long.parseLong(phone);
			
		}
		else {
			System.out.println("Please Enter 10 Digit Mobile No..!!");
			phoneno = phone1();
		}
		return phoneno;
	}
		
	
	
	
	void add() {
		
		System.out.println("Add Customer");
		System.out.println("Enter the name of the customer: ");
		name=sc.next();
		
		System.out.println("Enter id: ");
		nid=sc.next();
		System.out.println("Age: ");
		age=sc.nextInt();
		System.out.println("enter the address: ");
		Address=sc.next();
		//Adding phone no
		phoneno=phone1();
		System.out.println("avability time: ");
		time=sc.nextInt();
		Gym gym=new Gym(name,age,phoneno,time,nid,Address);
		c.add(gym);
		plan();
		System.out.println("User information added successfully!!!!");
		
		
	}
	
	void update() {
		System.out.println("enter the name of customer: ");
		name=sc.next();
		
		for (Gym gym : c) {
			if(gym.getName().equals(name)) {
				
				System.out.println("Enter the name of the customer: ");
				name=sc.next();
				System.out.println("Age: ");
				age=sc.nextInt();
				System.out.println("enter the address: ");
				Address=sc.next();
				//Adding phone no
				phoneno=phone1();
				System.out.println("avability time: ");
				time=sc.nextInt();
				plan();
				
			}
			gym.setName(name);
			gym.setAge(age);
			gym.setAddress(Address);
			gym.setPhoneno(phoneno);
			gym.setTime(time);
			System.out.println("Member updated successfully!!!!!");
		}
		
		
	}
		
		
		
	
	  
	 void delete() {
		 boolean found=false;
		 System.out.println("enter the id of the member to delete: ");
		 String tid=sc.next();
		 Iterator<Gym> i=c.iterator();
		 while (i.hasNext()) {
			Gym gym=i.next();
			if (gym.getNid()==tid) {
				i.remove();
				found=true;
			}
			
			if(!found) {
				System.out.println("---------------------------------");
				System.out.println("record not found!");
				System.out.println("----------------------------------");
			}
			
			else {
				
				System.out.println("---------------------------------");
				System.out.println("record delete successfully!");
				System.out.println("----------------------------------");
			}
		}
		
	   
	     }
	 
	 
	 void get() {
		 
		 System.out.println("All the Book are: ");
		 if (c.isEmpty()) {
			System.out.println("no members!!!!!");
		}
		
	    for (Gym gym : c) {
			System.out.println(gym);
		}
	    
			
		
	    
				
	 }
	 }
		
		 
		 
		 
		 
	 
	


