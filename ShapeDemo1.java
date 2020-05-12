package shape;

abstract public class ShapeDemo1 {

	public static void main(String[] args) {
		
		Shape1[] myShape = new Shape1[3];
		myShape[0] = new Triangle1(3,4);
		myShape[1] = new Rectangle1(4,4);
		myShape[2] = new Circle1(5);
		
		for (int i = 0; i<3; i++) {
			myShape[i].getArea();
		}
	}
}
