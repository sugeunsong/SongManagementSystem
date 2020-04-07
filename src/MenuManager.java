import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SongManager songManager = new SongManager(input);
		int num = -1;
		while (num != 5) {
			System.out.println(" ### Song Management Menu ### ");
			System.out.println(" 1. Add Song");
			System.out.println(" 2. Delate Song");
			System.out.println(" 3. Edit Song");
			System.out.println(" 4. View Song");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if(num == 1) {
				songManager.addSong();
			}
			else if(num == 2) {
				songManager.delateSong();
			}
			else if(num == 3) {
				songManager.editSong();
			}
			else if(num == 4) {
				songManager.viewSong();
			}
			else {
				continue;
			}
		} 
	}
	
} 
