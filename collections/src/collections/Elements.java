package collections;
import java.util.*;
public class Elements {
	public static void main(String[] args) {
		List<Integer> List = Arrays.asList(1,2,3,4,5,6,7,8);
		List.iterator().forEachRemaining(System.out::println);
	}
}
