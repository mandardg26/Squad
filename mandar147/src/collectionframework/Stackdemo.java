package collectionframework;
import java.util.*;

public class Stackdemo {
public static void main(String[] args) {
	Stack<String> v=new Stack<>();
	v.add("Apple");
	v.push("Mango");
	v.push("Banana");
	v.push("jackfruit");
	v.push("watermelon");
	
	System.out.println(v);
	v.pop();
	System.out.println("------------After pop-----------------");
	Enumeration<String> e=v.elements();
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
