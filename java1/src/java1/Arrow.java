package java1;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Arrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>(a);
		for (int i=0;i<a;i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		int b = 0, c = Collections.min(arr);
		for (int i=0;i<a;i++) {
			if ((arr.get(i)-c)<=1) {
				b=b+1;
			}
		}
		System.out.print(b);
	}
}
