package collectionframework;
import java.util.ArrayList;

public class demo2 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList <>();
	al.add("Red");
	al.add("yellow");
	al.add(null);
	al.add("green");
	al.add("yellow");
	
	System.out.println("before: "+al);
	System.out.println(al.get(2));
	System.out.println(al.remove(0));
	System.out.println("is pink in the list? "+al.contains("pink"));
	System.out.println("no of members present in the al= "+al.size());
	System.out.println("the index of the yellow element"+al.indexOf("yellow"));
	System.out.println("the index of last index of yellow: "+al.lastIndexOf("yellow"));
	al.clear();
	System.out.println("is al empty: "+al.isEmpty());
	
}
}