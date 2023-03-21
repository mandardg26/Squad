package collectionframework;
import java.util.*;
public class Linkedhashsetclass {
public static void main(String[] args) {
	LinkedHashSet<String> ls=new LinkedHashSet<>();
	ls.add("tiger");
	ls.add("Ant");
	ls.add("eagle");
	ls.add("wolf");
	ls.add(null);
	ls.add("giraffe");
	ls.add("Ant");
	System.out.println(ls);
}
}
