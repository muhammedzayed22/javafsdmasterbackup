import java.util.*;
public class Treasure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, x=0, c = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int g=0;g<c;g++) {
			arr.add(sc.nextInt());
		}
		for (int k=0;k<arr.size()/2;k++) {
			
		for (int i=1;i<(arr.size()/2)+1;i++) {
			
			for (int j=k;j<=i+k;j++) {
				a+=arr1.get(j);
				arr1.remove(j);
			}
			for (int l:arr1) {
				b+=l;
			}
			if (a==b) {
				x++;
			}
			a=0;b=0;
			
		}
		}
		if (x>0) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
