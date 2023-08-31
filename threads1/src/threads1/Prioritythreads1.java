package threads1;

class pri1 extends Thread
{
	public void run()
	{
		System.out.println("I am called....");
	}
}
public class Prioritythreads1 {

	public static void main(String args[])
	{
		pri1 p1 = new pri1();
		pri1 p2 = new pri1();
		pri1 p3 = new pri1();

		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p3.getPriority());
		
		p1.setPriority(6);
		p2.setPriority(3);
		p3.setPriority(10);
		
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p3.getPriority());
		
		System.out.println(p3.currentThread());
		Thread.currentThread().setPriority(9);
		System.out.println(p3.currentThread().getPriority());
	}
}