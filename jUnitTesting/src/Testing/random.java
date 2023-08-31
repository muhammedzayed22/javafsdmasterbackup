package Testing;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;

public class random {
	
	@Test
	@DisplayName("Negative Test 1")
	@Order(4)
	public void demo1() {
		System.out.println("TEST-1");
	}
	
	@Test
	@DisplayName("Positive Test 2")
	@Order(3)
	public void demo2() {
		System.out.println("TEST-2");
	}
	
	@Test
	@DisplayName("Positive Test 3")
	@Order(2)
	public void demo3() {
		System.out.println("TEST-3");
	}
	
	
	
}
