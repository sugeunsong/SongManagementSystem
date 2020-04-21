package game;

public class GameManager {

	public static void main(String[] args) {
		   Hunter hunter1 = new Hunter();
		   Monster monster1 = new Monster();
		   
		   System.out.println(monster1.hp);
		   monster1.attack(monster1);
		   
		   System.out.println("Hunter attacked Monster with  a power of " + Hunter.power);
		   System.out.println("monster has " + monster1.hp + "HP");
		   
	}

	

	

}
