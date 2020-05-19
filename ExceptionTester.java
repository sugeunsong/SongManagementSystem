package myException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester {

	public static void main(String[] args) {
		System.out.println("정수를 입력하시오 : ");
		
		try {
			int num = getNum();
			}
			catch(MyException e) {
				System.out.println("MyException");
			}
			
			finally {
				System.out.println("End!");
			}
		}
		
		public static int getNum() throws MyException {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			if (num %2 !=0) {
				throw new MyException();
			}
			return num;
		}
}
