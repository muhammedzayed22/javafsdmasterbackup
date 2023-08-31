package POJO_JAVA;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Student s1 = new Student(101,"ab");
        Student s2 = new Student(103,"aa");
        System.out.println(s1.getName());
        System.out.println(s1.getSno());
        //System.out.println(s1.getPhone());
        s1.setSno(100);
        System.out.println(s1.getSno());
        System.out.println(s2.getName());
        System.out.println(s2.getSno());
	}
}
