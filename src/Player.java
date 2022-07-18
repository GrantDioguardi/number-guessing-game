
public class Player {

	private int lives;
	private int score;
	private String name;
	
	public Player(String nameParam, int livesParam) {
		lives = livesParam;
		name = nameParam;
		score = 0;
	}
	
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lifeParam) {
		lives = lifeParam;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nameParam) {
		name = nameParam;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int scoreParam) {
		score = scoreParam;
	}
	
	public String toString() {
		return "Playername: " + name + ", Score: " + score + ", Lives Remaining: " + lives;
	}
}
