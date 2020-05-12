package shape;

public class Triangle extends Shape {
	private int length= 3;
	private int width = 4;
	
	public Triangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void getArea() {
		System.out.println("The area of the Triangle is " + this.length*this.width/2);
	}

}
