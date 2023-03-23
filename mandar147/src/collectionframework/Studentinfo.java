package collectionframework;

class Student{
	
	int studentid;
	String name;
	String Address;
	int percentage;
	
	Student(int studentid,String name,String Address,int percentage){
		this.studentid=studentid;
		this.name=name;
		this.Address=Address;
		this.percentage=percentage;
		
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", Address=" + Address + ", percentage="
				+ percentage + "]";
	}
	
	
	
}

public class Studentinfo {
public static void main(String[] args) {
	
}
}
