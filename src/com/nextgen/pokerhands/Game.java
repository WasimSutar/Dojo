package com.nextgen.pokerhands;

import java.util.Collections;
import java.util.List;

public class Game {

	List<Card> player1;
	List<Card> player2;

	public Game(List<Card> player1, List<Card> player2) {
		// TODO Auto-generated constructor stub
		this.player1 = player1;
		this.player2 = player2;
	}

	public Result getResult() {
		Collections.sort(player1);
		Collections.sort(player2);
		Result playerOneRank = getRank(player1);
		Result playerTwoRank = getRank(player2);
		System.out.println(player1);
		System.out.println(player2);
		
		
		
		
		
		//CHeck rank for input1
		
		
		

		return new Result();
	}

	private Result getRank(List<Card> player) {
		// CHeck rank for input1
		Result result =new Result();
		int rank = 0;
		if (isFullHouse(player, result)) {
			System.out.println("Full House");
		} else if (isFlush(player, result)) {

		} else if (isStraight(player, result)) {

		} else if (isThreeOfAKind(player, result)) {

		} else if (isTwoOfAKind(player, result)) {

		} else if (isPair(player, result)) {

		} else/* if (isHighCard(player))*/ {
//is High Card
		}
		return result ;
	}


	private boolean isPair(List<Card> player, Result result) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isTwoOfAKind(List<Card> player, Result result) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isThreeOfAKind(List<Card> player, Result result) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isStraight(List<Card> player, Result result) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isFlush(List<Card> player, Result result) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isFullHouse(List<Card> player, Result result) {
		
		//Result res = new Result();
		if (player.get(0).getValue() != player.get(1).getValue()){
//			res.setName(player.get(index));
			return false;
		}else if (player.get(3).getValue() != player.get(4).getValue()){
			return false;
		}else if((player.get(1).getValue() == player.get(2).getValue()) ||(player.get(2).getValue() == player.get(3).getValue())){
			return true;
		}
		
		
		return false;
	}

}
