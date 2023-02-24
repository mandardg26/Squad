package multhreading;


class mythread extends Thread{
	
	public void run() {
   for(int i=1;i<=5;i++) {
		System.out.println("squad");
		
   
   try {
	   
	   Thread.sleep(2000);
   }
   catch(Exception e) {
	   
	   e.printStackTrace();
	   
   }
   }
	}
	
}

public class demo1 {
public static void main(String[] args) {
	mythread mt=new mythread();
	mt.start();
	
}
}
