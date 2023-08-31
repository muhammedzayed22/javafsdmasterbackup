import java.util.*;
public class Profit {
	public static int sum(List<Integer> list) {
		int sum1=0;
		for (int i:list) {
			sum1+=i;
		}
		return sum1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int i=0;i<a;i++) {
			arr.add(sc.nextInt());
		}
		for (int i=0;i<a-1;i++) {
			for (int j=i+1;j<a;j++) {
				int x = sum(arr.subList(i, j));
				arr1.add(x);
			}
		}
		System.out.println(Collections.max(arr1));
	}
}
