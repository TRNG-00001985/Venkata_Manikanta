package revaturecodingexcercise;

public class Average {
public static void main(String args[]) {
		
		
		int arr[] = {1,2,3,5,9,4};
		int sum = 0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int avg=sum/n;
		System.out.println(avg);
	}

}
