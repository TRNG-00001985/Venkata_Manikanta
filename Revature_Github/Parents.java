package revaturecodingexcercise;

public class Parents {
	
	int a = 12;
	public void M1() {
		System.out.println("Parent Class Method");
	}
	

}

class Child extends Parents{
	public void M2() {
		System.out.println("Child class Method");
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.M1();
		ch.M2();
	}
}
