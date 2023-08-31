package java1;
import java.util.*;
public class MaxGudLen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(),c=0;
		int[][] mat = new int[a][b];
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int l=0,x=1,z=Math.min(a,b);
		while (l<=mat.length)
		{while (x<=z) {
		for (int i=l;i<x-1;i++) {
			for (int j=l;j<x;j++) {
				if (mat[i][j]<x) 
					break;
				if (i==x-1 && j==x-1) 
					c++;
				
					
					
			}
			x=x+1-l;
			
		}
		l++;}
		
		
	}
		
		System.out.print(c);
}
	
}
