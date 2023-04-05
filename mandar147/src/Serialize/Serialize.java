package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class test implements Serializable{
	int i=20;
	int j=40;
	
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println(name);
		
	}
}

public class Serialize {

	public static void main(String[] args) throws IOException {
		test t=new test();
		FileOutputStream fo= new FileOutputStream("/home/luser/Desktop/abc.ser");
		ObjectOutput oi=new ObjectOutputStream(fo);
		oi.writeObject(t);
		System.out.println("done......................");
		fo.close();
		

	}

}
