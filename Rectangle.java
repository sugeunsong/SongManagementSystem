package interfaceShape;

public class Rectangle implements Shape {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.println("The area of the Rectangle is " + this.length*this.width);
	}

}
