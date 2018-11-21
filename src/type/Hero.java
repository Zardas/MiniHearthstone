package type;

import utils.Constantes;

public class Hero implements Entity {
	
	public String name;
	
	public int life;
	
	public Hero() {
		this.life = Constantes.MAXHEROLIFE;
	}
	
	public void getDamage(Minion opponent) {
		this.life = this.life - opponent.attack;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
