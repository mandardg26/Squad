package exceptionhandling;

public class demo2 {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try{
			System.out.println(50/0);
		}
		catch(ArithmeticException f) {
			
			f.getStackTrace();
		}
		System.out.println("4");
	}
}
