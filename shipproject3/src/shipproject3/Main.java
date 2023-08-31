package shipproject3;
import java.util.*;
public class Main extends Bill_Generate {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ship Management System");
		System.out.println("Do you want to add containers ?");
		System.out.println("1.Yes\n2.No");
		int a = sc.nextInt(),b,c,j=0;
		Ship s = new Ship();
		Port p = new Port();
		System.out.println("Enter minimum capacity required ");
		s.setRemcapacity(sc.nextInt());
		while(true) {
			
			if (a==2) break;
			System.out.println("Enter no. of Containers");
			b=sc.nextInt();
			System.out.println("Weights , IDs and Types of the Containers");
			for (int i=0;i<b;i++) {
				System.out.println("Enter the weight of Container");
				s.setWeight(sc.nextInt());
				System.out.println("Enter the ID of Container");
				s.setID(sc.nextInt());
				System.out.println("Enter the type of Container\n(N -> Normal , L -> Liquid , R -> Refrigerated)");
				s.setType(sc.next());
				if (s.getRemcapacity()==0) {
					System.out.println("Ship is at Maximum capacity");
					break;
				}
				if (s.getRemcapacity()<0) {
					System.out.println("Overload....Cannot load last Container");
					s.setCapacity(s.getWeight().get(s.getWeight().size()-1));
					s.setRemcapacity(s.getWeight().get(s.getWeight().size()-1));
					s.getWeight().remove(s.getWeight().size()-1);
					s.getID().remove(s.getID().size()-1);
					s.getTypes().remove(s.getID().size()-1);
					if(i==b-1) {
						
						break;
					}
					
				}
			}

			System.out.println("Total weight of containers loaded = "+s.capacity);
			System.out.println("Remaining weight allowed to load = "+s.remcapacity);
			
			System.out.println("Enter the number of Port locations");
			c=sc.nextInt();
			System.out.println("Enter the port Locations");
			for (int i=0;i<c;i++) {
				p.setLocation(sc.next());
		}
		
			
		s.Ship1();
			
			
			
			
			
			
		System.out.println("Do you want to add containers ?");
		System.out.println("1.Yes\n2.No");
		a = sc.nextInt();
	}	
		
}

	@Override
	double taxes() {
		//Main m1 = new Main();
		Ship s2 = new Ship();
		
		double a = charges(s2.getCapacity());
		a+=(a/9.0);
		return a;
	}
}
