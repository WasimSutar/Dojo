package com.nextgen.pokerhands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 import static org.junit.Assert.*;
import org.junit.Test;

//Poker hands game
public class TestGame {
/*
	Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH
	Black: 2H 4S 4C 2D 4H  White: 2S 8S AS QS 3S
	Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C KH
	Black: 2H 3D 5S 9C KD  White: 2D 3H 5C 9S KH
	
	White wins. - with high card: Ace 
	Black wins. - with full house: 4 over 2 
	Black wins. - with high card: 9
	Tie  .
	
	*/
	
	
	@Test
	public void testFullHouse(){
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		Card [] cardArray = {new Card('Q','H'),new Card('Q','S'),new Card('Q','C'),new Card('J','C'),new Card('J','D')};
		Card [] cardArray1 = {new Card('2','C'),new Card('3','H'),new Card('A','H'),new Card('8','C'),new Card('4','S')};
		
		player1 = Arrays.asList(cardArray);
		player2 = Arrays.asList(cardArray1);
		Game game = new Game(player1,player2);
		Result result = game.getResult();
	//	assertEquals("player1", result.getName());
		
		
	}
}
