package functionsdemo;
import java.util.*;

public class nested {
	public static int fun1(int n) {
		if (n>100)
			return n-10;
		return fun1(fun1(n+11));
	}
	
	public static void main(String[] args) {
		System.out.println(fun1(95));
	}
}
