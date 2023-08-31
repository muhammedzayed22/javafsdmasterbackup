import java.util.*;
public class Marathon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		while (dist<5 || dist>8) {
			System.out.println("Sorry.Choose between 5km to 8km.");
			int a = sc.nextInt();
			dist=a;
		}
		
			for (int i=dist;i>=0;i--) {
				if (i<3 && i>0);{
					System.out.println("Distance to run :"+i);
					System.out.println("Almost There.");
				}
				if (i==0) {
					System.out.println("Done for the day");
				}
				if (i>=3) {
					System.out.println("Distance to run :"+i);
				}
			}
		
	}
}
