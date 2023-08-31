package queues;

import java.util.*;

public class sets {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		s1.add(1);
		s1.add(1);
		s1.add(12);
		s1.add(13);
		s1.add(13);
		s1.add(15);
		s1.add(17);
		s1.addAll(Arrays.asList(new Integer[] {1,22,33,44,55,66,77}));
		System.out.println(s1);
		s2.addAll(Arrays.asList(new Integer[] {11,22,33,44,55,66,1,2,3,4,5,6,7,8}));
		System.out.println(s2);
		Set<Integer> inter = new HashSet<Integer>(s1);
		inter.addAll(s2);
		System.out.println(inter);
		Set<Integer> diff = new HashSet<Integer>(s1);
		diff.removeAll(s2);
		System.out.println(diff);
	}
}
