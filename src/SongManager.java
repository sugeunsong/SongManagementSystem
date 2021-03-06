package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import song.JpopSong;
import song.KpopSong;
import song.PopSong;
import song.Song;
import song.SongInput;
import song.SongKind;

public class SongManager implements Serializable {
	
	 public void setScanner(Scanner input) {
	        this.input = input;
	    }
	/**
	 * 
	 */
	private static final long serialVersionUID = -2239842061620390645L;
	
	ArrayList<SongInput> songs = new ArrayList<SongInput>();
	transient Scanner input; 
	SongManager(Scanner input) {
		this.input = input;
	}
	public void addSong() {
		int kind = 0;
		SongInput songInput; 
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Pop ");
				System.out.println("2 for Kpop ");
				System.out.println("3 for Jpop ");
				System.out.println("Select num 1, 2, or 3 for Song Kind :");
				kind = input.nextInt();
				if (kind == 1) {
					songInput = new PopSong(SongKind.Pop);
					songInput.getUserInput(input);
					songs.add(songInput); 
					break; 
				}
				else if(kind == 2) {
					songInput = new KpopSong(SongKind.Kpop);
					songInput.getUserInput(input);
					songs.add(songInput);
					break;
				}
				else if(kind == 3) {
					songInput = new JpopSong(SongKind.Jpop);
					songInput.getUserInput(input);
					songs.add(songInput);
					break;
				}

				else {
					System.out.print("Select num for Song Kind between 1 and 2 :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void delateSong() {
		System.out.print("Song Name : ");
		String songName = input.next();
		int index = findIndex(songName);
		removefromsongs(index, songName); 
	}

	public int findIndex(String songName) {
		int index = -1;
		for(int i = 0; i<songs.size(); i++) {
			if (songs.get(i).getName().equals(songName)) {
				index = i;
				break;
			}
		}
		return index;

	}
	public int removefromsongs(int index, String songName) {
		if (index >= 0) {
			songs.remove(index); 
			System.out.println("the song " + songName + " is delated");
			return 1;
		}
		else {
			System.out.println("the song has not been registered");
			return -1;
		}
	}

	public void editSong() {
		System.out.print("Song Name : ");
		String songName = input.next();
		for(int i = 0; i<songs.size(); i++) {
			SongInput song = songs.get(i);
			if (song.getName().equals(songName)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						song.setSongName(input);
						break;
					case 2:
						song.setSongSinger(input);
						break;
					case 3:
						song.setSongGenre(input);
						break;
					default:
						continue; 
					}
				} 
				break;
			}
		}
	}

	public void viewSongs() {
		//		System.out.print("Song Name : ");
		//		String songName = input.next();
		System.out.println("# of registered songs:" + songs.size());
		for(int i = 0; i<songs.size(); i++) {
			songs.get(i).printInfo();
		}
	}
	
	public int size() {
		return songs.size();
	}
	
	public SongInput get(int index) {
		return (Song) songs.get(index);
	}

	public void showEditMenu() {
		System.out.println(" ## Song Info Edit Menu ## ");
		System.out.println(" 1. Edit Song");
		System.out.println(" 2. Edit Singer");
		System.out.println(" 3. Edit Genre");
		System.out.println(" 4. View Song");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
} 


