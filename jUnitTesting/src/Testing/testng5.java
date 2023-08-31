package Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class testng5 {
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	
	public void os() {
		System.out.println("I will run @ windows");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void jre() {
		System.out.println("I am java 17");
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_8,max=JRE.JAVA_18)
	public void jrebetween() {
		System.out.println("I am java");
	}

}
