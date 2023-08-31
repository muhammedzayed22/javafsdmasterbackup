package oopsJava;
import java.util.*;

class thiss{
	int a=1,b=2;
	thiss(){
		a=10;b=20;
	}
	void disp(thiss t1) {
		System.out.println(a+b);
		System.out.println(t1.a);
	}
	void get() {
		disp(this);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiss t1 = new thiss();
		t1.get();
	}

}
