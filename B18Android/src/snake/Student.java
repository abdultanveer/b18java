package snake;
class Student{  
	private int rollno;  
	String name;  
	
	private String dob;
	public int age;
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	void insertRecord(int r, String n){  
		rollno=r;  
		name=n;  
	}  
	
	public int getRollno() {
		return this.rollno;
	}
	
	void displayInformation(){System.out.println(rollno+" "+name);}  
}  
class TestStudent4{  
	public static void main(String args[]){  
		Student s1=new Student();
		//s1.getRollno();
		Student s2=new Student();  
		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  
		s1.displayInformation();  
		s2.displayInformation();  
	}  
} 