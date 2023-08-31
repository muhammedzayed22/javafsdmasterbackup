package shipproject2;
import java.util.*;

interface cont{
	void add(int id, int weight);
}



public class Container implements cont{
    protected List<Integer> cont_id;
	protected List<Integer> weight;
	List<Integer> Basic = new ArrayList<>();
	List<Integer> BasicID = new ArrayList<>();
	List<Integer> Heavy = new ArrayList<>();
	List<Integer> HeavyID = new ArrayList<>();
    protected static int totalweight;
    Scanner sc = new Scanner(System.in);
    @SuppressWarnings("unused")
	public void add(List<Integer> iD,List<Integer> weight2) {
    	while(true) {
			System.out.println("How many Containers");
			n = sc.nextInt();
			for (int i=0;i<n;i++) {
				System.out.println("Enter weight of container");
				weight = sc.nextInt();
				w.get(weight);
				System.out.println("Enter ID of container");
				ID.get(sc.nextInt());
				capacity-=weight;
				if (capacity==0) {
					System.out.println("Capacity full");
					break;
				}
				else if(capacity<0) {
					System.out.println("Cannot load last container");
					w.remove(w.size()-1);
					break;
				}
			}
		}
        this.weight = weight2;
        this.cont_id = iD;
        for (int j=0;j<weight.size();j++) {
        	if (weight.get(j)<=500) {
        		Basic.add(weight.get(j));
        		BasicID.add(cont_id.get(j));
        	}
        	else {
        		Heavy.add(weight.get(j));
        		HeavyID.add(cont_id.get(j));
        	}
        }
        
//        while(true) {
//        totalweight+=weight2;
//        System.out.println("Total weight of Container = "+totalweight);
//        if (totalweight<0)
//	    if (totalweight<=500 && totalweight>0) {
			BasicContainer bcont = new BasicContainer(BasicID,Basic);
//		}
//		else if (totalweight>500){
			HeavyContainer hcont = new HeavyContainer(HeavyID,Heavy);
//		}
//		else {System.out.println("Ship Empty");break;}
//	    if (totalweight>0) {
//	    System.out.println("Do you want to unload Container ?");
//	    System.out.println("1.Y\n2.N");
//	    char dec = sc.next().charAt(0);  
//	    if (dec=='n' || dec=='N') {
//	    	break;
//	    }
//	    System.out.println("Enter weight of container :");
//	    weight2 = (sc.nextInt())*(-1);
//        }}
    }    
} 