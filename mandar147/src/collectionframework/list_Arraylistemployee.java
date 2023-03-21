package collectionframework;
import java.util.*;

public class list_Arraylistemployee {
public static void main(String[] args) {
	
	LinkedList<employee> li=new LinkedList<>();
	employee e1=new employee("Sanket",101,10000,"designer");
	employee e2=new employee("hiten",102,20000," python designer");
	employee e3=new employee("sanjay",103,30000," tester");
	
	li.add(e1);
	li.add(e2);
	li.add(e3);
	
	System.out.println("using iterator");
	Iterator<employee> it=li.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	
}
}
