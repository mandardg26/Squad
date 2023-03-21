package collectionframework;
import java.util.HashSet;

public class setclass {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("tiger");
	hs.add("Ant");
	hs.add("eagle");
	hs.add("wolf");
	hs.add(null);
	hs.add("giraffe");
	hs.add("Ant");
	
	System.out.println(hs);
}
}
