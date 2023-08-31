package java1;
import java.util.*;
public class Arrays1 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		int a2[] = {1,2,3,4,5};
		int n = 10;
		int[] a3 = new int[n];
		a1[0] = 90;
		a1[5] = 6;
		
		for (int i:a1) {
			System.out.print(i+"\n");
		}
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), m = sc.nextInt();
		int matrix[][] = new int[l][m];
		
		for (int i=0;i<l;i++) {
			for (int j=0;j<m;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<l;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
