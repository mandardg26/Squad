package collectionframework;
import java.util.*;

public class Map_SortedMap {
public static void main(String[] args) {
	SortedMap<Integer,String> sm=new TreeMap<>();
	sm.put(1, "Pankaj");
	sm.put(2, "Prabuddha");
	sm.put(3, "Anish");
	sm.put(4, "Rahul");
	sm.put(5, "Mandar");
	sm.put(6, "Tiger");
	sm.put(7, "Deer");
	sm.put(8, "Wolf");
	sm.put(9, "Ant");
	
	System.out.println(sm);
	
    System.out.println(sm.firstKey());//prints first key
    System.out.println(sm.lastKey());//prints last key
    System.out.println(sm.headMap(5));//head map prints its head portion elements without itself
    System.out.println(sm.tailMap(5));//tail map prints itself and tail portion elements
}
}
