/*package javawork;

class Mobile{
	
	
 	String type;
 	int RAM;
 	
 	Mobile(String type,int RAM){
 		
 		this.type=type;
 		this.RAM=RAM;
 	}
	
	void mobileinfo() {
		
		System.out.println("the type of mobile is: "+type);
		System.out.println("the ram inside the mobile: "+RAM);
	}
	
	
}
class Andriod{
	 String name;
	 int Simcard;
	 
	 Andriod(String type,int RAM,String name,int Simcard){
		 super(type,RAM);
		 this.name=name;
		 this.Simcard=Simcard;
		 
		 
	 }
	 
	 void Andriodinfo() {
		 
		 System.out.println("the name of mobile is : "+name);
		 System.out.println("sim card present in the mobile: "+Simcard);
	 }
	
}

class NonAndriod{
	
	String name;
	int simcard;
	
	
	NonAndriod(String type,int RAM,String name,int simcard){
		super(type,RAM);
		this.name=name;
		this.simcard=simcard;
		
		
		
	}
	
	void NonAndriodinfo() {
		
		System.out.println("the name of non andriod moboile is: "+name);
		System.out.println("the sim card present in non andriod mobile is: "+simcard);
	}
	
}

class iphone{
	
	String name;
	int simcard;
	
	
	iphone(String type,int RAM,String name,int simcard){
		super(type,RAM);
		this.name=name;
		this.simcard=simcard;
		
		
		
	}
	
	void iphoneinfo() {
		
		System.out.println("the name of non andriod moboile is: "+name);
		System.out.println("the sim card present in non andriod mobile is: "+simcard);
	}
}

class version{
String  processor;
int battery;

version(String type,int RAM,String name,int Simcard,String processor,int battery){
	
	super(type,RAM,name,Simcard);
	this.processor=processor;
	this.battery=battery;
	
	
	
	
}
	void versioninfo() {
		
		System.out.println("the processor in the phone is: "+processor);
		System.out.println("the battery of phone is: "+battery);
	}
	
}

public class demo {
public static void main(String[] args) {
	version v=new version();
	v.mobileinfo();
	v.Andriodinfo();
	v.versioninfo();
System.out.println("*****************************************************************");
	System.out.println(" ");
	
	NonAndriod n=new NonAndriod();
	n.mobileinfo();
	n.NonAndriodinfo();
	System.out.println("*****************************************************************");
	System.out.println(" ");
	
	
	iphone i=new iphone();
	i.mobileinfo();
	i.iphoneinfo();
}
}*/
