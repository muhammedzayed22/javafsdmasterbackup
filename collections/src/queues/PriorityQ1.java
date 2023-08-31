package queues;
import java.util.*;
public class PriorityQ1 {
	public static void main(String[] args) {
		PriorityQueue<Object> p1 = new PriorityQueue<>();
		p1.add(121);
		p1.add(17);
		p1.add(55);
		p1.add(3);
		p1.add(22);
		p1.add(200);
		p1.remove();
		p1.remove(55);
		System.out.println(p1);
		
	}
}
