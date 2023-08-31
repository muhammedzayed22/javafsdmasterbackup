package oopsJava;
import java.util.*;

class A{
	B b1;
	A(B b1){
		this.b1=b1;
		b1.display();
	}
}

class B{
	int x=5;
	B(){
		A a1 = new A(this);
	}
	void display() {
		System.out.println(x);
	}
}

public class demot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b2 = new B();
	}

}
