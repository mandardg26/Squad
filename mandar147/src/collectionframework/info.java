package collectionframework;
import java.util.*;

public class info {
public static void main(String[] args) {
	
	ArrayList<Student> al=new ArrayList<>();
	Student s1=new Student(101,"Prabuddha","Dombivali",80);
	Student s2=new Student(102,"Anish","Kalyan",90);
	Student s3=new Student(103,"Pankaj","Panvel",70);
	Student s4=new Student(104,"Rahul","Badlapur",95);
	
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	System.out.println("-----------------------------details are: ");
	
	
	for (Student student : al) {
		System.out.println(student);
	}
	
	System.out.println("using iterator: ");
	Iterator<Student> i=al.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
	
	
}
}
