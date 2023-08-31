package oopsJava;
import java.util.*;

class parent{
	int num;
	String name;
	void display() {
		System.out.println("Parent class");
	}
}

class child1 extends parent{
	int num;
	String name;
	/*void display() {
		System.out.println("Child class");
	}*/
}

class child2 extends parent{
	int num;
	String name;
	void display() {
		System.out.println("Child class");
	}
}

public class single1 {
	public static void main(String[] args) {
		child1 son1 = new child1();
		child2 son2 = new child2();
		parent father = new parent();
		son1.display();
		son2.display();
		father.display();
	}
}