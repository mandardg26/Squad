package collectionframework;
import java.util.ArrayList;
import java.util.Collections;

public class list_ArraylistPerson {
	public static void main(String[] args) {
		
		/*
		 *      comparable
		 *      
		 *      when array list members are simple string,integers etc we are able to sort the members easily
		 *      using colletions.sort();
		 *      but when array list members are complex such as class object as shown below
		 *      in our example each member is a person class object.Each person has id,address,name,contact of different type of data
		 *      in such cases collections.sort( )will not be able to sort 
		 *      it will not understand on what basis it needs to sort so we use either comparable/comparator to clearly specify which variable
		 *      needs to be compare for sorting
		 *      
		 *      comparator
		 *      
		 *      comparator is interface having compare method this method is used to compare objects
		 *      steps to use comparator
		 *      1.make new class for comparing any one variable of class
		 *      2.implement and import comparator interface
		 *      3.overide compare method where we specify which variable to compare
		 *      4.when calling collections.sort() for sorting we pass two parameters 
		 *         a.list which we want to do sorting
		 *         b.the object of class on which you have implemented comparator
		 */
		ArrayList<Person>al=new ArrayList<>();
	Person p1=new Person(101,"ajay","stationpada",1675435678);
	Person p2=new Person(103,"atul","mandirpada",777608025);
	Person p3=new Person(102,"rahul","badlapurWest",895812374);
	Person p4=new Person(106,"prabhuddha","dombivli",781245745);
	Person p5=new Person(104,"pankaj","Panvel",989456127);
	Person p6=new Person(105,"anish","kalyan",784596384);
	
	al.add(p1);
	
	al.add(p2);
	
	al.add(p3);
	
	al.add(p4);
	
	al.add(p5);
	
	al.add(p6);
	
	for (Person s : al) {
		System.out.println(s);
	}
	System.out.println("------------After sorting");
		Collections.sort(al);
		System.out.println(al);
		
	}
	

}
