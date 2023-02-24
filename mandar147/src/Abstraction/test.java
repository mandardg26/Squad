package Abstraction;
abstract class  Bank{
	
	abstract void rate_of_int();
}

class Sbi extends Bank{
	
	@Override
	public void rate_of_int() {
		System.out.println("rate of intrest is 7 %");
	} 
}

class DNS extends Bank{
	@Override
	public void rate_of_int() {
		System.out.println("the rate of intrest is 8%");
	}
}

public class test {
	public static void main(String[] args) {
		Sbi s =new Sbi();
	     s.rate_of_int();
	     DNS d=new DNS();
	     d.rate_of_int();
	     
	}
     
}
