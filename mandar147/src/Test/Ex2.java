//static variable: static variable is common  to all instances

package Test;

class person{
	
	String name;
static	String institution="squad";
    int age;

    person(String name,int age){
    	this.name=name;
    	this.age=age;
    	
    }
  

}


public class Ex2 {
     public static void main(String[] args) {
		person p=new person("samay",18);
		System.out.println("the name of person is: "+p.name);
		
		System.out.println("the institiution name is : "+person.institution);
		System.out.println("the age of person is : "+p.age);
	}
}
