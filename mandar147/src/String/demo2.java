package String;

public class demo2 {
public static void main(String[] args) {
	String s1=new String("deepak");
	String s2=new String("deepak");
	System.out.println(s1==s2);
	String s3="amit";
	String s4="Amit";
	System.out.println(s3==s4);//A=location would be different i.e case sensitive
	System.out.println(s1.equals(s2));
	
}
}
