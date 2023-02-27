package Filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
public static void main(String[] args) {
	try {
		FileOutputStream fo=new FileOutputStream("A.txt");
		String s="Mandar is good boy";
		byte b[]=s.getBytes();
		fo.write(b);
		System.out.println("data has been written");
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
