package java1;
import java.util.*;
public class testing {
	public static void main(String[] args) {
		List<List<Integer>> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		b.add(1);b.add(2);b.add(3);b.add(4);b.add(5);
		a.add(b);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).contains(2))
			{
				System.out.println("yes");
				break;
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}
