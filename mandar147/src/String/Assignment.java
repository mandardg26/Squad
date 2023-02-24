package String;

public class Assignment {
public static void main(String[] args) {
	String s="I LOVE MY COUNTRY";
	/*System.out.println(s);
	String s1=s.substring(0, 9);
	System.out.println(s1);
	String s2=s.substring(0, 7);
	System.out.println(s2);
	String s4=s.substring(0, 2);
	System.out.println(s4);*/
	
String s1[]=s.split(" ");

for (int  i =3; i>=0; i--) {
	for (int j = 0; j <=3; j++) {
		System.out.print(s1[j]+" ");
	}
	System.out.println();
}
		
	}
}

