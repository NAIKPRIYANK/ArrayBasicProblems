package arrayBasicToAdvanced;
import java.io.*;

public class ReverseOfEachElement {

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
        	int num =arr[i];
        	int temp;
        	int rev=0;
        	while(num>0) {
        		temp=num%10;
        		rev=(rev*10)+temp;
        		num/=10;
        		
        	}
        	System.out.println(rev);
        }

	}

}
