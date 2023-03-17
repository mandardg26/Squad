package collectionframework;
import java.util.*;

public class vectordemo {
public static void main(String[] args) {
	
	Vector<String> v=new Vector<>();
	v.add("Apple");
	v.add("Mango");
	v.add("Banana");
	v.add("jackfruit");
	v.add("watermelon");
	
	System.out.println(v);
	
	System.out.println("-----------------using enumeration------------------");
	 Enumeration <String> e=v.elements();
	 
	 while (e.hasMoreElements()) {
	System.out.println(e.nextElement());
		
	}
}
}
