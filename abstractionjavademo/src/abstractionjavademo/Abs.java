package abstractionjavademo;
import java.util.*;

abstract class name1{
	int a;
	{
		System.out.println("I am an abstract class constructor");
	}
	abstract void display();
	final void msg1() {
		System.out.println("Hello1");
	}
	static void msg2() {
		System.out.println("Hello2");
	}
	void msg() {
		System.out.println("Hello");
	}
}

class name2 extends name1{
	int a;
	void display() {
		System.out.println("From inheritance");
	}
}

public class Abs {
	public static void main(String[] args) {
		name1 n1 = new name2();
		n1.msg();
		n1.msg1();
		n1.msg2();
		n1.display();
	}
	void display() {
		
	}
}
