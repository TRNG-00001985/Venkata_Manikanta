package revaturecodingexcercise;

public class Containsduplicates {
	public static void main(String[] args) {
		if(containduplicate()) {
			System.out.println("Containd Duplicates");	
		}
		else {
			System.out.println("Does not contain duplicates");
		}
		
	}
	
	public static boolean containduplicate() {
		int arr[] = {2,3,5,6,7};
		int n = arr.length;
		boolean flag = true;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
		}
		if(flag==false) {
			return true; 
		}
		else {
			return false;
		}
	}

}
