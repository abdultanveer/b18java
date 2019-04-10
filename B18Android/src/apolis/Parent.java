package apolis;
import java.io.*;
import java.util.Arrays;  
public class Parent{  
	void msg(){System.out.println("parent");} 
	
	public static void main(String args[]){  
		/*Parent p=new TestExceptionChild1();  
		p.msg(); */ 
		
		Student abdul = new Student(123,"abdulansari",123);
		//System.out.println(abdul.toString());
		String s = "welcome to android at apolis";
		String[] array = s.split("\\s");
		System.out.println(Arrays.toString(array));

	}  
}  

class TestExceptionChild1 extends Parent{  
	void msg()throws ArithmeticException{  
		System.out.println("child");  
		StringBuffer sb = new StringBuffer("Hello");
		
	}  
	
} 