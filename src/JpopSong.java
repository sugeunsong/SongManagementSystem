package song;

import java.util.Scanner;

public class JpopSong extends BrandNewSong  {
	
	protected String englishSongName;
	protected String englishSingerName;
	
	public JpopSong(SongKind kind) {	
 		super(kind);
 	}
		
	public void getUserInput(Scanner input) {
		setSongName(input);
		setSongSinger(input);
		setSongEnglishTitlewithYN(input);
		setSingerEnglishNamewithYN(input);
		setSongGenre(input);
		
 	} 
	
	public void setSongEnglishTitlewithYN(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Does this song have an english title? (Y/N)");
	        answer = input.next().charAt(0);
		    if (answer == 'y' || answer == 'Y') {
		    	setSongName(input);
			    break;
		    }
		    else if (answer == 'n' || answer =='N' ) {
			    this.setName("");
			    break;
		    }
		    else {
		    }
		}	
	}
	
	public void setSingerEnglishNamewithYN(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Does this singer have an english name? (Y/N)");
	        answer = input.next().charAt(0);
		    if (answer == 'y' || answer == 'Y') {
		    	setSongSinger(input);
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
		String skind = getkindString(); 
 		System.out.println("kind:" + skind + " name:" + this.name + " singer:" + this.singer + " genre:" + this.genre +  " english title :" + this.getName() + " singer's english name :" + this.getSinger());
 	}
	

}
