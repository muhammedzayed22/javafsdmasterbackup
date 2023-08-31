package garbagecollection1;
import java.util.*;
class emp{
	int id;
	String name;
	int phone;
	public emp(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
	}
	void display1() {
		System.out.println(id);
	}
}


public class demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		emp e1 = new emp(1,"Me");
		emp e2 = new emp(2,"You");
		emp e3 = new emp(3,"Us");
		e1.display();
		e2.display();
		e3.display();
		e1.id=5;
		e1.display();
		
		emp x = new emp(4,"a");
		emp y = new emp(5,"b");
		x.display();
		y.display();
		x.display1();
		y.display1();
//		x=y=null;
		System.gc();
		
		System.runFinalization();
		x.display();
	}
}
