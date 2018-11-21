package jeu;

import java.util.ArrayList;

import type.Card;
import type.Hero;
import type.Minion;
import utils.*;

public class Player {
	
	public Draw draw;
	
	public Hero hero;
	
	public ArrayList<Card> hand;
	
	public ArrayList<Card> board;	
	
	public Player() {
		int nb_hero = RandomInt.rand(3, 1);
		
		switch (nb_hero) {
		case 1: this.hero.setName(Constantes.HERONAMEPALADIN);
				break;
		case 2: this.hero.setName(Constantes.HERONAMEWARRIOR);
				break;
		case 3: this.hero.setName(Constantes.HERONAMEMAGE);
				break;
		}
		
	}
	
	public void draw() {
		Card drawn_card = this.draw.drawCard();
		
		this.hand.add(drawn_card);
	}

	public void summon(Minion card) {
		
		//TODO : controller
		
		this.hand.remove(card);
		this.board.add(card);
	}
	
}
