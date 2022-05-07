
public class Circle {

	public int r;
	public final double PI_NUMBER = 3.14;

	public Circle(int r) {
		this.r = r;
	}

	public void calculateArea() {
		System.out.println("Area of circle is" + PI_NUMBER * Math.pow(this.r, 2));
	}
}
