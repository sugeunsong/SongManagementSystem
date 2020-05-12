package interfaceShape;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s1 = new Triangle(3, 4);
		s1.getArea();
				
		Shape s2 = new Rectangle(4,4);
		s2.getArea();		
		
		Shape s3 = new Circle(5);
		s3.getArea();
		
	}

	private void getArea() {	
	}
}
