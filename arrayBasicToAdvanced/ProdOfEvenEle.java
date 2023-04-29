package arrayBasicToAdvanced;
import java.util.Scanner;

public class ProdOfEvenEle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size= sc.nextInt();
		int arr1[]=new int[size];
		int prod=1;
		for(int i =0;i<size;i++) {
			arr1[i]=sc.nextInt();
			
			
			if(arr1[i]%2==0) {
				prod=prod*arr1[i];
			}
		}
		System.out.println(prod);

	}

}
