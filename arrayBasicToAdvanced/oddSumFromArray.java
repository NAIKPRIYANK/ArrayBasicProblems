package arrayBasicToAdvanced;

import java.util.Scanner;

public class oddSumFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of element: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
			
				
				
			
		}
		System.out.print("The sum odd element of array is : "+sum);
	}

	}


