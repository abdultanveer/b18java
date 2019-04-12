package threads;

public class PrinterThread extends Thread {
	
	@Override
	public void run() {//running state
		// TODO Auto-generated method stub
		//super.run();
		//time taking instruction put them in run method.
		System.out.println("printing on a paper");
	}

}
