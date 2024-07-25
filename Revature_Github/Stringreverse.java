package revaturecodingexcercise;

public class Stringreverse {
	public static void main(String[] args) {
		String str = "Revature";
		char arr[] = str.toCharArray();
		String rev_str = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			rev_str+=arr[i];
		}
		System.out.println(rev_str);
		
	}

}
