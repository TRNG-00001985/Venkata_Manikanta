package revaturecodingexcercise;

public class Arraysum {
	public static void main(String args[]) {
		
		
		int arr[] = {1,2,3,5,9,4};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
