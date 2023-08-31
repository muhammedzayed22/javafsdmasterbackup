package java1;

public class JaggedArray {
	public static void main (String[] args) {
		int a[][] = new int[][] {
			new int[] {1,2,3,4,5},
			new int[] {2,4,6,8},
			new int[] {4,3,6,1,3,7}
		};
		int a1[][] = {
				new int[] {1,2,3},
				new int[] {4,5,6},
				new int[] {7,8,9},
				new int[] {10,11,12}
		};
		int a2[][] = {{1,2,3},{10,20,30}};
		int a3[][] = new int[3][];
		a3[0] = new int[2];
		a3[1] = new int[3];
		a3[2] = new int[4];
		int c = 0;
		for (int i=0;i<a3.length;i++) {
			for (int j=0;j<a3[i].length;j++) {
				a3[i][j]=c++;
			}
			c=0;
		}
		for (int i=0;i<a3.length;i++) {
			for (int j=0;j<a3[i].length;j++) {
				System.out.print(a3[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		}
}
