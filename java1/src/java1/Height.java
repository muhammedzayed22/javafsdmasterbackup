package java1;
import java.util.*;
public class Height {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),s=0;
		Integer[] b = new Integer[a];
		Integer[] c = new Integer[a];
		for (int i=0;i<a;i++) {
			b[i] = sc.nextInt();
		}
		for (int i=0;i<a;i++) {
			c[i] = b[i];
		}
		Arrays.sort(b);
		for (int i=0;i<a;i++) {
			if (b[i]!=c[i]) {
				s=s+1;
			}
		}
		System.out.print(s+"\n");
	}
}
