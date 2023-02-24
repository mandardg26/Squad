package inheritance;
 class person{
	 
	 String name;
	static int id=101;
	 
	 person(String name,int id){
		 this.name=name;
		 this.id=id;
	 }
	 void persondata() {
		 System.out.println("the name of person is: "+name);
		 System.out.println("the id of person is: "+id);
		 
	 }
	 
 }
 class doctor extends person{
	 String qualifications;
	 double salary;
	 
	 doctor(String name,String qualifications,double salary ){
		 super(name,id);
		 this.qualifications=qualifications;
		 this.salary=salary;
		 
	 }
	 void doctordata() {
		 System.out.println("the qualification of doctor is: "+qualifications);
		 System.out.println("the salary of doctor is: "+salary);
	 }
	 
	
	 
 }
 class engineer extends person{
	 String branch;
	 int salary;
	 
	engineer(String name,String branch,int salary) {
		super(name, salary);
		this.branch=branch;
		this.salary=salary;
	}	
		void engineerdata() {
			
			System.out.println("the branch of engineer is: "+branch);
			System.out.println("the salary of engineer is: "+salary);
		}
	}
 
 class Surgeon extends doctor{
	 String Specalist;
	 
	 Surgeon(String name,String qualifications,double salary,String Specalist){
		 super(name,  qualifications, salary);
		 this.Specalist=Specalist;
	 }
	 void Surgeondata() {
		 System.out.println("the Specialization of Surgeon  is: "+Specalist);
	 }
 }


public class Demo3 {
	public static void main(String[] args) {
		Surgeon s=new Surgeon("Samay", "MBBS", 50000, "Heart Surgeon");
		  s.persondata();
		  s.doctordata();
		  s.Surgeondata();
		  
		engineer e=new engineer("samay","It",20000)  ;
		s.persondata();
	
	}
  
}
