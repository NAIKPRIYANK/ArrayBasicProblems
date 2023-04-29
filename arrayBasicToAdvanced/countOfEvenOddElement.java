package arrayBasicToAdvanced;

public class countOfEvenOddElement {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,6,7,8};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count1++;
				
			}
			else {
				count2++;
			}
		}
		System.out.println("Even element is : "+count1);
		System.out.println("Odd element is : "+count2);
	}

}
