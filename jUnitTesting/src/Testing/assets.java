package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jUnitTesting.DemoTest;

public class assets {
	
	
	@Test
	public void demo1() {
		DemoTest d1 = new DemoTest();
		int a = d1.add(92, 8);
		assertEquals(a,100);
	}
	
	@Test
	public void demo2() {
		DemoTest d1 = new DemoTest();
		int a = d1.add(92, 8);
		assertNotEquals(a,100);
	}
	
	@Test
	public void demo3() {
		Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {4,5,6},"noe equal");
	}
	
	
}
