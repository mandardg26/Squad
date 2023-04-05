package Serialize;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization  {
public static void main(String[] args)throws Exception {
	FileInputStream fis=new FileInputStream("/home/luser/Desktop/abc.ser");
	ObjectInput ooi=new ObjectInputStream(fis);
	test t1=(test)ooi.readObject();
	System.out.println(t1.i);
	System.out.println(t1.j);
	t1.getdata();
	System.out.println("file read successfully");
	
}

}
