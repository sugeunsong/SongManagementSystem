package song;

import java.io.Serializable;
import java.util.Scanner;

import exception.GenreFormatException;

public abstract class  Song implements SongInput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4455917464473979496L;
	
	protected SongKind kind = SongKind.Pop;
	protected String name;
	protected String singer;
	protected String genre;

	
 	public Song() {	
 	}
 	
 	public Song(SongKind kind) {	
 		this.kind = kind;
 		
 	}
 	public Song(String name, String singer, String genre) {
 		this.name = name;
 		this.singer = singer;
 		this.genre = genre;

 	}
 	
 	public Song(SongKind kind, String name, String singer, String genre) {
 		this.kind = kind;
 		this.name = name;
 		this.singer = singer;
 		this.genre = genre;

 	}
 	
    public SongKind getKind() {
		return kind;
	}

	public void setKind(SongKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) throws GenreFormatException {
		if(!genre.contains("*") && !genre.equals("")) {
			throw new GenreFormatException();
		}
		this.genre = genre;
	}

 	public abstract void printInfo();
 	
 	public void setSongName(Scanner input) { 
		System.out.print("Song Name :");
		String name = input.next();
		this.setName(name);
	}
	
	public void setSongSinger(Scanner input) { 
		System.out.print("Singer :");
		String singer = input.next(); 
		this.setSinger(singer);
	}
	
	public void setSongGenre(Scanner input) { 
		String genre = "";
		while(!genre.contains("*")) {
			System.out.print("Genre :");
			genre = input.next(); 
			try {
				this.setGenre(genre);
			} catch (GenreFormatException e) {
				System.out.println("Incorrect Genre Format. put * in front of the song genre");
			}
		}
	}
	
	public String getkindString() {
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
		default:
		}
		return skind;
	}
}
