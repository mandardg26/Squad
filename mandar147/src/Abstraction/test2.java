package Abstraction;

abstract class vehicle{
	abstract void price();
	
	 void speed() {
		
		
	}
	
}

class BMW extends vehicle{
	
	@Override
	public void price() {
		
		System.out.println("the price of Bmw is 700000");
	}
	
}
class Jaguar extends vehicle{
	 @Override
	 public void price() {
		 System.out.println("the price of jaguar is 10000000");
	 }
	
}
public class test2 {
	public static void main(String[] args) {
		BMW b =new BMW();
		 b.price();
		 Jaguar j=new Jaguar();
		 j.price();
	}
 
 
}
