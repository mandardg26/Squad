package inheritance;


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
class Andriod extends Mobile{
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

class NonAndriod extends Mobile{
	
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

class iphone extends Mobile{
	
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

class version extends Andriod{
String  processor;
int battery;

version(String type,int RAM,String name,int Simcard,String processor,int battery){
	
	super(type, RAM,name,Simcard);
	this.processor=processor;
	this.battery=battery;
	
	
	
	
}
	void versioninfo() {
		
		System.out.println("the processor in the phone is: "+processor);
		System.out.println("the battery of phone is: "+battery);
	}
	

 

}
public class demo1 {
	public static void main(String[] args) {
		
			
				version v=new version("touchscreen",4,"oppo",2,"sanp",1000);
				v.mobileinfo();
				v.Andriodinfo();
				v.versioninfo();
			System.out.println("*****************************************************************");
				System.out.println(" ");
				
				NonAndriod n=new NonAndriod("nontouchscreen",4,"nokia",2);
				n.mobileinfo();
				n.NonAndriodinfo();
				System.out.println("*****************************************************************");
				System.out.println(" ");
				
				
				iphone i=new iphone("iphone13",8,"iphone13",2);
				i.mobileinfo();
				i.iphoneinfo();
			}
	}


