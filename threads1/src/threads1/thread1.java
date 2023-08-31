package threads1;

public class thread1 extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
	}
}