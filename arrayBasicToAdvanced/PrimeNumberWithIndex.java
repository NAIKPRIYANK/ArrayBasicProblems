package arrayBasicToAdvanced;

import java.io.*;
import java.io.InputStreamReader;

public class PrimeNumberWithIndex {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array: ");
		int size=Integer.parseInt(br.readLine());
		int[]arr=new int [size];
		 System.out.println("Enter the elements of the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        for(int i=0;i<size;i++) {
			int num=arr[i];
			int count=0;
			for(int j=2;j<num;j++) {
				
				if(num%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(arr[i]+" is a Prime number at index "+i);
			}
		}

	}

}
