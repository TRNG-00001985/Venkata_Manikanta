package revaturecodingexcercise;

public class Encapsulation {
	private int a=5;
	
	private int b;
	
	public void seta(int a) {
		this.a=a;
	}
	
	public void setb(int b) {
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

}

class Mani extends Encapsulation{
	
	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		en.seta(5);
		en.setb(6);
		
		System.out.println(en.getA());
		System.out.println(en.getB());
		System.out.println(en.getClass());
		System.out.println(en.hashCode());
	}
}
