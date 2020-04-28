package song;

import java.util.Scanner;

public class JpopSong extends Song {
	
	protected String englishSongName;
	protected String englishSingerName;
	
	public JpopSong(SongKind kind) {	
 		super(kind);
 	}
		
	public void getUserInput(Scanner input) {
		System.out.print("Song Name :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Singer :");
		String singer = input.next(); 
		this.setSinger(singer);
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Does this song have an english title? (Y/N)");
	        answer = input.next().charAt(0);
		    if (answer == 'y' || answer == 'Y') {
			    System.out.print("english title :");
			    String Name = input.next(); 
			    this.setName(name);
			    break;
		    }
		    else if (answer == 'n' || answer =='N' ) {
			    this.setName("");
			    break;
		    }
		    else {
		    }
		}
		
		answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Does this singer have an english name? (Y/N)");
	        answer = input.next().charAt(0);
		    if (answer == 'y' || answer == 'Y') {
			    System.out.print("english name :");
			    String Singer = input.next(); 
			    this.setSinger(singer);
			    break;
		    }
		    else if (answer == 'n' || answer =='N' ) {
			    this.setSinger("");
			    break;
		    }
		    else {
		    }
		}
 	} 
	
	public void printInfo() {
 		String skind = "none";
 		switch(this.kind) {
 		case Pop:
 			skind = "Pop";
 			break;
 		case Kpop:
 			skind = "Kpop";
 			break;
 		case Jpop:
 			skind = "Jpop";
 			break;
 		}
 		System.out.println("kind:" + skind + " name:" + this.name + " singer:" + this.singer + " genre:" + this.genre +  " english title :" + this.getName() + " singer's english name :" + this.getSinger());
 	}

}