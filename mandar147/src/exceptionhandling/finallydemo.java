package exceptionhandling;

public class finallydemo {
public static void main(String[] args) {
	try {
	int a=25,b=0,c;
	
	c=a/b;
	System.out.println(c);
	}
	
	catch(ArithmeticException f) {
		f.printStackTrace();
		
	}
	finally {
		
		System.out.println("I always Execute" );  //it gets executed whether error occured or not
		
		
	}
	System.out.println("hello");
	
}
}
