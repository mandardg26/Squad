package Inner;

class Outer1{
	
	void getvalue() {
		
		int sum=20;
		int divisor=5;
		
		class inner1{
			
			private int getdivisor() {
				
				return divisor;
				
			}
			
			private int getremainder() {
				
				return sum%divisor;
				
			}
			
			private int getquotient() {
				
				return sum/divisor;
			}
			
			
		}
		
		inner1 o=new inner1();
		
		System.out.println("Divisor= "+o.getdivisor());
		System.out.println("Remainder= "+o.getremainder());
		System.out.println("Qoutient= "+o.getquotient());
		
		
	}//method close
	
	
}//outer close


public class demo2 {
public static void main(String[] args) {
	Outer1 obj=new Outer1();
	obj.getvalue();
}
}
