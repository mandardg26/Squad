package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;

public class list_Arrayusingforloop {
public static void main(String[] args) {
	
	ArrayList<Integer>num=new ArrayList();
	num.add(12);
	num.add(44);
	num.add(55);
	num.add(91);
	
	System.err.println(num);
	System.out.println("Using simple for loop:" );
	
	for (int i = 0; i <num.size(); i++) {
		System.out.println(num.get(i));
		
		
	}
	
	System.out.println("Using for each: ");
	
	for (Integer integer : num) {
		System.out.println(integer);
		
	}
	
	System.out.println("using while loop: ");
	
	Iterator<Integer>i=num.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
		
	}
}

