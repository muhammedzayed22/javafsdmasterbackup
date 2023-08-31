package queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class dques {
	public static void main(String[] args) {
		Deque<Integer> d1 = new LinkedList<>();
		d1.addFirst(12);
		d1.addFirst(100);
		d1.addFirst(34);
		System.out.println(d1);
		d1.pollFirst();
		System.out.println(d1);

	}

}
