package collectionframework;
import java.util.*;

public class Queue_linkedlists {
public static void main(String[] args) {
	Queue<String> li=new LinkedList<>();
	System.out.println("adding elements: ");
	li.offer("anish");
	li.offer("prabuddha");
	li.offer("pankaj");
	li.offer("rahul");
	li.add("mandar");
	
	System.out.println(li);
	
	System.out.println("deletion of elements: ");
	System.out.println(li.poll());
	System.out.println(li);
	System.out.println(li.remove());
	
	System.out.println("retreive elements: ");
	System.out.println(li.peek());
	System.out.println(li);
	System.out.println(li.element());
}
}
