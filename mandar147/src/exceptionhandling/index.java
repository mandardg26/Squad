package exceptionhandling;

public class index {
public static void main(String[] args) {
	try {
	int  sem[]= new int[2];
	
	
	sem[3]=4;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("hello");
	
}
}
