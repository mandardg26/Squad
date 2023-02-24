package test;

interface car1{
	static int wheels=4;
	static int seats=4;
	
	void color();
	void speed();
	void wheels();
	void seats();
	
}

class BMW1 implements car1{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("the color of car is blue ");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("the speed of the car is 100km/hr");
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("the wheels of bmw is: "+wheels);
	}

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		System.out.println("the seats of bmw is : "+seats);
	}
	
	
	
}

class Maruti implements car1{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("the color of car is white ");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("the speed of the car is 50km/hr");
	}
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("the wheels of maruti is: "+wheels);
	}

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		System.out.println("the seats of maruti is : "+seats);
	}
	
	
}

public class test2 {
	public static void main(String[] args) {
		BMW1 b=new BMW1();
		
		b.color();
		b.speed();
		b.seats();
		b.wheels();
		System.out.println("  ");
		
		Maruti m =new Maruti();
		m.color();
		m.speed();
		m.wheels();
		m.seats();
		
		
	}

}
