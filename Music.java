package inheritance;

public class Music {
	private String name;
	private String song;
	
	public void getName(String name) {
		this.name = name;
	}
	
	public void getSong(String song) {
		this.song = song;
	}
	public static void main(String[] args) {
		Music music1 = new Music();
		Music music2 = new Music();
		Music music3 = new Music();

		music1.getName("베토벤");
		music1.getSong(" 운명");
		music2.getName("헨델");
		music2.getSong(" 메시아");
		music3.getName("비발디");
		music3.getSong(" 사계");
		System.out.println("-- 플레이 리스트 --");
		
		music1.playDataPrint();
		music2.playDataPrint();
		music3.playDataPrint();
	}
	
	public void playDataPrint() {
		System.out.println(this.name + "의" + this.song);
		
	}
    
}
 