package abstractionjavademo;
import java.util.*;

abstract class out{
	abstract void outer();
	void display() {
		System.out.println("From Out");
	}
	abstract class inn{
		void display1() {
			System.out.println("From Inn");
		}
		abstract void inner();
	}
}

class out1 extends out{
	class inn1 extends inn{

		@Override
		void inner() {
			// TODO Auto-generated method stub
			System.out.println("I am abst of Inner - From Inn1");
		}
		
	}
	@Override
	void outer() {
		// TODO Auto-generated method stub
		System.out.println("I am abst of Outer - From Out1");
	}
	
	
}

public class NestedAbs {
	public static void main(String[] args) {
		out1 o1 = new out1();
		out1.inn1 i1 = o1.new inn1();
		i1.inner();
		o1.outer();
		o1.display();
		i1.display1();
		
	}
}
