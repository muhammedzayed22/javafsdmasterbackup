package threads1;

public class thread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println(Main.t1.getState());
		
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
}
