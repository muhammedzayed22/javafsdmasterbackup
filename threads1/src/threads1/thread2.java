package threads1;

public class thread2 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
