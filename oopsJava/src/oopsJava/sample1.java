package oopsJava;
import java.util.*;

class A1{
	A1(int a){
		System.out.println("A1 Constructor");
	}
	void display() {
		System.out.println("A Class const");
	}
}

class B1 extends A1{
	B1(int a){
		super(a);
		System.out.println("B class const");
	}
	void display() {
		System.out.println("Normal func");
	}
}

class C extends B1{
	C(int a) {
		super(a);
		
	}

	void display() {
		System.out.println("Normal function of c");
	}
}

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1(10);
		A1 a1 = new A1(1);
		a1.display();
		b1.display();
		C c1 = new C(10);
		c1.display();
	}

}
