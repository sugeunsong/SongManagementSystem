package inheritance;

public class GenreMusic extends Music{
	
	private String genre;
	
	public void getGenre(String genre) {
		this.genre = genre;
	}
	
	public void print() {
		System.out.println(this.name + "ÀÇ" + this.song + " (" +this.genre + ")");
	}
}


