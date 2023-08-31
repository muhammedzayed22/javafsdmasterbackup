package garbagecollection1;

class Test{
	public void finalize() {
		System.out.println("space cleared");
	}
}

public class Garbagetest {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1=t2=null;
		System.gc();
	}
}
