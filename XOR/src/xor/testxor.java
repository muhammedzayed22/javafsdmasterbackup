package xor;
import java.util.*;
class testxor {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
		List<List<Integer>> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		for (int j=0;j<b;j++) {
			for (int k=0;k<3;k++) {
				arr2.add(sc.nextInt());
			}
			arr1.add(arr2);
			System.out.println(arr2);
			arr2 = new ArrayList<>();
		}
//		for (int i=0;i<arr1.size();i++){
//		    System.out.println(arr1.get(i));
//		}
		System.out.print(arr1.size());
    }
}