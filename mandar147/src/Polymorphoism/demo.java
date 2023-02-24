package Polymorphoism;

class shape{
	
	double area(double r)
	{
		
		double Area=3.14*r*r;
		return Area;
		
	}	
	void area(int L,int B) {
		
		int a=L*B;
		System.out.println("the area of rectangle is: "+a);
	}
	
	void area(int side) {
		
		int A=side*side;
		System.out.println("the area of square is: "+A);
	}
}
public class demo {
public static void main(String[] args) {
	shape s=new shape();
	double Area=s.area(2.00);
	System.out.println("the area of circle is: "+Area);
	s.area(14);
	s.area(12, 13);
}
}
