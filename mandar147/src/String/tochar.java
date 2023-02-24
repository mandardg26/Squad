package String;

public class tochar {
public static void main(String[] args) {
	String s="Mandar gurav";
	char s1[]=s.toCharArray();
	for (char ch : s1) { ///for each loop
		System.out.println(ch);
		
		
	}
	System.out.println("-------------------------------------------");
	
	char s2[]= {'m','a','n','d','a','r'};
	String s3=new String (s2);
	System.out.println(s2);
	
	System.out.println("--------------------------------------------");
	
	String s4="hello world";
	String s5=s4.substring(6);
	System.out.println(s5);
	String s6=s4.substring( 11);
	System.out.println(s6);
}
}
