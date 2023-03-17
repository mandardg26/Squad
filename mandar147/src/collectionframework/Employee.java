package collectionframework;

class employee{
   String name;
	int sal,id;
	String design;
	
	employee(String name,int id,int sal,String design ){
		this.name=name;
		this.id=id;
        this.sal=sal;
        this.design=design;
        
		
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", sal=" + sal + ", design=" + design + "]";
	}
	

	
	
}

public class Employee {
public static void main(String[] args) {
	
}
}
