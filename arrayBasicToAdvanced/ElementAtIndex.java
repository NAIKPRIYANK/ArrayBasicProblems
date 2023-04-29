package arrayBasicToAdvanced;
import java.util.Scanner;

public class ElementAtIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,4,5,6};
		System.out.println("Enter the element: ");
		int element=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("The index of "+element+ " is : "+i);
			}else {
				System.out.println("Element not exist in Array!!!!");
				break;
			}
				
				
		}

	}

}
