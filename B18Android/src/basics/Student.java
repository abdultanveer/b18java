package basics;
public class Student{  
	int rollno;  
	String name,course;  
	float fee;  
	Student(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	Student(int rollno,String name,String course,float fee){ 
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
		int c =	add(10,20);
		System.out.println("c="+c);
		c= add(30,40);
		c=   add(15,67);
	}  
	public int add(int a, int b) {
		System.out.println("sum is "+(a+b));
		return a+b;
	}
	public static void main(String args[]){  
		Student s1=new Student(111,"ankit","java");  
		Student s2=new Student(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
	}
}  
class TestThis7{  
} 