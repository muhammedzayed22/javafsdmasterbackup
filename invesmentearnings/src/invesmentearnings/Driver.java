package invesmentearnings;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your buying price per share : ");
		double BuyingPrice = sc.nextDouble(),ClosingPrice=0.1;
		int day = 1;

		while (true) {
			System.out.println("Enter the closing price for the day : " + day + "(any negative value to leave)");
			ClosingPrice = sc.nextDouble();
			if (ClosingPrice<0.0) break;
			double earnings = ClosingPrice - BuyingPrice;
			if (earnings > 0) {
				System.out.print
			}
				
			
			
		}

	}

}
