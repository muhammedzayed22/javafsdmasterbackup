package oopsJava;
import java.util.*;
public class maxprofit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=0;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int i=0;i<a;i++) {
			arr.add(sc.nextInt());
		}
		for (int i=0;i<a;i++) {
			for (int j=0;j<a;j++) {
				if (arr.get(i)<=arr.get(j)) {
					b++;
				}
			}
			arr1.add(arr.get(i)*b);
			b=0;
		}
		System.out.print(Collections.max(arr1));
	}
}
