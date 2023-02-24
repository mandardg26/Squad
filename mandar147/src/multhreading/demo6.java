package multhreading;

class Multithreading extends Thread{
	
	public void run() {
		
		Thread.currentThread().setPriority(MAX_PRIORITY);;
		System.out.println("child thread:"+Thread.currentThread().getPriority());
		
	}
	
}
class test2 extends Thread{
	
	public void run() {
		
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		System.out.println("test thread: "+Thread.currentThread().getPriority());
	}
	
}
public class demo6 {
public static void main(String[] args) {
	Multithreading mt=new Multithreading();
	
	
	Thread.currentThread().setPriority(8);
	System.out.println("main thread: "+Thread.currentThread().getPriority());
    try {
	mt.join();
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
	mt.start();
	test2 t=new test2();
	t.start();
	
}
}
