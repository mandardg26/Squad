package Interface;

interface Vechicle{
	
	void vechicletype();
	
	interface Car{
		
		void speed();
		
		
	}
	interface Bike{
		
		void price();
	}
}
class BMW implements Vechicle,Vechicle.Car,Vechicle.Bike{
	@Override
	public void vechicletype() {
		System.out.println("BOTH");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("10000000");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("200 km/hr");
	}
	
}

public class NestedInterface {
public static void main(String[] args) {
	BMW b =new BMW();
	b.price();
	b.speed();
	b.vechicletype();
	
}
}
