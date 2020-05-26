package log;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogTester {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("문장을 입력해주세요.");
			FileOutputStream file = new FileOutputStream("log.txt");
			String s1 = scanner.nextLine();
			file.write(format.format(date).getBytes());	
			PrintWriter out = new PrintWriter(file);
			out.println(s1);
			
			
			String s2 = scanner.nextLine();
			file.write(format.format(date).getBytes());	
			PrintWriter out1 = new PrintWriter(file);
			out1.println(s2);
		
			
			String s3 = scanner.nextLine();
			file.write(format.format(date).getBytes());
			PrintWriter out2 = new PrintWriter(file);
			out2.println(s3);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(format.format(date) );

	}
}
	
	
	
