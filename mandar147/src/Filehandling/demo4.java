package Filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class demo4 {
public static void main(String[] args) {
	
	try {
	FileWriter fw=new FileWriter("fileinfo.txt",true);//if we want to write with the previous data #,true)
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the text: ");
	String s=sc.nextLine();
	fw.write(s);
	
	fw.flush(); //flush is used for removing the first data
	fw.close();//resource closing
	System.out.println("data is been registered");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	
}
}
