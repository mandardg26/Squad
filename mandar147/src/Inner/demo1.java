package Inner;

class Outer{
	
	int a=35;
	class Inner{
		
		void show() {
			
			System.out.println("the value of a is: "+a);                  //the values of outer class can be accesible in inner class
			
		}
		
		
	}
	
}




public class demo1 {
public static void main(String[] args) {
	Outer o=new Outer();
	
	Outer.Inner in=o.new Inner();
	in.show();
}
}
