
package classtest;



class maruti{
	int seat ;
	int tyres;
	String color ;
	int speed;
	
	maruti(){ //zero
		seat=4;
		tyres=4;
		
	}
	
	
	
	maruti(String color,int speed){//  parameterrized
		
		this.color=color;
		this.speed=speed;
		
	}
	
	void carinfo() {
		
		System.out.println("the color of the car is: "+color);
		System.out.println("the speed of the car is: "+speed);
		
	}

	
	
}





public class ex3 {
public static void main(String[] args) {
	maruti m=new maruti();
	System.out.println("the seats of car is: "+m.seat);
	System.out.println("the tyre of car is: "+m.tyres);

	
	maruti m1=new maruti("blue",150);
	m.carinfo();
	
	
	
}
}
