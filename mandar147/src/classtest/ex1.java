//class= the class is blueprint of an object or we can say class is template of an object
// object = it is an real time entity which have its state and behaviour



package classtest;

class person{
	String name;
	int standard;
	int marks;
	String subject;
	
	person(String name,int standard,int marks,String subject){
		this.name=name;
		this.standard=standard;
		this.marks=marks;
		this.subject=subject;
		
	}
	
	void studentinfo() {
		System.out.println("name of studet is: "+name);
		System.out.println("the student studing in standard is: "+standard);
		System.out.println("the marks is: "+marks);
		System.out.println("the subject is: "+subject);
	}
	
}






public class ex1 {
public static void main(String[] args) {
	
	person p=new person("soham",11,20,"physics");
	p.studentinfo();
	person p1=new person("sam",11,19,"physics");
	p.studentinfo();
	
}
}
