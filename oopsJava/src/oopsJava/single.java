package oopsJava;
import java.util.*;
class Singleton{
	public String name;
	Singleton() {
		name = "Singleton Class";
	}
}
public class single {
	public static void main(String[] args) {
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		System.out.print(s1.hashCode()+"\n");
		System.out.print(s2.hashCode());
	}
}
