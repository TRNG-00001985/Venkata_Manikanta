package revaturecodingexcercise;

public class Hexatooctal {
	public static void main(String[] args) {
		String hexaNUm = "F";
		
		int decNum = Integer.parseInt(hexaNUm, 16);
		System.out.println(decNum);
		String octNum = Integer.toOctalString(decNum);
		
		System.out.println(octNum);
	}

}
