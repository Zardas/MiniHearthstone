package type;

/*
 * Define a entity that can attack and take damage (what the board will be full of basically)
 */
public interface Entity {
	
	/*
	 * This entity get attacked by the opponent minion (in our model, heros can't attack)
	 */
	public void getDamage(Minion opponent);

}
