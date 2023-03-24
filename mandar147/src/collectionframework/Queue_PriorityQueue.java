package collectionframework;
import java.util.PriorityQueue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<>();
		/*System.out.println(pq.poll());//null values execute
		System.out.println(pq.remove());//throws exception
		System.out.println(pq.element());//throws exception
		System.out.println(pq.peek());//null values execute*/
		System.out.println("Adding elements: ");
		pq.offer("monkey"); //used to add elements
		pq.offer("zebra");
		pq.offer("cat");
		pq.offer("dog");
		pq.offer("tiger");
		pq.add("wolf");
		
		System.out.println(pq);
		
		System.out.println("delete elements: ");
		System.out.println(pq.poll()); //used to delete 
		System.out.println(pq.remove());
		
		System.out.println("retrive value: ");
		System.out.println(pq.peek());//used to retreive
		System.out.println(pq.element());
		
		
	}

}
