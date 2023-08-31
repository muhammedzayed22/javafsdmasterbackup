package java1;
import java.util.*;
public class magicprime {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),a=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
		for (int i=2;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				if (i%j==0)
					a++;
			}
			if (a==2) {
				arr.add(i);
			}a=0;
		}
		for (int i:arr) {
			for (int j:arr) {
				for (int k:arr) {
					if (i<j && j<k && (i^(j^k))==0) {
						arr1.add(i);
						arr1.add(j);
						arr1.add(k);
						arr2.add(arr1);arr1 = new ArrayList<Integer>();
					}
				}
			}
		}
		System.out.print(arr2);
	}
}