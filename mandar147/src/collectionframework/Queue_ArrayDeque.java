package collectionframework;
import java.util.*;

public class Queue_ArrayDeque {
public static void main(String[] args) {
	ArrayDeque <String> ad=new ArrayDeque<>(); 
	System.out.println("the elements are: ");
	ad.addFirst("Pankaj"); //add first elements
	ad.offerLast("Anish");
	ad.offerFirst("Prabuddha");//add last elements
	ad.addLast("Rahul");
	
	System.out.println(ad);
	
	System.out.println("deletion of elements: ");
	System.out.println(ad.pollFirst());//delete first
	System.out.println(ad.pollLast());//delete last
	System.out.println(ad);
	
	System.out.println("reterive of elements: ");
	System.out.println(ad.peekFirst());//retrive first                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	System.out.println(ad.peekLast());//retrive last
	System.out.println(ad);
}
}