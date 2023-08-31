package shipproject3;
import java.util.*;

interface typeclassifier{
	void REF() throws InterruptedException;
	void LIQ() throws InterruptedException;
	void NOR() throws InterruptedException;
}

class Container extends Ship {
	static int BasicWeight=0,HeavyWeight=0,TREF=0,TLIQ=0,TNOR=0;
	static List<Integer> W = new ArrayList<>();
	static List<Integer> ID = new ArrayList<>();
	static List<Integer> basic = new ArrayList<>();
	static List<Integer> basicID = new ArrayList<>();
	static List<String> basictype = new ArrayList<>();
	static List<Integer> heavy = new ArrayList<>();
	static List<Integer> heavyID = new ArrayList<>();
	static List<String> heavytype = new ArrayList<>();
	public Container(List<Integer> W,List<Integer> ID, List<String> types) {
		this.W=W;
		this.ID=ID;
		this.types=types;
		Ship s1 = new Ship();
		int l = s1.getCapacity()/5;
		for (int i=0;i<W.size();i++) {
			if (W.get(i)<=l) {
				basic.add(W.get(i));
				basicID.add(ID.get(i));
				basictype.add(types.get(i));
				BasicWeight+=W.get(i);
			}
			else {
				heavy.add(W.get(i));
				heavyID.add(ID.get(i));
				heavytype.add(types.get(i));
				HeavyWeight+=W.get(i);
			}
		}
	}
	public void Basic() throws InterruptedException {
		System.out.println("No. of basic Containers = "+basic.size());
		System.out.println("The ship has departed");
		BasicContainer b1 = new BasicContainer(basic,basicID,basictype);
		b1.REF();
		b1.LIQ();
		b1.NOR();
//		b1.send();
		TREF+=b1.totalRef;
		TLIQ+=b1.totalLiq;
		TNOR+=b1.totalNor;
	}
	public void Heavy() throws InterruptedException {
		System.out.println("No. of heavy Containers = "+heavy.size());
		
		HeavyContainer h1 = new HeavyContainer(heavy,heavyID,heavytype);
		h1.REF();
		h1.LIQ();
		h1.NOR();
//		h1.send();
		TREF+=h1.totalRef;
		TLIQ+=h1.totalLiq;
		TNOR+=h1.totalNor;
	}
	public void display() {
//		System.out.println("Total Refrigerated Containers = "+TREF);
//		System.out.println("Total Liquid Containers = "+TLIQ);
		Main m1 = new Main();
		System.out.printf("Total cost to ship the containers =  %.2f\n",m1.taxes());
	}
	

}
