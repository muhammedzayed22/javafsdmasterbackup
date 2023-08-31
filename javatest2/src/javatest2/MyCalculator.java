package javatest2;
import java.util.*;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

public class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		MyCalculator m1 =new MyCalculator();
		System.out.println(m1.divisor_sum(num));
	}

}
