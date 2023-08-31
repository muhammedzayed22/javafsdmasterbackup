package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


class City implements Consumer<String> {
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
}

public class iter2{
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("chennai");
		l1.add("mumbai");
		l1.add("Hyderabad");
		iter2 c1 = new iter2();
		l1.forEach(c1);
	}

	
}
