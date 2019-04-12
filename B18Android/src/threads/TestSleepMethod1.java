package threads;
class TestSleepMethod1 extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			System.out.println(i+"---"+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestSleepMethod1 t1=new TestSleepMethod1();  
		TestSleepMethod1 t2=new TestSleepMethod1();  
		TestSleepMethod1 t3=new TestSleepMethod1();  

		t1.setName("first thread");
		t2.setName("second thread");
		t3.setName("third thread");

		t1.start();  
		
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}  
}