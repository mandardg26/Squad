package collectionframework;
import java.util.ArrayList;
import java.util.Collections;

public class list_Arraylistsort {
public static void main(String[] args) {
	
	/*by default array does not sort its members in any order
	
	collections class is provided by java to manipulate the members of our collection.So if we want to rearrange
	the members of our arraylist we take the help of collection class methods
	
	collection class is singleton class .its constructor is private ,so we will not be able to create the object 
	of collection class in new keyword
	All methods in collection class is static and we can them directly by name*/
	
	ArrayList<String>al=new ArrayList<>();
	al.add("red");
	al.add("yellow");
	al.add("pink");
	al.add("green");
	al.add("yellow");
	al.add("orange");
	
	System.out.println("-----------------------before sorting----------------- ");
	System.out.println(al);
	System.out.println("");
	
	System.out.println("------------------After sorting------------------ ");
	Collections.sort(al);
	System.out.println(al);
	
}
}
