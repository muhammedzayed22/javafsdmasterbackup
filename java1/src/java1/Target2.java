package java1;
import java.util.*;
class Target2 {
	static int g=0;
	static void combinationUtil(int arr[], int data[], int start,
								int end, int index, int r, int target)
	{
		int sum=0;
		if (index == r)
		{
			for (int j=0; j<r; j++)
				sum+=data[j];
			if(sum==target) 
				g++;
			return;
		}
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r,target);
		}
	}
	static void printCombination(int arr[], int n, int r, int target)
	{
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r,target);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), target = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int[] arr = new int[b-a];
		for (int i=0;i<b-a;i++) {
			arr[i]=i+a;
		}
		int n = arr.length;
		printCombination(arr, n, r, target);
		System.out.print(g);
	}
}