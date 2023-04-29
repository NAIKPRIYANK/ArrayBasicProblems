package arrayBasicToAdvanced;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum1=sum1+arr[i];
				
			}
			else {
				sum2=sum2+arr[i];
			}
		}
		System.out.println("Even element is : "+sum1);
		System.out.println("Odd element is : "+sum2);
	}




	}


