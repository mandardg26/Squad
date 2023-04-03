package gymjava;
import java.util.*;

public class run {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int key;
	maingym call = new maingym();

	while(true){
		call.operations();
		key = sc.nextInt();

		switch(key){
		
		case 1:
			call.add();
			break;
			
		case 2:
			call.update();
			break;
			
		case 3:
			call.delete();
			break;
			
		case 4:
			call.get();
			break;
			
	/*	case 5:
			call.addm();
			break;
			
		case 6:
			call.rmv();
			break;
			
		case 7:
			call.trans();
			break;*/
			
		case 5:

			System.out.println("Thank You!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Enter Correct Choice...!!! ");

		}
	}

	
} 
	


}
