package com.nextgen.minesweeper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestMinesweeper {
	private  char[][] mineInput = {{'*','*','-','-'},{'-','-','*','-'},{'-','-','-','-'},{'-','*','*','-'}};
	private  char[][] mineOutput = {{'*','*','2','1'},{'2','3','*','1'},{'1','3','3','2'},{'1','*','*','1'}};
	private Minesweeper mineSweeper = new Minesweeper();
	
	
	@Before
	public void setup()
	{
		
	}
	
	@Test
	public void testResult_Size() {
		char[][] tempResult = mineSweeper.mine(mineInput);
		assertEquals(tempResult.length, 4);
		assertEquals(tempResult[0].length,4);
		
	}
	
	@Test
	public void testResult_Values() {
		char[][] tempResult = mineSweeper.mine(mineInput);
		assertTrue(Arrays.equals(tempResult[0], mineOutput[0]));
		assertTrue(Arrays.equals(tempResult[1], mineOutput[1]));
		assertTrue(Arrays.equals(tempResult[2], mineOutput[2]));
		assertTrue(Arrays.equals(tempResult[3], mineOutput[3]));
		
		
	}

}
