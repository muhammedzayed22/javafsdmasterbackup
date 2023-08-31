package threads1;


/*
 *  Synchronized keyword doesn't interrupt a thread when multiple threads are started
 *  This prevents the clash of threads similar to .join method in thread
 * 
 * https://javatrainingschool.com/difference-between-join-method-and-synchronized-method/#:~:text=Join%20method%20ensures%20synchronization%20of,sequence%20in%20which%20they%20run.
 * 
 */
class Test
{
	 void print(int n)
	{
		 /*
		  * Synchronized Method
		  * 
		  * synchronized void print(int n)
		  * {
		  * for(int i=1;i<=12;i++)
				{
					System.out.println(n*i);
					try {
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				} 

		  * }
		  * 
		  */
		 /*
		  *  Synchronized block
		  *  Here the Dependant thread runs first
		  *  
		  * 
		  * synchronized(this)
		 {
			 for(int i=1;i<=12;i++)
				{
					System.out.println(n*i);
					try {
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				} 
		 
		  */
		 
		synchronized(this){
			for(int i=1;i<=12;i++){
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				}
				catch(Exception e){
					System.out.println(e);
				}
			} 
		 }
	}
}

class Synchro2 extends Thread{

	Test t1;
	Synchro2(Test t1)
	{
		this.t1 =t1;
	}
	public void run()
	{
		t1.print(5);
	}
}	
public class Synchro extends Thread{

	Test t1;
	Synchro(Test t1)
	{
		this.t1 =t1;
	}
	public void run()
	{
		t1.print(10);
	}
	
	public static void main(String args[])
	{
		Test t2 = new Test();
		Synchro s1 = new Synchro(t2);
		Synchro2 s2 = new Synchro2(t2);
		s1.start();
		s2.start();
	}
}