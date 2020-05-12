package shape;

public class Rectangle1 extends Shape1 {
	private int length;
	private int width;
	
	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void getArea() {
		System.out.println("The area of the Rectangle is " + this.length*this.width);
	}

}
