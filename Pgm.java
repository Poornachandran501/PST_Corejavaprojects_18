package Newprograms;
public class Pgm {

	public static void main(String[] args) {
		method1();
		Friends obj = new Friends();
		obj.method1();
		Aids obj2 = new Aids();
		obj2.method2();
		Poorna obj3 = new Poorna();
		obj3.method3();

	
	}
public static void method1 () {
	   System.out.print("anu");
	  System.out.println(" -she is a girl");
	  method2();
	
	  }
public static void method2() {
	System.out.print("letsumi");
	System.out.println(" -she is a girl ");
		  
	}}


class Friends {
	public static void method1() {
		System.out.println("mukesh");
	}
	
	
} 
class Aids {
	
	public static void method2() {
		System.out.println("student of AIDS");
	
	}

}
 class Poorna {
	 public static void method3() {
		 System.out.println("studnet of Aids");
	 }
	 }
 