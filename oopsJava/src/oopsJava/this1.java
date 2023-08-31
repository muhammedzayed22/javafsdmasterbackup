package oopsJava;
import java.applet.*;

class th1{
	int a,b;
	public th1() {
		System.out.println("Constructor");
	}
	th1(int a2,int b2){
		this();
		this.a=a2;
		this.b=b2;
		System.out.println(a+b);
	}
}

public class this1 {
	public static void main(String[] args) {
		th1 t1 = new th1(2,3);
	}
}
