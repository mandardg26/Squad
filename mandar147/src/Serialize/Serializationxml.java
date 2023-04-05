package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class car implements Serializable{
	int tyres=4;
	String name="bugati";
	int seats=4;;
	
	
	
	
	
}

public class Serializationxml {
public static void main(String[] args) throws IOException {
	car c=new car();
	FileOutputStream os=new FileOutputStream("/home/luser/Desktop/abcd.xls");
	ObjectOutput oi=new ObjectOutputStream(os);
	oi.writeObject(c);
	System.out.println("done..............................");
	os.close();
}
}
