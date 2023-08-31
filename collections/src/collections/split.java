package collections;
import java.util.*;
class empdetails{
	int eno;
	String name;
	public empdetails(int eno,String name) {
		this.eno = eno;
		this.name=name;
	}
}

public class split {
	public static void main(String[] args) {
		LinkedList<empdetails> e1 = new LinkedList<empdetails>();
		e1.add(new empdetails(101,"name1"));
		e1.add(new empdetails(102,"name2"));
		e1.add(new empdetails(103,"name3"));
		System.out.println(e1.get(2).name);
		
		Spliterator<empdetails> s1 = e1.spliterator();
		
		
	}
	
	public 
}
