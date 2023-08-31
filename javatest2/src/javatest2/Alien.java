package javatest2;
import java.util.*;

public class Alien {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String [] dict=new String[n];
		char dict1[]=new char[n];
		for(int i=0;i<n;i++) {
			dict[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			dict1[i]=dict[i].charAt(0);
		}
		String order=sc.next();
		int m=0,s=0;
		char t=dict1[m];
		for(int i=0;i<n;i++) {
			int p=-1;
			for(int j=0;j<order.length();j++) {
				if(order.charAt(j)==dict1[i]) {
					p=j;
					break;
				}
			}
			for(int y=0;y<i;y++) {
				int u=0;
				for(int x=p+1;x<order.length();x++) {
					if(order.charAt(x)==dict1[y]) {
						u=1;
						break;
					}
				}
				if(u==1) {
					s=1;
					break;
				}
			}
		}
		if(s==0) System.out.println(1);
		else System.out.println(0); 	
	}
}