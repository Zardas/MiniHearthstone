package jeu;

import java.util.ArrayList;

import type.Card;
import utils.Constantes;
import utils.RandomInt;

public class Draw {

	public ArrayList<Card> pull;
	
	public Draw() {
		
	}
	
	/*
	 * Return a card from the pull a possible ones
	 */
	public Card drawCard() {
		double number = Math.random()*(Constantes.MAXDECKSIZE-0);
		number = number - number%1;
		
		return this.pull.get(RandomInt.rand(Constantes.MAXDECKSIZE,0));
	}
	
	
	
}
