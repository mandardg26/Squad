package Encapsulation;

class food{
	
	private int fid;
	private String fname;
	private int fprice;
	private int fquantity;
	
	
	public int getfid() {
		
		return fid;
	}
	public void setfid(int fid) {
		this.fid=fid;
		
		
	}
	
	public String getfname() {
		
		return fname;
	}
	public void setfname(String fname) {
		
		this.fname=fname;
	}
   public int getprice() {
		
		return fprice;
	}
	public void setfprice(int fprice) {
		this.fprice=fprice;
		
		
	}
	
	public int getfquantity() {
		
		return fquantity ;
	}
	public void setfquantity(int fquantity) {
		
		this.fquantity=fquantity;
	}
	
	
	public String toString() {
		
		return "the id of the food is\t: "+fid+"\nthe name of the food is\t: "+fname+"\nthe price of the food is: "+fprice+"\nthe quantiy of food is\t: "+fquantity;
	}
	
	
	
}





public class demo {

}
