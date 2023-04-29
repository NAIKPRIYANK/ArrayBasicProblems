package arrayBasicToAdvanced;

import java.util.Scanner;

public class productOfOddIndex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size= sc.nextInt();
		int arr2[]=new int[size];
		int prod=1;
		for(int i=0;i<size;i++) {
			arr2[i]=sc.nextInt();
			if(i%2!=0) {
				prod=prod*arr2[i];
				
			}
		}
		System.out.println(prod);

	}

}
