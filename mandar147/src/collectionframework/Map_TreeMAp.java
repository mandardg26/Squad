package collectionframework;
import java.util.*;

public class Map_TreeMAp {
public static void main(String[] args) {
	
	TreeMap<Integer,String> tm=new TreeMap<>();
	tm.put(1, "Pankaj");
	tm.put(2, "Prabuddha");
	tm.put(3, "Anish");
	tm.put(4, "Rahul");
	tm.put(5, "Mandar");
	tm.put(6, "Tiger");
	tm.put(7, "Deer");
	tm.put(8, "Wolf");
	tm.put(9, "Ant");
	
	System.out.println(tm);
	
	System.out.println(tm.firstKey());
	System.out.println(tm.lastKey());
	System.out.println(tm.headMap(6));
	System.out.println(tm.tailMap(6));
	System.out.println(tm.subMap(1, 6));//the values between the two keys are been executed
}
}
