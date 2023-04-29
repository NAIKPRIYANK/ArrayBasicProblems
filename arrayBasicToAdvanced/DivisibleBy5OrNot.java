package arrayBasicToAdvanced;

import java.util.Scanner;

public class DivisibleBy5OrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of element: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array Element: ");
		for(int i =0;i<size;i++ ) {
			arr[i]=sc.nextInt();
		
;		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%5==0) {
				System.out.print(arr[j]);
			}
		}
		

	}

}
