package garbagecollection1;

public class Demotest {
	public static void main(String[] args) {
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		System.out.println(r1.totalMemory()-r1.freeMemory());
		
		for (int i=0;i<10000;i++) {
			new Demotest();
		}
		System.out.println(r1.freeMemory());
		System.gc();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		
	}
}
