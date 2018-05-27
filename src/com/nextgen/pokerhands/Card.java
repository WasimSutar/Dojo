package com.nextgen.pokerhands;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card>{
char value;
char suite;
Integer rank;
static Map<Character,Integer> valueMap ;

static{
	valueMap = new HashMap<>();
	valueMap.put('A', 14);
	valueMap.put('K', 13);
	valueMap.put('Q', 12);
	valueMap.put('J', 11);
	valueMap.put('T', 10);
	valueMap.put('9', 9);
	valueMap.put('8', 8);
	valueMap.put('7', 7);
	valueMap.put('6', 6);
	valueMap.put('5', 5);
	valueMap.put('4', 4);
	valueMap.put('3', 3);
	valueMap.put('2', 2);
}
public char getValue() {
	return value;
}
public void setValue(char value) {
	this.value = value;
	setRank(value);
}
public char getSuite() {
	return suite;
}
public void setSuite(char suite) {
	this.suite = suite;
}


public Integer getRank() {
	return rank;
}
private void setRank(int rank) {
	this.rank = valueMap.get(rank);
}
public Card(char value, char suite) {
	super();
	this.value = value;
	this.suite = suite;
	this.rank = valueMap.get(this.value);
}
@Override
public int compareTo(Card card) {
	return this.getRank().compareTo(card.getRank());
}
@Override
public String toString() {
	return "Card [value=" + value + ", suite=" + suite + ", rank=" + rank + "]";
}
}
