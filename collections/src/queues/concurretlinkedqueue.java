package queues;
import java.util.concurrent.ConcurrentLinkedQueue;
public class concurretlinkedqueue {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> c1 = new ConcurrentLinkedQueue<Integer>();
		c1.add(12);
		c1.add(122);
		c1.add(121);
		c1.add(132);
		System.out.println(c1.poll());
		System.out.println(c1);
		System.out.println(c1.peek());
		
		
	}
}
