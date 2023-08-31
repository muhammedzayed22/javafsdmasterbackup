package oopsJava;
import java.util.*;

class Student1{
	int a;

	public Student1() {
		System.out.println("Contructor direct-1 ");
	}
	
	public Student1(int a) {
		System.out.println("a+3="+(a+3));
	}
	
	public Student1(int a,int b) {
		System.out.println("a+b="+(a+b));
	}
	
	void display() {
		System.out.print("Constructor class ");
	}
	
	{
		System.out.println("Anonymous Constructor ");
	}
}

public class Constructor {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
//		s1.display();
//		Student1 s2 = new Student1(10);
//		Student1 s3 = new Student1(3,5);
	}
}
