//constructor-It is special type of method.it's name is same as class name.

package Test;

class car{
	
	String name;
	String color;
	
 car(){                                     //constructor overloading =same name but one is zero and another is parameterized
	 name="bmw";
	 color="black";
	 
 }
 
 car(String name,String color){
  
	 this.name=name;
	 this.color=color;
	 
	 
 }
}

public class Ex3 {
 public static void main(String[] args) {
	 
	 
	car c1=new car("audi","white");
   System.out.println("the name of car is : "+c1.name);
   System.out.println("the color of car is : "+c1.color);
   
   System.out.println(" ");
   
   
   car c2=new car();
   System.out.println("the name of car is : "+c2.name);
   System.out.println("the color of car is : "+c2.color);
}
}
