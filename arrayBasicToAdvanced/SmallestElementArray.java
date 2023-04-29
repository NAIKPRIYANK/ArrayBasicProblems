package arrayBasicToAdvanced;
import java.util.Scanner;

public class SmallestElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int min=arr[0];
		System.out.println("enter The array element: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The minimum element is: "+min);

	}

}
