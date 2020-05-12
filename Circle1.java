package shape;

public class Circle1 extends Shape1 {
	private int radius;
	private double pi = 3.14;
	
	public Circle1 (int radius) {
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("The area of the Circle is " + this.radius*this.radius*pi);
	}

}
