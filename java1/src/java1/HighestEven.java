package java1;
import java.util.*;
public class HighestEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		char c;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i=0;i<m.length();i++) {
			for (int j=i+1;j<m.length();j++) {
				StringBuilder a = new StringBuilder(m);
				c = a.charAt(i);
				a.setCharAt(i,a.charAt(j));
				a.setCharAt(j,c);
				String n = a.toString();
				if (Integer.parseInt(n)%2==0) {
					arr1.add(Integer.parseInt(n));
				}
			}
		}
		System.out.print(Collections.max(arr1));
	}
}