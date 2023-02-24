package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {
public static void main(String[] args) {
	try {
	FileInputStream fs=new FileInputStream("A.txt");
	}
	catch(FileNotFoundException e) {
		
		e.printStackTrace();
	}
	System.out.println("hello");
}
}
