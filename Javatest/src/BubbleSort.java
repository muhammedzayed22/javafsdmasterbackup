import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		String a = new String();
		String[] arr = new String[b];
		for (int i=0;i<b;i++) {
			arr[i] = sc.nextLine();
		}
		for (int i=0;i<b-1;i++) {
			for (int j=i+i;j<b;j++) {
				if (arr[i].compareTo(arr[j])>0) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		List<String> arr1 = Arrays.asList(arr);
		System.out.println(arr1);
	}
}
