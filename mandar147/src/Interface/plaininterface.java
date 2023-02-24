package Interface;

interface Animal{
	void AnimalType();
	void breed();
	
}
 class Dog implements Animal{

	@Override
	public void AnimalType() {
		// TODO Auto-generated method stub
		System.out.println("i am domestic animal");
		
	}

	@Override
	public void breed() {
		// TODO Auto-generated method stub
		System.out.println("i am German Shephard");
	}
	
}	

public class plaininterface {
public static void main(String[] args) {
	Dog D=new Dog();
	D.AnimalType();
	D.breed();
}
}
