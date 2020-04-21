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

		music1.getName("���亥");
		music1.getSong(" ���");
		music2.getName("�");
		music2.getSong(" �޽þ�");
		music3.getName("��ߵ�");
		music3.getSong(" ���");
		System.out.println("-- �÷��� ����Ʈ --");
		
		music1.playDataPrint();
		music2.playDataPrint();
		music3.playDataPrint();
	}
	
	public void playDataPrint() {
		System.out.println(this.name + "��" + this.song);
		
	}
    
}
 