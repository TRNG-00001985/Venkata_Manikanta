package revaturecodingexcercise;

public interface Revature {
	
	abstract void shape();

}


class Circle implements Revature{
	
	int R;
	public Circle(int i) {
		this.R=i;
	}

	public void shape() {
		System.out.println(2*3.14*R*R);
	}
	
	public static void main(String[] args) {
		Circle cc = new Circle(5);
		cc.shape();
	}

	
	
}