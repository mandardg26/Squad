package test;

public class test {
public static void main(String[] args) {

	
	int count=0;
	String sum="";
	
	
	String s="Yellow Umbrella";
	
	for (int i = 0; i <s.length(); i++) {
		
		char ch=s.charAt(i);
		
		
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			
		   System.out.println(ch);
		}
		else {
		
		}
		
	}
		System.out.println("the vowels are: "+count);
		System.out.println("the constants are: "+sum);
		System.out.println();
	}



}
