import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ���� ������ �Է� : ");
		int n1 = input.nextInt();
		System.out.print("�� ���� ������ �Է� : ");
		int n2 = input.nextInt();
		System.out.print("�����ڸ� �Է� : ");
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
			System.out.println("������ ����");
		}
		
	}

}
