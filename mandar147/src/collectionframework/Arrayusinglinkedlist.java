package collectionframework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Arrayusinglinkedlist {
	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<>();
		li.add("Red");
		li.add("yellow");
		li.add(null);
		li.add("green");
		li.add("yellow");
		System.out.println(li);
		System.out.println("");
		
		System.out.println("list iterator: ");//forward to backward
		
		Iterator<String>St=li.iterator();
		while (St.hasNext()) {
			System.out.println(St.next());
			
		}
		System.out.println("");
		System.out.println("linked list iterator: ");//backward to forward
		
		ListIterator<String>str=li.listIterator(li.size());
		while (str.hasPrevious()) {
			System.out.println(str.previous());
			
		}
	}

}
