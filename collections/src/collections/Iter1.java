package collections;
import java.util.*;
public class Iter1 {
	public static void main(String[] args) {
		List<Integer> l1 = new linkedlist1<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		Iterator<Integer> l2 = l1.iterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
			l2.remove();
			System.out.println(l1);
		}
	}
}
