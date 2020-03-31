
public class SecondConverter {

	public static void main(String[] args) {
		int s1, s2, m, h, d, y;
		s1 = 1;
		s2 = 100000;
		m = (60*s1);
		h = 60*m;
		d = 24*h;
		y = 365*d;
		
		System.out.println("m = " + s2/m + "\t" + s2%m);
		System.out.println("h = " + s2/h + "\t" + s2%h);
		System.out.println("d = " + s2/d + "\t" + s2%d);
		
		if (s2>=y) {
			System.out.print("100000seconds are more than 1 year");
		}
		else {
			System.out.print("100000seconds aren't more than 1 year");
			
		}

	}

}
