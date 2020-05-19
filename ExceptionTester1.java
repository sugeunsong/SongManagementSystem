package myException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester1 {

	public static void main(String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("첫 번쨰 정수를 입력 : ");
			int n1 = input.nextInt();
			System.out.print("두 번쨰 정수를 입력 : ");
			int n2 = input.nextInt();
			int result = n1 + n2;
			System.out.println(result);
	
			}
			catch(InputMismatchException e) {
				System.out.println("InputMismatchException");
				e.printStackTrace();
			}
			finally {
				System.out.println("End!");
			}
		}
		
		public static int getNum() throws InputMismatchException {
			Scanner input = new Scanner(System.in);
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			return n1;
		    
	}

}
