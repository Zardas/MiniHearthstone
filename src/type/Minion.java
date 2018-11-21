package type;

public class Minion extends Card implements Entity {

	public int attack;
	
	public int life;
	
	/*
	 * Attack an opponent minion
	 */
	public void attack(Minion target) {
		target.getDamage(this);
		this.getDamage(target);
		
		//TODO : check death de target et/ou this
	}
	
	/*
	 * Attack the opposing hero
	 */
	public void attack(Hero target) {
		target.getDamage(this);
		
		//TODO : check death de target
	}
	
	
	public void getDamage(Minion opponent) {
		this.life = this.life - opponent.attack;		
	}
}
