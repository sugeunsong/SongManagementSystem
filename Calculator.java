import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수를 입력 : ");
		int n1 = input.nextInt();
		System.out.print("두 번쨰 정수를 입력 : ");
		int n2 = input.nextInt();
		System.out.print("연산자를 입력 : ");
		String a = input.next();
		
		switch (a) {
		case "+":
			System.out.println(n1 + n2);
			break;
			
		case "-":
			System.out.println(n1 - n2);
			break;
			
		case "*":
			System.out.println(n1 * n2);
			break;
			
		case "/":
			System.out.println(n1 / n2);
			break;
			
		default:
			System.out.println("연산자 오류");
		}
		
	}

}
