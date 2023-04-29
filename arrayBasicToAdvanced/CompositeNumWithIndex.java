package arrayBasicToAdvanced;

public class CompositeNumWithIndex {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7};
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			for(int j=2;j<num;j++) {
				
				if(num%j==0) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(arr[i]+" is a composite number at index "+i);
			}
		}
		

	}

}
