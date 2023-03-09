package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;

public class demo3 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Red");
	al.add("yellow");
	al.add(null);
	al.add("green");
	al.add("yellow");
	al.add("orange");
	
	System.out.println(al);
	
	System.out.println("normal   for loop");
	for (int i = 0; i <al.size(); i++) {
		System.out.println(al.get(i));
		
	}
	
	System.out.println(" ");
	System.out.println("for each loop");
	for (String string : al) {
		System.out.println(string);
	}
	
	System.out.println(" ");
	
	System.out.println("while loop");
	
	/*Iterator is the element which is used to fetch the elements from collection
    
	we get implemented object  of the Iterator type by using .iterator()
	is present in all collection classes
	
	hasnext() checks whether there are more members to b fetched
	next() it fetched the next member*/
	
	System.out.println(" ");
	System.out.println("/nusing iterator: ");
	
	Iterator<String> i=al.iterator();
	while(i.hasNext()) {
	   System.out.println(i.next()
			   );	
	}
	}
	
	
}
