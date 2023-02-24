package inheritance;
class car1 {

	String color;
	int speed;
	
	car1(String color,int speed){
		
		this.color=color;
		this.speed=speed;
		
		
	}
	void cardata() {
		
		System.out.println("the color of car is: "+color);
		System.out.println("the speed of car is: "+speed);
	}
}	
	class Mercedes extends  car1{
		int seats;
		int price;
		
		Mercedes(int seats,int tyres,String color,int speed){
			super( color, speed);
			this.seats=seats;
			this.price=price;
			
			}
		void Mercedesdata() {
			System.out.println("the number of seats are : "+seats);
		    System.out.println("the no of tyres are: "+price);
		}
	}		
public class singleinheritance {
    public static void main(String[] args) {
    	Mercedes m=new Mercedes(4,4,"BLUE",500000);
		m.cardata();
		m.Mercedesdata();
		
		
	}
}

