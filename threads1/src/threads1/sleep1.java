package threads1;
class demo1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);	
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getId());
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class sleep1 {
	public static void main(String[] args) throws InterruptedException {
		demo1 d1 = new demo1();
		demo1 d2 = new demo1();
		d1.sleep(1000);
		d1.start();
//		d2.start();
		System.out.println(d1.getState());
		d1.sleep(1000);
		System.out.println(d1.getState());
		d1.stop();
		System.out.println(d1.getState());
	}
}
