package collectionframework;
import java.util.*;

public class Sortedhashsetclass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the list: ");
	
	
	List<String> s=new ArrayList<>();
	for (int i = 1; i <=5; i++) {
		s.add(sc.next());
		
	}
	
	System.out.println("list with the duplicate: "+s);//upcasting using Arraylist
	
	Set<String> set=new TreeSet<String>(s);
	System.out.println("the duplicate values are: "+ set);//upcasting using tree
}
}
