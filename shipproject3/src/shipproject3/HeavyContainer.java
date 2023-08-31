package shipproject3;

import java.util.ArrayList;
import java.util.List;

public class HeavyContainer implements typeclassifier {
	static List<Integer> Refheavy = new ArrayList<>();
	static List<Integer> RefheavyID = new ArrayList<>();
	
	static List<Integer> Liqheavy = new ArrayList<>();
	static List<Integer> LiqheavyID = new ArrayList<>();
	
	static List<Integer> Norheavy = new ArrayList<>();
	static List<Integer> NorheavyID = new ArrayList<>();
	
	static List<String> heavytype = new ArrayList<>();
	static List<Integer> heavy = new ArrayList<>();
	static List<Integer> heavyID = new ArrayList<>();
	
	static int totalRef;
	static int totalLiq;
	static int totalNor;
	
	Port p2 = new Port();

	public HeavyContainer(List<Integer> heavy, List<Integer> heavyID,List<String> heavytype) throws InterruptedException {
//		super(heavy,heavyID);
		this.heavy=heavy;
		this.heavyID=heavyID;
		this.heavytype=heavytype;
		
		for (int i=0;i<heavy.size();i++) {
			if(heavytype.get(i)=="L") {
				Liqheavy.add(heavy.get(i));
				LiqheavyID.add(heavyID.get(i));
				totalLiq++;
			}
			else if(heavytype.get(i)=="R") {
				Refheavy.add(heavy.get(i));
				RefheavyID.add(heavyID.get(i));
				totalRef++;
			}
			else {
				Norheavy.add(heavy.get(i));
				NorheavyID.add(heavyID.get(i));
				totalNor++;
			}
		}
		
//		Port p1 = new Port();
//		 p1.Port1(heavy, heavyID);
		
//		for (int i=0;i<heavyID.size();i++) {
//			if (heavyID.get(i)%2==0) {
//				Refheavy.add(heavy.get(i));
//				RefheavyID.add(heavyID.get(i));
//				totalRef+=1;
//			}
//			else {
//				Liqheavy.add(heavy.get(i));
//				LiqheavyID.add(heavyID.get(i));
//				totalLiq+=1;
//			}
//		}
		
	}
	/*
	@Override
	int REF() {
		 return totalRef;
	}
	@Override
	 int LIQ() {
		 return totalLiq;
	 }
	 */
//	 public void send() {
//		 Port p1 = new Port();
//		 p1.Port1(Liqheavy, LiqheavyID);
//		 p1.Port1(Refheavy, RefheavyID);
//	 }

	@Override
	public void REF() throws InterruptedException {
		// TODO Auto-generated method stub
//		System.out.println("Heavy Refrigerated = "+totalRef);
		p2.Port1(Refheavy, RefheavyID);
	}

	@Override
	public void LIQ()throws InterruptedException  {
		// TODO Auto-generated method stub
//		System.out.println("Heavy Liquid = "+totalLiq);
		p2.Port1(Liqheavy, LiqheavyID);
	}
	@Override
	public void NOR() throws InterruptedException  {
		// TODO Auto-generated method stub
		System.out.println("Normal Heavy = "+totalNor);
		p2.Port1(Norheavy, NorheavyID);
	}

}
