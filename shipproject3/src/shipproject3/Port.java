package shipproject3;
import java.util.*;


public class Port extends Main{
	static List<Integer> w = new ArrayList<>();
//	static List<Integer> id1 = new ArrayList<>();
	static List<Integer> id = new ArrayList<>();
	static String location;
	static List<String> locations = new ArrayList<>();
	
	public Port() {
		
	}
	
	
	public List<String> getLocation() {
		return locations;
	}
	public void setLocation(String location) {
		this.location = location;
		locations.add(location);
	}
	
	public void Port1(List<Integer> w,List<Integer> id) throws InterruptedException {
		this.w=w;
		this.id=id;
		Collections.sort(id);
		Ship s1 = new Ship();
		int fuel = s1.getFuel();
		Port p2 = new Port();
		int i=0;
		while (i<w.size()) {
			if (id.get(i)>0 && id.get(i)<=10) {
				System.out.printf("Container no. %d shipped to Port "+p2.getLocation().get(0),id.get(i));
				
			}
			if (id.get(i)>10 && id.get(i)<=20)
			{
				System.out.printf("Container no. %d shipped to Port "+p2.getLocation().get(1),id.get(i));
			}
			if (id.get(i)>20 && id.get(i)<=30)
			{
				System.out.printf("Container no. %d shipped to Port "+p2.getLocation().get(2),id.get(i));
			}
			if (id.get(i)>30 && id.get(i)<=40)
			{
				System.out.printf("Container no. %d shipped to Port "+p2.getLocation().get(3),id.get(i));
			}
			i++;
			s1.setFuel(30);
			System.out.println("\nRemaininf fuel = "+s1.getFuel());
			if (s1.getFuel()==10) {
				System.out.println("Low fuel");
				Thread.sleep(1000);
				System.out.println("Refueling");
				for (int k=0;k<3;k++) {
					Thread.sleep(1000);
					System.out.println(".");
				}
				Thread.sleep(1000);
				s1.setFuel(-90);
				System.out.println("Tank full");
				Thread.sleep(1000);
			}
			
			
		}
		
	}
	
}
