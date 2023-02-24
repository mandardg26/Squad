//class-the class is blueprint of an object or class in template of an object

// object- it is an real time entity which have its state and behaviour


package Test;

class bird{
	
	String name="Parrot";
	String color="Green";
	
	
	       void fly() {
	    	   System.out.println("I can fly");
	    	   
	       }
	       void eat() {
	    	   System.out.println("I can eat");
	    	   
	       }
	       
	       
}




public class Ex1 {
  public static void main(String[] args) {
	bird b=new bird();
	
	System.out.println("the name of bird is : "+b.name);
	System.out.println("the name of bird is : "+b.color);
	b.fly();
	b.eat();
	
	
}
}
