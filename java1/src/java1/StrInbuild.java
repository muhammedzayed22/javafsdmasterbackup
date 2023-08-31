package java1;
import java.util.*;
public class StrInbuild {
	public static void main(String[] args) {
		String s1 = "Javaclass";
		String s2 = String.format("%s",s1);
		String s3 = String.format("|%-10d",10 );
		String s4 = String.format("%f", 102.00);
		String s5 = String.format("%c", 'h');
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		String a1 = "asdfghjkl";
		byte b1[] = a1.getBytes();
		for (int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		String b2 = new String(b1);
		System.out.println(b2);
		char a[] = new char[10];
		s1.getChars(1, 4, a, 0);
		System.out.println(a);
	}
}
