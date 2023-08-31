package queues;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<String> b1 = new ArrayBlockingQueue<String>(5);
		b1.put("1");
		b1.put("2");
		b1.put("3");
		b1.put("4");
		b1.put("5");
//		b1.put("6");
		b1.remove("2");
		System.out.println(b1);
		
		LinkedBlockingQueue<String> l1 = new LinkedBlockingQueue<String>(b1);
		l1.add("from LinkedBlockingQueue");
		l1.add("again");
		System.out.println(l1);
		
	}
}
