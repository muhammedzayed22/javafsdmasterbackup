package Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class assumption {
	@Test
	public void assum() {
		Assumptions.assumeTrue(true);
		System.out.println("Correct...");
	}
	
	@Test
	public void assum1() {
		Assumptions.assumeFalse(true);
		System.out.println("Correct one...");
	}

}
