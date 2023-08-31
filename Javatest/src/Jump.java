import java.util.*;
public class Jump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),c=0,j = 0;
		ArrayList<Integer> b = new ArrayList<>();
		for (int i=0;i<a;i++) {
			b.add(sc.nextInt());
		}
		while (j<=a) {
			if (b.get(j)<=a-j) {
				j+=b.get(j);
				c++;
			}
			
		}
		System.out.println(c);
	}
}
