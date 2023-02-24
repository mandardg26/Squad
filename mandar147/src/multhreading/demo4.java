package multhreading;//daemon thread

class  Daemonthread extends Thread{
	
	public void run() {
		
      System.out.println("current thread");		
		

	}
	
}
public class demo4 {
public static void main(String[] args) {
	System.out.println("Daemon thread");
	Daemonthread dth=new Daemonthread();
	//Thread.currentThread().setDaemon(true);illegal thread state exception
    dth.setDaemon(true);
	
	dth.start();
	
	
	
}
}
