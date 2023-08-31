package functionsdemo;
import java.util.*;
public class Tail {
	public static void tail(int n) {
		if (n>0) {
			System.out.println(n);
			tail(n-1);
		}
		System.out.println("\n");
	}
	public static void head(int n) {
		if (n>0) {
			head(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		tail(a);
		head(a);
	}
}
