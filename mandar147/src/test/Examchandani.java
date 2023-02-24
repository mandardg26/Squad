package test;
import java.util.Scanner;
 class sohm
{
	int id;
	int age;
	String collage;

 sohm(int id,int age,String collage){
	this.id=id;
	this.age=age;
	this.collage=collage;
}

 void details()
 {
	 System.out.println("my name is : sohm");
	 System.out.println("my id is : "+id);
	 System.out.println("my age is :"+age);
	 System.out.println("my collage name is: "+collage);
 }
}
 class rohm extends sohm 
 {
	  int id;
	  int age;
	  String collage;
	 rohm(int id,int age,String collage)
	 {
		 super(id,age,collage);
		 this.id=id;
		 this.age=age;
		 this.collage=collage;
		 
	 }
	 
	 void rohmdata() {
		 System.out.println("_______________");
		 System.out.println("my name is rohm :");
		 System.out.println("rohm age is : "+age);
		 System.out.println("rohm colleage is :"+collage);
	 }
	
		 
	 }
 
 
public class Examchandani {
	public static void main(String[] args) {
		sohm s=new sohm(12,23,"asmita");
		s.details();
		rohm r=new rohm(13,24 ,"vikash");
		r.rohmdata();
	}
	

}

