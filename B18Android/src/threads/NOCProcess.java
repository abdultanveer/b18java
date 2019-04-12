package threads;

public class NOCProcess {
	public static void main(String[] args) {
		PrinterThread printerThread = new PrinterThread();
		NetThread netThread = new NetThread();
		DbThread dbThread = new DbThread();
		
		printerThread.start(); // runnable state
		netThread.start();
		dbThread.start();
	}

}
