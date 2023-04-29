package arrayBasicToAdvanced;

public class AdditionOfDigitsIsEven {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,15,16,14,28,17,29,123};
		
		
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int temp;
			int fadd=0;
			while(num>0) {
			
			temp=num%10;
			fadd+=temp;
			num/=10;
			
			}
			if(fadd%2==0) {
				System.out.println(arr[i]);
			}
			
		}

	}
			
			
}

