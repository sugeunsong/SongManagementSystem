package shape;

public class Circle extends Shape {
	private int radius;
	private double pi = 3.14;
	
	public Circle (int radius) {
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("The area of the Circle is " + this.radius*this.radius*pi);
	}

}
