package exception;
class TestExceptionPropagation1{  //exceptions get propogated automatically if the 
	void m(){  //exceptions are unchecked ---[at compile time]
		int data=50/0;  
	}  
	void n(){  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handled in p");}  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		obj.p();  
		System.out.println("normal flow...");  
	}  
}