package javademo;
import java.util.*;
class ListExample{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("I");
		list.add("Love");
		list.add("Java");
		list.add("Language");
		Iterator<Object> iter = list.iterator();
		while (iter.hasNext())
		System.out.print (iter.next().toString() + " ");
		System.out.println();
	}
}