package inheritance;

class school{
	
	 static String name="HBCHS";
	static String location="BADLAPUR";

 
	 
	
	 
 
 static void schooldata() {
	 System.out.println("the name of school is: "+name);
	 System.out.println("the location of school is: "+location);
	 
 }
}

class teacher extends school{
	String subject;
	int id;
	
	teacher(String subject,int id){
		
		this.subject=subject;
		this.id=id;
	}
	void teacherdata() {
		System.out.println("the subject of teacher is: "+subject);
		System.out.println("the id of teacher is : " +id );
	}
	
}
  class student extends school{
	int standard;
	int studentid;
	
	student(int standard,int studentid){
		
		this.standard=standard;
		this.studentid=studentid;
		
	}
	void studentdata() {
		System.out.println("the standard of student is : "+standard);
		System.out.println("the id of student is : "+studentid);
		
	}
}
  
  
public class Hirachical {
public static void main(String[] args) {
	teacher r=new teacher("maths",101);
	r.teacherdata();
	school.schooldata();
	System.out.println("****************************************");
	System.out.println(" ");
	student s=new student(9,101);
	s.studentdata();
	school.schooldata();
}
}
