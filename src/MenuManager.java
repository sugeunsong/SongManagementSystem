import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SongManager songManager = new SongManager(input);

		selectMenu(input, songManager);

	}

	public static void selectMenu(Scanner input, SongManager songManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					songManager.addSong();
					break;
				case 2:
					songManager.delateSong();
					break;
				case 3:
					songManager.editSong();
					break;
				case 4:
					songManager.viewSongs();
					break;
				default: 
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		} 
	}

	public static void showMenu() {
		System.out.println(" ### Song Management Menu ### ");
		System.out.println(" 1. Add Song");
		System.out.println(" 2. Delate Song");
		System.out.println(" 3. Edit Song");
		System.out.println(" 4. View Songs");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}

}