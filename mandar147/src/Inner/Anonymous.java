package Inner;


class A{
	

	void show() {
		
		System.out.println("I AM IN A");
		
	
	}
	
	
	
}



public class Anonymous {
 public static void main(String[] args) {
	A obj=new A()
	
{
		
		
		void show(){
			
			System.out.println("I AM IN B");
		}
	};
	obj.show();
}
}
