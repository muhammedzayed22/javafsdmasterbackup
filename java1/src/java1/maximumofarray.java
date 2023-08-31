package java1;
import java.util.*;
public class maximumofarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i,j,k,l;
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(123456);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(214748);
		for  (i=0;i<n;i++) {
			arr1.add(sc.nextInt());
		}
		System.out.println(arr1);
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				for (k=0;k<n;k++) {
					for (l=0;l<n;l++) {
						if (i>j && j>k && k>l) {
							arr2.add(arr1.get(i)-arr1.get(j)+arr1.get(k)-arr1.get(l));
						}
						
					}
				}
			}
			
		}
		System.out.println(Collections.max(arr2));
	}

}