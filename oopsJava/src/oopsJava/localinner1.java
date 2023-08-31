package oopsJava;
import java.util.*;
class outer1{
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
}
public class localinner1 {
	public static void main(String[] args) {
		outer1 o1 = new outer1();
		if (o1.a>=20) {
			class inner1{
				void display() {
					System.out.println("loop-di-loop");
				}
			}
			inner1 b = new inner1();
			b.display();
		}
		else {
			System.out.println("Nahhhh");
		}
	}
}
