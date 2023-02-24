package String;

public class Asignment6 {
public static void main(String[] args) {
   String rem="";
	String s="NITIN";
	
	
	
	
	for (int i =s.length()-1; i >=0; i--) {
	
		
		
		
		 rem=rem+s.charAt(i);
	}
	if (s.equals(rem)) {
		System.out.println("palindrome");
	} else {

		System.out.println("not palindrome");
	}
	
	
		
		
	}
	
}


