package jeu;

import utils.*;

public class Jeu {

	public Player player1;
	public Player player2;
	
	public int turn_number; //Count the number of turn played since the beginning of the game
	
	public int turn; //Determine which player turn it is (1 or 2)
	
	public Jeu() {
		this.coinToss();
	}
	
	/*
	 * Determine what player begin to play
	 */
	public void coinToss() {
		this.turn = RandomInt.rand(2, 1);
	}
	
	
	public static void main(String args[]) {
		
	}
}
