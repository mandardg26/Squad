package Filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	try {
	FileOutputStream fo=new FileOutputStream("Diary.txt");
	System.out.println("enter your text: ");
	String s=sc.nextLine();
	   byte b1[] =s.getBytes();
	   fo.write(b1);
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
