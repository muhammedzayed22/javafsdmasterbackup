package shipproject2;

import java.util.List;

public class Ship {
	int fuel = 10;
	public Ship(List<Integer> w) {
		for (int i=0;i<w.size();i++) {
			if (w.get(i)<=500) {
			BasicContainer b1 = new BasicContainer(w);
			}
		}
	}
	
}
