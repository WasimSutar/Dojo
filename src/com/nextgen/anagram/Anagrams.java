package com.nextgen.anagram;

import java.util.List;

public class Anagrams {

	public Result getResult(List<String> inputList) {
		Result result = new Result();

		if (inputList != null) {
			if (inputList.size() >= 2) {
			int len = 	inputList.get(0).length();
			String message="Strings are Anagram";
			boolean flag = true;
				for (int i = 1; i < inputList.size(); i++) {
					if(inputList.get(i).length() != len){
						flag = false;
						message="Strings are not Anagram";
						//result.setAnagram(flag);
						//result.setMessage("Strings are not anagram");
						break;
					}
				}
				
				result.setAnagram(flag);
				result.setMessage(message);
			} else if (inputList.isEmpty() || inputList.size() == 1) {
				result.setAnagram(false);
				result.setMessage("Invalid Input");
			}
		} else {
			result.setAnagram(false);
			result.setMessage("Input List is null");
		}

		return result;
	}

}
