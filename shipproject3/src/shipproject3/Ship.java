package shipproject3;
import java.util.*;
public class Ship {
	static int weight;
	static String type;
	public String getType() {
		return type;
		
	}

	public void setType(String type) {
		this.type = type;
		types.add(type);
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}


	static List<String> types=new ArrayList<String>();
	static int remcapacity;
	public void setRemcapacity(int remcapacity) {
		this.remcapacity += remcapacity;
	}


	static int capacity=0;
	static int fuel = 100;
	public static int getFuel() {
		return fuel;
	}

	public  void setFuel(int fuel) {
		this.fuel -= fuel;
		
		
	}

	public int getCapacity() {
		return capacity;
	}


	static int ID;
//	static String location;
	
	static List<Integer> weights = new ArrayList<>();
	static List<Integer> IDs = new ArrayList<>();
	static List<String> locations = new ArrayList<>();
	
	public Ship() {
//		this.weight = weight;
//		this.ID = ID;
//		this.Location = Location;
	}

	public List<Integer> getWeight() {
		return weights;
	}
	public void setWeight(int weight) {
		this.weight = weight;
		weights.add(weight);
		capacity+=weight;
		remcapacity-=weight;
	}
	public int getRemcapacity() {
		return remcapacity;
	}

	public List<Integer> getID() {
		return IDs;
	}
	public void setID(int ID) {
		this.ID = ID;
		IDs.add(ID);
	}
//	public List<String> getLocation() {
//		return locations;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//		locations.add(location);
//	}
	
	public void Ship1() throws InterruptedException {
		
		Container B1 = new Container(weights,IDs,types);
		B1.Basic();
		B1.Heavy();
		B1.display();
	}

	public void setCapacity(Integer integer) {
		// TODO Auto-generated method stub
		this.capacity -=integer;
	}

	
	
	
	
}
