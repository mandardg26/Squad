package String;

public class Assignment2 {
public static void main(String[] args) {
	String s="MY NAME IS ROSHAN";
	String s1[]=s.split(" ");

	for (int  i = 3; i>=0; i--) {
		for (int j = i; j >=0; j--) {
			System.out.print(s1[j]+" ");
		}
		System.out.println();
	}
}
}
