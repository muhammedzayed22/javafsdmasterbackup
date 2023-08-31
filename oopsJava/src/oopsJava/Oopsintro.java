package oopsJava;


import java.util.*;

class demo{
	int a=10;
	int b=20;
	void display() {
		System.out.print(a+b);
		System.out.print("\n");
	}
}

final class demo1{
	int a=3,b=4;
	void display() {
		System.out.print(a+b);
		System.out.print("\n");
	}
}
class demo3{
	static int c = 5;
	void display() {
		System.out.println("Outer class");
	}
	static class demo2{
		int a=13,b=24;
		void display() {
			System.out.print(a+b+c);
			System.out.print("\n");
			System.out.println("Inner class");
			System.out.print("\n");
			
		}
	}
}

class outer{
	static int a = 5;
	int b = 8;
	void display() {
		System.out.println("Outer class");
	}
	class inner{
		int c=13,d=24;
		void display() {
			System.out.print(a+b+c+d);
			System.out.print("\n");
			System.out.println("Inner class");
			System.out.print("\n");
			
		}
	}
}

class demo2 extends demo{
	
}

public class Oopsintro {
	public static void main(String[] args) {
		demo d1 = new demo();
		d1.display();
		d1.a=100;
		d1.display();
		demo1 d2 = new demo1();
		d2.display();
		d2.b=5;
		d2.display();
		demo3.demo2 d3 = new demo3.demo2();
		d3.display();
		d3.a=10;
		d3.display();
		demo3 d4 = new demo3();
		d4.display();
		outer o1 = new outer();
		System.out.print(o1.a+"\n");
		o1.display();
		outer.inner i1 = o1.new inner();
		i1.display();
	}
}
