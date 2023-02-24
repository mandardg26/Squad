package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class readwrite{
	
	void read() throws FileNotFoundException
	{
		FileInputStream fs=new FileInputStream("A.txt");
		
		
	}
	
}





public class throwsexception {
public static void main(String[] args) 

{
	readwrite rw=new readwrite();
	try {
	rw.read();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("hello");
	
	
	
}
}
