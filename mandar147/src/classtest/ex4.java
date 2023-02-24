package classtest;

class rectangle{
	int length;
	int breadth;
	
	
	rectangle(){
		
		length=10;
		breadth=20;
	}
	
	rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	
}



public class ex4 {
	public static void main(String[] args) {
		rectangle r=new rectangle();
		System.out.println("the length of rectangle is: "+r.length);
		
		rectangle r1=new rectangle(21,31);
		System.out.println("the length of rectangle is: "+r1.length);
	}

}
