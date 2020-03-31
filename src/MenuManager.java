import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println(" ### Song Management Menu ### ");
			System.out.println(" 1. Add Song");
			System.out.println(" 2. Delate Song");
			System.out.println(" 3. Edit Song");
			System.out.println(" 4. View Song");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			if(num == 1) {
				addSong();
			}
			else if(num == 2) {
				delateSong();
			}
			else if(num == 3) {
				editSong();
			}
			else if(num == 4) {
				viewSong();
			}
			else {
				continue;
			}
		} 
	}
	
	public static void addSong() {
		Scanner input = new Scanner(System.in);
		System.out.print("Song Name :");
		String SongName = input.next();
		System.out.print("Singer :");
		String Singer = input.next(); 
		System.out.println(Singer);
		System.out.print("Song Genre :");
		String SongGenre = input.next(); 
		System.out.println(SongGenre);

	}
	public static void delateSong() {
		Scanner input = new Scanner(System.in);
		System.out.print("Delate Name : ");
		String SongName = input.next();
	
	}
	
	public static void editSong() {
		Scanner input = new Scanner(System.in);
		System.out.print("Edit Name : ");
		String SongName = input.next();
	
	}
	
	public static void viewSong() {
		Scanner input = new Scanner(System.in);
		System.out.print("View Name : ");
		String SongName = input.next();
	
	}
} 
