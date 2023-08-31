package java1;
import java.util.*;
public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		s1.append("ja va");
		System.out.println(s1);
		System.out.println(s1.capacity());
		char a = s1.charAt(2);
		System.out.println(a);
		int b = s1.codePointAt(0); //returns ASCII value of index
		int c = s1.codePointCount(0,3);
		System.out.println(b);
		System.out.println(c);
	}
}
