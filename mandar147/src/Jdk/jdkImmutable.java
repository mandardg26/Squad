package Jdk;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class jdkImmutable {
public static void main(String[] args) {
	List l=List.of("Mohan", "Soham");
	//l.add(l);//factory list or list are umodifiable/immutable
	System.out.println(l);
	
	Set s=Set.of("Hello", "Samay");
	System.out.println(s);
	
	Map m=Map.of(1,"samy", 2,"345");
	System.out.println(m);
}
}
