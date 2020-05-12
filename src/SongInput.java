package song;

import java.util.Scanner;

public interface SongInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setSinger(String singer);
	
	public void setGenre(String genre);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setSongName(Scanner input);
	
	public void setSongSinger(Scanner input);
	
	public void setSongGenre(Scanner input);

}
 