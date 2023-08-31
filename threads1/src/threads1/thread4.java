package threads1;

public class thread4 extends Thread {
	public void run() {
		for (int i=0;i<5;i++) {
			
			try {
			
		
				System.out.println("running.....");
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread4 t4 = new thread4();
		thread4 t5 = new thread4();
		t4.start();
		
		t5.start();
	}

}
