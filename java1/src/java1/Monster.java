package java1;
import java.util.*;
public class Monster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = 0;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(), arr2 = new ArrayList<Integer>();
		for (int i=0;i<a;i++) {
			arr1.add(sc.nextInt());
		}
		for (int i=0;i<a;i++) {
			arr2.add(sc.nextInt());
		}
		Collections.sort(arr1);
		arr2.remove(arr2.indexOf(0));
		for (int i=0;i<a;i++) {
			System.out.println(b);
			if (b>=arr1.get(i)) {
				c++;
				if (i==a-1) {break;}
				else
				{b=b+Collections.min(arr2);
				arr2.remove(arr2.indexOf(Collections.min(arr2)));}
			}
		}
		System.out.print(c);
	}
}