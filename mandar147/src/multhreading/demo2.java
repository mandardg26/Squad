package multhreading;

class Mythread1  extends Thread implements Runnable{
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("hello");
			
			try {
				
				mythread.sleep(1000);
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
		}
		
	}
}

public class demo2 {
public static void main(String[] args) {
	Mythread1 mt =new Mythread1();

	mt.start();
}
}
