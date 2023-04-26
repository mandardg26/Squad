package Jdk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class jdk91 {
public static void main(String[] args) throws IOException {
	FileOutputStream fis=new FileOutputStream("A.txt");
	try(fis) {
	String s="Helllo";
	fis.write(s.getBytes());
	System.out.println("successfully done!!!");
	}
	
	
}
}
-