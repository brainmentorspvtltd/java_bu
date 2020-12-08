package basics;

import java.util.Arrays;

public class PairSum {
	static void approachOne() {
		int arr[] = {2, 9, 4, 3, 1 ,10, 6};
		int k = 9;
		Arrays.sort(arr);
		// {1,2,3,4,6,9,10}
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i] + arr[j]==k) {
				System.out.println("Pair Sum "+arr[i] +" "+arr[j]);
				return ;
			}
			else
			if(arr[i] + arr[j]<k) {
				i++;
			}
			else
			if(arr[i] + arr[j]>k) {
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approachOne();

	}

}
