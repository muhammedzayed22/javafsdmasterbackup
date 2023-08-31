package threads1;


class join2 extends Thread
{
	Thread threadTointerrupt;
	public void run()
	{
		threadTointerrupt.interrupt();
	}
}

public class Joint2 {
	
	public static void main(String args[])
	{
		try
		{
		
			join2 j1 = new join2();
			j1.threadTointerrupt = Thread.currentThread();
			j1.setName("jThread");
			j1.start();
			System.out.println(j1.getState());
			System.out.println(j1.getName());
			System.out.println(j1.getState());
			j1.join();
			System.out.println(j1.getState());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}