package shipproject3;

import java.util.*;

public class BasicContainer implements typeclassifier{
	static List<Integer> RefBasic = new ArrayList<>();
	static List<Integer> RefBasicID = new ArrayList<>();
	
	static List<Integer> LiqBasic = new ArrayList<>();
	static List<Integer> LiqBasicID = new ArrayList<>();
	
	static List<Integer> NorBasic = new ArrayList<>();
	static List<Integer> NorBasicID = new ArrayList<>();
	
	static List<String> basictype = new ArrayList<>();
	static List<Integer> basic = new ArrayList<>();
	static List<Integer> basicID = new ArrayList<>();
	
	static int totalRef;
	static int totalLiq;
	static int totalNor;
	
	Port p1 = new Port();
	
	public BasicContainer(List<Integer> basic, List<Integer> basicID, List<String> basictype) throws InterruptedException {
		//super(basic,basicID);
		this.basictype = basictype;
		this.basic=basic;
		this.basicID=basicID;
		
		for (int i=0;i<basic.size();i++) {
			if(basictype.get(i)=="L") {
				LiqBasic.add(basic.get(i));
				LiqBasicID.add(basicID.get(i));
				totalLiq++;
			}
			else if(basictype.get(i)=="R") {
				RefBasic.add(basic.get(i));
				RefBasicID.add(basicID.get(i));
				totalRef++;
			}
			else {
				NorBasic.add(basic.get(i));
				NorBasicID.add(basicID.get(i));
				totalNor++;
			}
		}
		
		
//		Port p1 = new Port();
//		 p1.Port1(basic, basicID);
//		
//		
//		for (int i=0;i<basicID.size();i++) {
//			if (basicID.get(i)%2==0) {
//				RefBasic.add(basic.get(i));
//				RefBasicID.add(basicID.get(i));
//				totalRef+=1;
//			}
//			else {
//				LiqBasic.add(basic.get(i));
//				LiqBasicID.add(basicID.get(i));
//				totalLiq+=1;
//			}
//		}
		
		
		
		
	}
	@Override
	public void REF() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Basic Refrigerated = "+totalRef);
		p1.Port1(RefBasic, RefBasicID);
	}

	@Override
	public void LIQ()throws InterruptedException  {
//		 TODO Auto-generated method stub
		System.out.println("Basic Liquid = "+totalLiq);
		p1.Port1(LiqBasic, LiqBasicID);
	}
	@Override
	public void NOR() throws InterruptedException  {
		// TODO Auto-generated method stub
		System.out.println("Basic Normal = "+totalNor);
		p1.Port1(NorBasic, NorBasicID);
	}
	 
//	 public void send() {
//		 Port p1 = new Port();
//		 p1.Port1(LiqBasic, LiqBasicID);
//		 p1.Port1(RefBasic, RefBasicID);
//	 }

	
}
