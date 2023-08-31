package threads1;

public class Main implements Runnable{
	
	public static Thread t1;
	public static Main m1;
	
	public static void main(String[] args) {
		
		m1 = new Main();
		t1 = new Thread(m1);
		System.out.println(t1.getState());
		t1.start();
		
		
		for (int i=0;i<8;i++) {
			
			thread1 t1 = new thread1();
			t1.start();
		}
		System.out.print("\n");
		
		for (int i=0;i<8;i++) {
			Thread t2 = new Thread(new thread2());
			t2.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		thread3 mt = new thread3();
		Thread mt1 = new Thread(mt);
		System.out.println(mt1.getState());
		mt1.start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(t1.getState());
		try {
			mt1.join();
			System.out.println(mt1.getState());		
		}
		catch(InterruptedException e){
			System.out.println(t1.getState());
			System.out.println(e);
		}
		System.out.println(mt1.getState());
	}
}
