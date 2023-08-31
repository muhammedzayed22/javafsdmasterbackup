package java1;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class stream {
	public static void main(String[] args) throws Exception {
		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		String e1 = b1.readLine();
		System.out.print(e1);
		
		String s1 = System.console().readLine();
		System.out.print(s1);
	}
}
