package shipproject2;
import java.util.*;
class Container{
	int id;
	int weight;
	Container(int id1,int weight){
		this.id=id1;
		this.weight=weight;
		
	}
	void sep(int weight,int id) {
		if(weight<500) {
			basic b=new basic(weight,id);
		}
		else {
			heavy h=new heavy(weight,id);
		}
	}
}
class basic{
	int id;
	int weight;
	basic(int weight,int id){
		this.weight=weight;
		this.id=id;
	}
}
class heavy{

	heavy(int weight,int id){
		
	}
}
class liquid{
	
}
class refrige{
	
}
public class ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int weight,id1;
		ArrayList<Container> container=new ArrayList<Container>();
		ArrayList<basic> container1=new ArrayList<basic>();
		ArrayList<heavy> container2=new ArrayList<heavy>();
		ArrayList<liquid> container3=new ArrayList<liquid>();
		ArrayList<refrige> container4=new ArrayList<refrige>();
		ArrayList<String> loc=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			id1=sc.nextInt();
			weight=sc.nextInt();
			Container s=new Container(id1,weight);
			container.add(s);
			
		}
		System.out.println("Enter the locations");
		int location=sc.nextInt();
		for(int i=0;i<location;i++)
		{
			loc.add(sc.next());
		}
	}

}
