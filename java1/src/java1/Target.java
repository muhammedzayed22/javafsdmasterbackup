package java1;
import java.util.*;
public class Target {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), x=0;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arr2  = new ArrayList<ArrayList<Integer>>();
		for (int j=c;j<=d;j++) {
		for (int i=j;i<=d;i++) {
			if (x>=b) {
				break;
			}
			else {
				x=x+i;
				arr1.add(i);
			}}
			arr2.add(arr1);
			x=0;
			arr1 = new ArrayList<Integer>();
		}
		System.out.println(arr2);
	}
}