package threads1;

class demo11 extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
public class Joint1 {

	public static void main(String args[]) throws InterruptedException
	{
		demo11 d1 = new demo11();
		demo11 d2 = new demo11();
		demo11 d3 = new demo11();
		
		System.out.println(d1.getState());
		d1.start();
		System.out.println(d1.getState());
		d1.sleep(1000);
		System.out.println(d1.getState());
		
		try {
			d1.start();
			d1.join();
			d2.start();
			d2.join();
			d3.start();
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	}
}