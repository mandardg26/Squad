package multhreading;

class test extends Thread{
	
	
	public void run() {
		Thread.currentThread().setName("geeta");
		for (int i = 1; i <=3; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		
		
		
	}
	
}

public class yeildmethod {
public static void main(String[] args) {
	test t=new test();
	t.start();
	Thread.yield();//it gives the preference to the schedullar
	Thread.currentThread().setName("seeta");
	for (int i = 1; i <=3; i++) {
		System.out.println(Thread.currentThread().getName()+"-"+i);
	}
	
	
}
}
