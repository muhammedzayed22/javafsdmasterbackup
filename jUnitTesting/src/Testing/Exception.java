package Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exception {
	@Test
	public void assum() {
		Assertions.assertThrows(ArithmatecException.class, () ->div(1,0));
		System.out.println("Test Failed");
	}
}
