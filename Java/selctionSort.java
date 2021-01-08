import java.util.Scanner;

public class selctionSort {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting :");
		for(int i=0;i< arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		sort(arr);
	}

	 static void sort(int[] arr) {
		 int smallnumber=0;
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
				 index=j;
				}
			}
			smallnumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallnumber;
		}
		System.out.println("Array after sorting :");
		for(int i=0;i< arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
	}
}