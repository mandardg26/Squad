package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingxlsfile {
public static void main(String[] args) throws Exception {
	FileWriter fi= new FileWriter("/home/luser/Desktop/mnd.xls");
	
	fi.write("Rollno,");
	fi.write("name");
	fi.write("\n\tPrabuddha");
	fi.close();
	System.out.println("done-----------------------");
    	
}
}
