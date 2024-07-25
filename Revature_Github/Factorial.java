package revaturecodingexcercise;

public class Factorial {
	
	static int fact(int n) {
		
		int res=1;
		for(int i=2;i<=n;i++) {
			res*=i;
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
