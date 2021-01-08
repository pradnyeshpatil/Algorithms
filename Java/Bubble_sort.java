import java.util.Scanner;

public class Bubble_sort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Array before sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
				}
			}
		}
		System.out.println("Array after sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
