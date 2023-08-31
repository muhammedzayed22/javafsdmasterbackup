package collections;
import java.util.*;
public class linkedlist1 {
	public static void main(String[] args) {
		LinkedList<Object> L = new LinkedList();
		L.add("Myname");
		L.add(100);
		L.add("Place");
		L.addLast(101);
		System.out.println(L);
		
		L.add(1,200);
		System.out.println(L);
		
		L.addFirst(150);
		System.out.println(L);
		
		L.remove();
		System.out.println(L);
		
		L.remove(3);
		System.out.println(L);
		
		L.add(2,"Place");
		L.add(4,"Animal");
		System.out.println(L);
		
		L.removeFirst();
		System.out.println(L);
		
		L.removeLast();
		System.out.println(L);
		
		L.set(0, 99);
		System.out.println(L);
		
		L.offer(101);
		System.out.println(L);
		
		L.offerFirst("Name");
		System.out.println(L);
		System.out.println(L.subList(1, 4));
		System.out.println(L);
		
		L.offerLast(102);
		System.out.println(L);
		
		L.offer(103);
		System.out.println(L);
		
		System.out.println(L.peek());
		System.out.println(L.peekFirst());
		System.out.println(L.peekLast());
	}
}
