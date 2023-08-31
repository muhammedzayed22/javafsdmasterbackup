package collections;
import java.util.Stack;
import java.util.*;
public class Stack101 {
	public static void main(String[] args) {
		Stack a = new Stack<>();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.pop();
		System.out.println(a);
		System.out.println(a.peek());
		Object s1 = (Vector)a.clone();
		System.out.println(a);
	}
}
