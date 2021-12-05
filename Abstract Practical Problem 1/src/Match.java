
public abstract class Match {
	 int currentScore;
     float currentOver;
     int target;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	void display() {
		//fill your code here
	}
	abstract float calculateRunrate();
	abstract int calculateBalls();
}