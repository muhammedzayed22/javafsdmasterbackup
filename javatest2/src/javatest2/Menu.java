package javatest2;
import java.util.*;

class MenuItems{
	public int bill(List<Integer> trio) {
		int sum=0;
		Collections.sort(trio);
		trio.remove(0);
		for (int i=0;i<trio.size();i++) {
			sum+=trio.get(i);
		}
		return sum;
	}
}

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> trio = new ArrayList<>();
		for (int i=0;i<3;i++){
			trio.add(sc.nextInt());
		}
		MenuItems m1 = new MenuItems();
		System.out.println(m1.bill(trio));
	}

}
