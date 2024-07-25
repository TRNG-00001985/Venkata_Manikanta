package revaturecodingexcercise;

public class Octaltohexa {
	public static void main(String[] args) {
		
		String octalNum = "012";
		int decimalNum = Integer.parseInt(octalNum, 8);
		System.out.println(decimalNum);
		String hexNum = Integer.toHexString(decimalNum);
		
		System.out.println(hexNum);
	}

}
