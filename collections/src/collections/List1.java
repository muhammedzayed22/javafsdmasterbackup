package collections;
import java.util.*;
public class List1 {
	public static void main(String[] args) {
		AbstractList<Integer> ab1 = new linkedlist1<Integer>();
		ab1.add(121);
		ab1.add(1212);
		ab1.add(12123);
		ab1.add(12121);
		System.out.println(ab1);
		AbstractSequentialList<Integer> ab2 = new linkedlist1<Integer>();
ArrayList<Integer> a1 = new ArrayList<Integer>(5);

        

        a1.add(1);a1.add(2);a1.add(3);a1.add(4);a1.add(5);

        

        

        ArrayList<Object> a2 = new ArrayList<Object>();

        a2.add("kavitha");

        a2.add(92);

        a2.add(9.9);

        System.out.println(a2);
        Collections.shuffle(a1);
        Random r1 = new Random();
        System.out.println(a1);
        for (int i=0;i<a1.size();i++) {
        	//int x = r1.nextInt(a1.size());
        	int x = (int) (Math.random() * a1.size());
        	System.out.println(x);
        }
        Vector v1 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.set(2, 20);
        System.out.println(v1);
         
        
	}
}
