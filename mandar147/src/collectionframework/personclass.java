package collectionframework;



class Person implements Comparable<Person>{
	Integer id;
	String name;
	String Address;
	Integer phoneno;
	
	Person(Integer id,String name,String Address,Integer phoneno){
		
		this.id=id;
		this.name=name;
		this.Address=Address;
		this.phoneno=phoneno;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String toString() {
		
return "PersonId\t: "+id+ "\nPersonname\t: "+name+ "\nPersonAddress\t: "+Address+ "\nPersonphoneno\t: "+phoneno+"\n";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}

	
	
}

public class personclass {
 {

 
 
}
}
