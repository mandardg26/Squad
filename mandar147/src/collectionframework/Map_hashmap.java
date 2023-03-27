package collectionframework;
import java.util.*;




public class Map_hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(1, "Pankaj");
	hm.put(2, "Prabuddha");//Adding the value
	hm.put(3, "Anish");
	hm.put(4, "Rahul");
	hm.put(5, "Mandar");
	System.out.println(hm);
	System.out.println(hm.get(4));//for getting the value
	hm.remove(5);//for removing the value
	System.out.println(hm);
	System.out.println(hm.containsValue("Mandar"));//will throw the boolean value and check whetehr it is there or not
	System.out.println(hm.containsKey(2));
	hm.put(6, null);
	System.out.println(hm);
	
	System.out.println("------------------------------------");
	System.out.println(" ");
	
	HashMap<Integer,String> hm1=new HashMap<>();

	hm1.putAll(hm);//will put the values of the other maps
	hm1.put(5, "Mandar");
	System.out.println(hm1);
	
	System.out.println(hm1.keySet());//only key in form of collection
	System.out.println(hm1.values());//only values in form of collection
	System.out.println(hm1.entrySet());//both in form of collection
	
	Set s1=hm1.entrySet();//here we convert map to set collection
	for (Object object : s1) {
		System.out.println(object);
		
	}
	System.out.println("------------------------------------------------------");
	System.out.println(" ");
	
	Iterator i=s1.iterator();
    while (i.hasNext()) {
	       Map.Entry me=(Map.Entry)i.next();//downcasting 
	       System.out.println("key= "+me.getKey());//printing only key
	       System.out.println("value= "+me.getValue());//printing only value
	       me.setValue(me);
		
	}
	
	
}
}
