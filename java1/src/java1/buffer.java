package java1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;
public class buffer {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("C:\\Users\\muhammedzayed.a\\Desktop\\z.txt");
		FileWriter w1 = new FileWriter("C:\\Users\\muhammedzayed.a\\Desktop\\z.txt");
		BufferedWriter b1 = new BufferedWriter(w1);
		int i;
		while((i=f1.read())!=-1) {
			System.out.print((char)i);
		}
		f1.close();
	}

}
