package Filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo3 {
public static void main(String[] args) {
	try {
	FileInputStream fs=new FileInputStream("A.txt");
	FileOutputStream fo=new FileOutputStream("backup.txt");
	byte b[]=new byte[fs.available()];
	fs.read(b);
	fo.write(b);
	System.out.println("file has been written");
	
	
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
