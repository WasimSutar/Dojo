package com.nextgen.expression;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPatternMatcher {
		private String exp;
		private PatternMatcher patMatcher;
		

	@Before
	public void setup()
	{
		patMatcher = new PatternMatcher();
	}
	

	
	@Test
	public void testInvalidExpression_length() {
		exp = "[])";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
		
	}
	
	@Test
	public void testInvalidExpression_unmatched() {
		exp = "[)";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
		
	}
	

	
	@Test
	public void testInvalidExpression_3() {
		exp = "[{}(])";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
	}
	
	@Test
	public void testInvalidExpression_4() {
		exp = "]()}";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
	}
	
	@Test
	public void testInvalidExpression_5() {
		exp = "]}";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
	}
	
	@Test
	public void testInvalidExpression_6() {
		exp = "1+23";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertFalse(result);
	}
	

	
	@Test
	public void testValidExpression() {
		exp = "[]";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertTrue(result);
		
	}
	
	@Test
	public void testValidExpression_2() {
		exp = "[{()}]";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertTrue(result);
	}
	
	@Test
	public void testValidExpression_3() {
		exp = "[]{}";
		boolean result = false;
		result = patMatcher.checkExpression(exp);
		assertTrue(result);
	}
}
