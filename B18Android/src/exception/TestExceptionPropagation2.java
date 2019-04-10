package exception;

import java.io.IOException;

class TestExceptionPropagation2{  
	void m() throws IOException{  
		throw new java.io.IOException("device error");//checked exception  
	}  
	void n() throws IOException{ // n consumes m 
		m();  
	}  
	void p() throws IOException{  
			n();  
		//}catch(Exception e){System.out.println("exception handeled");}  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		try {
			obj.p();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("normal flow");  
	}  
}  