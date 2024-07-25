package revaturecodingexcercise;

public class Fibanocci {
	
	static void fib(int n) {
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n;i++) {
			c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		fib(10);
	}

}
