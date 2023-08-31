package shipproject2;

import java.util.List;

public class HeavyContainer implements cont {
	HeavyContainer(List<Integer> heavyID,List<Integer> heavy) {
		
		System.out.println("Heavy Container");
		@SuppressWarnings("unused")
		Port p1 = new Port(heavyID,heavy);
	}

	@Override
	public void add(int id, int weight) {
		// TODO Auto-generated method stub
		
	}
}