package Interface;

class person{
	int id;
	String name;
	
	person(int id,String name){
		this.id=id;
		this.name=name;
		
		
	}
	void persondata() {
		
		System.out.println("the id of person is : "+id);
		System.out.println("the id of person is : "+name);
	}
}

class Manager extends person implements Employee{
	
	int salary;
	int experience;
	
	Manager(int id,String name,int salary,int experience){
		super(id,name);
		this.salary=salary;
		this.experience=experience;
		
		
	}
	void Managerdata() {
		System.out.println("the salary of manager is: "+salary);
		System.out.println("the experience of manager is : "+experience);
		
	}
	@Override
	public void pfdetails() {
		// TODO Auto-generated method stub
		System.out.println("the private fund of person is 10000");
	}
	
}
interface Employee{
	void pfdetails();
}

public class demo {
public static void main(String[] args) {
	Manager m=new Manager(101,"prasad",1000000,2 );
	m.persondata();
	m.Managerdata();
	m.pfdetails();
}
}
