package xor;
import java.util.*;
public class Xor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b,i,j,k,l,m;
		List<List<Integer>> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		List<Integer> arr3 = new ArrayList<>();
		List<List<Integer>> arr4 = new ArrayList<>();
		for (i=0;i<a;i++) {
			b=sc.nextInt();
			for (j=0;j<b;j++) {
				for (k=0;k<2;k++) {
					arr2.add(sc.nextInt());
				}
				arr1.add(arr2);
				arr2 = new ArrayList<>();
			}
			for (l=0;l<arr1.size();l++) {
				if (arr1.get(l).get(0)==1) 
					arr3.add(arr1.get(l).get(1));
				else {
					for (m=0;m<arr3.size();m++) {
						arr3.set(m,((arr3.get(m))^(arr1.get(l).get(1))));
					}
				}
			}
			arr4.add(arr3);
			arr3 = new ArrayList<>();
			arr1 = new ArrayList<>();
		}
		System.out.println(arr4);
	}
}