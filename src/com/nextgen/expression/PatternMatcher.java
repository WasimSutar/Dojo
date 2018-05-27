package com.nextgen.expression;

import java.util.Stack;

/*Given an expression string exp , write a program to examine whether the pairs and the orders
of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should print true for 
exp = “[()]{}{[()()]()}” and false for exp = “[(])”*/

public class PatternMatcher {

	public boolean checkExpression(String exp) {
		Stack<Character> expStack = new Stack<>();
		char [] charArray = exp.toCharArray();		
		if(exp.length() % 2 != 0){
			return false;	
		}
		for(int i=0;i< charArray.length;i++){
			char temp = charArray[i];
			if(temp=='{'||temp=='['||temp=='(')
			{
				expStack.push(temp);
			}else{
				if(expStack.isEmpty())
				{
					return false;
				}else{
					if(!isMatching(expStack.pop(),temp)){
						return false;
					}
				}
			}
		}
		return true;
	}

	private boolean isMatching(Character pop, char temp) {
		// TODO Auto-generated method stub
		if(pop == '{' && temp == '}'){
			return true;
		}else if (pop == '[' && temp == ']'){
			return true;
		}else if(pop == '(' && temp == ')'){
			return true;
		}
		return false;
	}

}
