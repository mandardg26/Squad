package collectionframework;
import java.util.*;

public class Map_LINKEDHashmap {
public static void main(String[] args) {
	
	LinkedHashMap<Integer,String> lh=new  LinkedHashMap<>();
	lh.put(1, "Tiger");
	lh.put(2, "Deer");
	lh.put(3, "Wolf");
	lh.put(4, "Ant");
	System.out.println(lh);
	System.out.println("------------------------------------------");
	
	lh.remove(3);
	System.out.println(lh);
	System.out.println(lh.containsKey(1));
	System.out.println(lh.containsValue("Ant"));
	
	System.out.println("------------------------------------------");
	
	System.out.println(lh.keySet());
	System.out.println(lh.values());
	System.out.println(lh.entrySet());
	
	Set s=lh.entrySet();
	
	System.out.println(" ");
	
	
	Iterator i=s.iterator();
	while(i.hasNext()) {
		
		Map.Entry me=(Map.Entry)i.next();
		System.out.println("value= "+me.getValue());
		
	}
	
	
}
}
