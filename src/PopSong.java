package song;

import java.util.Scanner;

public class PopSong extends Song {
	
	public PopSong(SongKind kind) {	
 		super(kind);
 	}
	
	public void getUserInput(Scanner input) {
		setSongName(input);
		setSongSinger(input);
		setSongGenre(input);
 	}
	
	public void printInfo() {
		String skind = getkindString();
 		System.out.println("kind:" + skind + " name:" + this.name + " singer:" + this.singer + " genre:" + this.genre);
 	} 

}
