package Interface;

interface Vehicle{
	
	void vehicletype();
	
}
interface Car extends Vehicle{
	
	void speed();
}

class Maruti implements Car{

	@Override
	public void vehicletype() {
		// TODO Auto-generated method stub
		System.out.println("Four Wheeler");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("80 km/hr");
	}
	
	
}



public class extendedinterface {
	public static void main(String[] args) {
		Maruti M =new Maruti();
        	M.vehicletype();
        	M.speed();
	}


}
