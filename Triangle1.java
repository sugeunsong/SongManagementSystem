package shape;

public class Triangle1 extends Shape1 {
	private int length= 3;
	private int width = 4;
	
	public Triangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void getArea() {
		System.out.println("The area of the Triangle is " + this.length*this.width/2);
	}

}
