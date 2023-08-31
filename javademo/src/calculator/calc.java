package calculator;
import java.util.*;

class add{
	int add(int a,int b) {
		return (a+b);
	}
}

class mul extends add{
	int mul(int a,int b) {
		return (a*b);
	}
	int task(int a, int b)
	{
		return a*a + b*b;
	}
}

public class calc {
	public static void main(String[] args) {
		mul m1 = new mul();
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt(), a2 = sc.nextInt();
		System.out.println(m1.add(m1.mul(a1, a1),m1.mul(a2, a2)));
		System.out.println(m1.task(a1, a2));
	}
}
