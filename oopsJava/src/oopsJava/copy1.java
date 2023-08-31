package oopsJava;
import java.applet.*;

class Student2{
	String name;
	int num;
	 Student2(String a,int b){
		this.name=a;
		this.num=b;
	}
	Student2(Student2 s2){
		this.name=s2.name;
		this.num=s2.num;
	}
}
public class copy1 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("MyName",100);
		System.out.println(s1.num);
		System.out.println(s1.name);
		System.out.println(s1.name + s1.num);
		Student2 s4 = new Student2(s1);
		System.out.println(s4.name+s4.num);
		Student2 s5 = s1;
		System.out.println(s5.name);
	}

}
