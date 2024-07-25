package revaturecodingexcercise;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "abba";
		char arr[] = str.toCharArray();
		String rev_str = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			rev_str+=arr[i];
		}
		if(str.equals(rev_str)) {
			System.out.println("Strings are palindrome");
		}
		else {
			System.out.println("Strings are not palindrome");
		}
		
	}

}
