package multhreading;

class SeatBooking {
	
	int Totalseats=10;
	void seatbook(int seat) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
		
		if(Totalseats>=seat) {
			
			System.out.println(seat+"seat succcessfully done!!!!!!!");
			Totalseats=Totalseats-seat;
			System.out.println(Totalseats+"seats left");
			System.out.println(" ");
			System.out.println("*******************************************");
		}
		
		
		else {
			System.out.println("seats not available!!!!!!");
			System.out.println(Totalseats+"seats left");
		}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
	
	
}





public class MovieTicketApp extends Thread

{
	static SeatBooking b;
	int seat;
	public void run() {
		
		
		
		b.seatbook(seat);
		
	}
	
	
	
	
	
public static void main(String[] args) {
	b=new SeatBooking();
	 MovieTicketApp sam =new  MovieTicketApp();
	 sam.seat=7;
	 sam.start();
	 
	 MovieTicketApp ram=new  MovieTicketApp();
	 ram.seat=8;
	 ram.start();
	 
}
}
