package arrayBasicToAdvanced;

public class CommonElementFromTwo {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,7};
		int arr1[]= {2,3,4,6,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
