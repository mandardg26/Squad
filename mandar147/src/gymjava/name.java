package gymjava;

class Gym{
	String name,nid;
	int age,time;
	String Address;
	long phoneno;
	int Total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Gym [name=" + name + ", age=" + age + ", phoneno=" + phoneno + ", time=" + time + ", nid=" + nid
				+ ", Address=" + Address + "]";
	}
	public Gym(String name, int age, long phoneno, int time, String nid, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.time = time;
		this.nid = nid;
		Address = address;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("customer Id: "+nid);
		System.out.println("Address: "+Address);
		System.out.println("Mobile Number: "+phoneno);
		System.out.println("time avability: "+time);
	
	}
		
		
	}
	
	




public class name {
public static void main(String[] args) {
	
}
}
