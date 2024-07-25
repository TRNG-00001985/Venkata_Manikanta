package revaturecodingexcercise;

public class Polymorphism {
	int a = 5;
	int b=5;
	public int add() {
		return a+b;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Polymorphism pp = new Polymorphism();
		
		System.out.println(pp.add());
		System.out.println(pp.add(98,35));
		System.out.println(pp.add(65, 612, 12));
		
		}

}
