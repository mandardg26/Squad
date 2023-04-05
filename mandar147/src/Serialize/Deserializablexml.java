package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;


public class Deserializablexml {
public static void main(String[] args) throws IOException, Exception {
	FileInputStream fs=new FileInputStream("/home/luser/Desktop/abcd.xml");
	ObjectInput oi=new ObjectInputStream(fs);
	car t2=(car)oi.readObject();
	System.out.println("File import successfully");
	
	
	
}
}
