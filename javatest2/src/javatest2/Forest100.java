package javatest2;
import java.util.*;

interface DigitalTree{
	int absorbSunlight(int hours);
	void getTreeDetails();
}

class BinaryTree implements DigitalTree{
	
	public int absorbSunlight(int hours) {
		
		return hours*2;
	}

	@Override
	public void getTreeDetails() {
	
	}
}

class QuantumTree implements DigitalTree{
	public int absorbSunlight(int b) {
		return 3*(b*b);
	}

	@Override
	public void getTreeDetails() {
		
	}
}

class NeuralTree implements DigitalTree{
	public int absorbSunlight(int c) {
		return c*c*c;
	}

	@Override
	public void getTreeDetails() {
		
	}
}

class ForestManager  {
	static BinaryTree b1 = new BinaryTree();
	static QuantumTree t1 = new QuantumTree();
	static NeuralTree n1 = new NeuralTree();
	static int n,e=0,TE;
	List<String> types;
	public int produceEnergyForForest(int n, int TE, List<String> types) {
		for (int i=0;i<n;i++) {
			if (types.get(i).charAt(0)=='B') {
				e+=b1.absorbSunlight(TE);
			}
			else if(types.get(i).charAt(0)=='Q') {
				e+=t1.absorbSunlight(TE);
			}
			else e+=n1.absorbSunlight(TE);
		}
		return e;
	}
	
	public void getReport() {
		
	}
}
public class Forest100 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), TE = sc.nextInt();
		List<String> types = new ArrayList<>();
		for (int i=0;i<n;i++) {
			types.add(sc.next());
		}
		ForestManager f1 = new ForestManager();
		System.out.println(f1.produceEnergyForForest(n,TE,types));
		f1.getReport();
	}
}

