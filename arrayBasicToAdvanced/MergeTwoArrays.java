package arrayBasicToAdvanced;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int arr2[]= {9,18,27,36,45};
		int arrl=arr.length;
		int arr2l=arr2.length;
		int totalL=arrl+arr2l;
		int arr3[]=new int[totalL];
		for(int i=0;i<arrl;i++){
			arr3[i]=arr[i];
			
		}
		for(int i=0;i<arr2l;i++) {
			arr3[arrl+i]=arr2[i];
			
		}
		for(int i=0;i<totalL;i++) {
			System.out.print(arr3[i]+" ");
		}
		

	}

}
