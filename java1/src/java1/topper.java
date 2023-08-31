package java1;
import java.util.*;
public class topper {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), d = 0;
		Integer[] c = new Integer[a];
		for (int i=0;i<a;i++) {
			c[i]=sc.nextInt();
;		}
		Arrays.sort(c);
//		Arrays.sort(c,Collections.reverseOrder());
		for (int i=c.length-1;i>b-1;i--) {
			d=d+c[i];
		}
		System.out.print(d);
	}

}