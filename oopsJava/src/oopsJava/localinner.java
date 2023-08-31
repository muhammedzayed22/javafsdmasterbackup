package oopsJava;
import java.util.*;

class outers{
	void getdata() {
		int sum = 0;
		class inner {
			int div=4,rem=8;
			void di() {
				System.out.println("Incepion");
			}
		}
		inner i1 = new inner();
		i1.di();
		System.out.print(i1.div+i1.rem);
	}
}

public class localinner {
	public static void main(String[] args) {
		outers o1 = new outers();
		o1.getdata();
	}
}
