package song;

import java.util.Scanner;

import exception.GenreFormatException;

public abstract class BrandNewSong extends Song {
	
	public BrandNewSong(SongKind kind) {	
 		super(kind);
 	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
 		String skind = getkindString();
 		System.out.println("kind:" + skind + " name:" + this.name + " singer:" + this.singer + " genre:" + this.genre);
 	}
	
	public void setSongGenrewithYN(Scanner input) {
 		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you know genre of song? (Y/N)");
	        answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Song Genre :");
					String genre = input.next(); 
					this.setGenre(genre);
					break;
				}
				else if (answer == 'n' || answer =='N' ) {
					this.setGenre("");
					break;
				}
				else {
				}
			}
			catch(GenreFormatException e) {
				System.out.println("Incorrect Genre Format. put * in front of the song genre");
			}
		}
 	}

}
