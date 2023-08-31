package java1;
import java.util.*;
public class StringBuffers {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s3 = new StringBuffer("11111111111111111111111111111111111111111111111111111111");
		s1.append("Java");
		s1.append(" ");
		s1.append("Welcome");
		System.out.println(s1);
		String s2 = s1.toString();
		System.out.println(s2);
		s1.insert(4, "Python");
		System.out.println(s1);
		s1.replace(4, 6, "c++");
		System.out.println(s1);
		s1.delete(4, 6);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s3.capacity());
		System.out.println(s3.length());
	}
}
