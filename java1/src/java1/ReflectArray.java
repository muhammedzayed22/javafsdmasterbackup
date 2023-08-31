package java1;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ReflectArray {
	public static void main(String[] args) {
		int s = 5;
		int[] a1 = (int [])Array.newInstance(int.class, s);
		a1[0] = 9;
		Array.setInt(a1, 1, 10);
		Array.setInt(a1, 3, 10);
		System.out.println(Arrays.toString(a1));
		System.out.println(a1[0]);
		System.out.println(Array.getInt(a1, 3));
		
	}
}
