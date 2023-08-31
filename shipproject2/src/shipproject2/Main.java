package shipproject2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Do you want to add Containers ?");
		System.out.println("2.Or Exit ?");
		int num = sc.nextInt(),weight,n;
		int capacity=2000;
		List<Integer> w = new ArrayList<>();
		List<String> L = new ArrayList<>();
		List<Integer> ID = new ArrayList<>();
		while (num==1){	
			System.out.println("How many Containers ?");
			n = sc.nextInt();
			System.out.println("Enter the weights of each container");
			for (int i=0;i<n;i++)
				w.add(sc.nextInt());
			System.out.println("Enter the container IDs");
			for (int i=0;i<n;i++)
				ID.add(sc.nextInt());
			System.out.println("How many port Locations ?");
			int m = sc.nextInt();
			System.out.println("Enter the port Locations");
			for (int i=0;i<m;i++)
				L.add(sc.next());
			Ship s1 = new Ship(w);
			
//			List<int[]> arr2 = new ArrayList<>();
//			arr2 = Arrays.asList(arr);
//			while(true) {
//				System.out.println("How many Containers");
//				n = sc.nextInt();
//				for (int i=0;i<n;i++) {
//					System.out.println("Enter weight of container");
//					weight = sc.nextInt();
//					w.get(weight);
//					System.out.println("Enter ID of container");
//					ID.get(sc.nextInt());
//					capacity-=weight;
//					if (capacity==0) {
//						System.out.println("Capacity full");
//						break;
//					}
//					else if(capacity<0) {
//						System.out.println("Cannot load last container");
//						w.remove(w.size()-1);
//						break;
//					}
//				}
//			}
			Container cont = new Container();
			cont.add(ID, w);
			System.out.println("1.Do you want to add Containers ?");
			System.out.println("2.Or Exit");
			num = sc.nextInt();
		}
	}
}
