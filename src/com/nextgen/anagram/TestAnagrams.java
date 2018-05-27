package com.nextgen.anagram;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestAnagrams {

	private Anagrams anagrams;
	private List<String> inputList;

	@Before
	public void setUp() {
		anagrams = new Anagrams();
		inputList = new ArrayList<>();
	}

	@Test
	public void testForInputNotEmpty() {
		inputList.add("Apple");
		inputList.add("ppale");
		
		assertTrue(anagrams.getResult(inputList).isAnagram());
	}
	@Test
	public void testForInputEmpty() {
		
		assertFalse(anagrams.getResult(inputList).isAnagram());
		assertEquals("Invalid Input", anagrams.getResult(inputList).getMessage());
	}
	
	@Test
	public void testForSingleString() {
		inputList.add("Apple");
		assertFalse(anagrams.getResult(inputList).isAnagram());
		assertEquals("Invalid Input", anagrams.getResult(inputList).getMessage());
	}
	
	@Test
	public void testForListIsNull() {
		inputList = null;
		assertFalse(anagrams.getResult(inputList).isAnagram());
		assertEquals("Input List is null", anagrams.getResult(inputList).getMessage());
	}
	
	@Test
	public void testForIsAnagram() {
		
		inputList.add("Apple");
		inputList.add("ppAle");
		
		assertTrue(anagrams.getResult(inputList).isAnagram());
		assertEquals("Strings are Anagram", anagrams.getResult(inputList).getMessage());
	}
	
	@Test
	public void testForNotAnagram() {
		
		inputList.add("Applee");
		inputList.add("ppAle");
		
		assertFalse(anagrams.getResult(inputList).isAnagram());
		assertEquals("Strings are not Anagram", anagrams.getResult(inputList).getMessage());
	}
}
