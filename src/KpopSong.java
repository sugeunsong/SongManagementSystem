package song;

import java.util.Scanner;

public class KpopSong extends BrandNewSong {
	
 	public KpopSong(SongKind kind) {	
 		super(kind);
 	}

 	public void getUserInput(Scanner input) {
 		setSongName(input);
		setSongSinger(input);
		setSongGenrewithYN(input);
		setSongGenre(input);
 	} 
 	
}

