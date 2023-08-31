package shipproject2;

import java.util.List;

public class Port {
	Port(List<Integer> iD,List<Integer> basic) {
		String Location = "";
		if (iD<=10 && iD>5) {
			Location = "Chennai";
		}
		else if (iD>0 && iD<=5) {
			Location = "Kolkata";
		}
		else if (iD>10 && iD<=15) {
			Location = "Mumbai";
		}
		else if (iD>15 && iD<=20) {
			Location = "Trivandram";
		}
		System.out.println("The Containers are shipped to "+Location);
	}
}
