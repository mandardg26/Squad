package Filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo5 {
public static void main(String[] args) {
	try {
	FileReader fr=new FileReader("fileinfo.txt");
	char ch[]=new char[100];
	fr.read(ch);
	
	for (char c : ch)//in the c one one character would be read a
	{
		System.out.print(c);
	}
	
	
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e1) {
		e1.printStackTrace();
	}
}
}
