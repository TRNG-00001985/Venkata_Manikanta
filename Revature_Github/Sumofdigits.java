package revaturecodingexcercise;

public class Sumofdigits {
	public static void main(String[] args) {
		int a=132;
		int sum=0;
		while(a>0) {
			
			int b = a%10;
			sum+=b;
			a=a/10;
		}
		System.out.println(sum);
	}

}
