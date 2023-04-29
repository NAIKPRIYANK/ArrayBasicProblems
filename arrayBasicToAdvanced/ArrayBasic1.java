package arrayBasicToAdvanced;
import java.util.Scanner;

public class ArrayBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of element: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]);
			
		}
		

	}

}
