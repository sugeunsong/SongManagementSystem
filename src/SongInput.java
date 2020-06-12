package song;

import java.util.Scanner;

import exception.GenreFormatException;

public interface SongInput {
	
	public String getName();
	
	public void setName(String name);
	
	public String getSinger();
	
	public void setSinger(String singer);
	
	public String getGenre();
	
	public void setGenre(String genre) throws GenreFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setSongName(Scanner input);
	
	public void setSongSinger(Scanner input);
	
	public void setSongGenre(Scanner input);

}
 