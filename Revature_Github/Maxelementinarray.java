
package revaturecodingexcercise;

import java.util.Arrays;


public class Maxelementinarray {
	public static void main(String[] args) {
		
		int arr[]= {6,5,76,82,7,68,21};
		int n= arr.length;
		Arrays.sort(arr);
		int max_element = arr[n-1];
		System.out.println(max_element);
		
	}

}
