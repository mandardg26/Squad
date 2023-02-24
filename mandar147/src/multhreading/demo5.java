package multhreading;



class  Daemonthread1 extends Thread{
	
	public void run() {
    if (Thread.currentThread().isDaemon()) {
    	System.out.println("is Daemon");
    }
    else {
    	
    	System.out.println("not daemon");
    }
		

	}
	
}
public class demo5 {
public static void main(String[] args) {
	System.out.println("Daemon thread");
	Daemonthread1 dth1=new Daemonthread1();
	//Thread.currentThread().setDaemon(true);illegal thread state exception
  //  dth1.setDaemon(true);
	
	dth1.start();
	
}
}
