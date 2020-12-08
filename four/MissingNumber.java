
public class MissingNumber {

	public static void main(String[] args) {
		int arr[]  = {2,1,3,5,6};
		int min = 1;
		int max = 6;
		int y =0;
		int x = 0;
		for(int i = 0; i<arr.length; i++) {
			y = y ^ arr[i];
		}
		for(int i = min ; i<=max; i++) {
			x = x ^ i;
		}
		System.out.println("Missing No is "+(x^y));
		

	}

}
