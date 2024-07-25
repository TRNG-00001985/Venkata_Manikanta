package revaturecodingexcercise;

import java.util.Arrays;

public class Maxminusmin {
public static void main(String[] args) {
		
		int arr[]= {6,5,76,82,7,68,21};
		int n= arr.length;
		Arrays.sort(arr);
		int max_element = arr[n-1];
		int min_element = arr[0];
		int max_minus_min = max_element -min_element;
		System.out.println(max_minus_min);
		
	}

}
