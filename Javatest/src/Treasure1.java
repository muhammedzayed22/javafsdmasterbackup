import java.util.ArrayList;
import java.util.Scanner;
public class Treasure1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, x=0, c = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i=0;i<c;i++) {
			arr.add(sc.nextInt());
		}
		for (int i=0;i<c-a;i++) {
			ArrayList<Integer> arr1 = new ArrayList<>();
			ArrayList<Integer> arr2 = new ArrayList<>();
			for (int j=i+1;j<c;j++) {
				arr1.addAll(arr.subList(i, j));
			}
			for (int k:arr) {
				if (arr1.contains(k)) {
					int z = 0;
				}
				else
					arr2.add(k);
			}
			int a1=0,a2=0;
			for (int p:arr1) {
				a1+=p;
			}
			for (int q:arr2) {
				a2+=q;
			}
			if (a1==a2) {
				x++;
			}
			a1=0;a2=0;
		}
		if (x>0) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
