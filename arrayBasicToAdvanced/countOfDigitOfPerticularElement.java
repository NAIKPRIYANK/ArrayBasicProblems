package arrayBasicToAdvanced;

public class countOfDigitOfPerticularElement {

	public static void main(String[] args) {
		int arr[]= {02,255,2,1554};
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			while(num>0) {
				num/=10;
				count++;
				}
			System.out.println(count);
		}

	}

}
