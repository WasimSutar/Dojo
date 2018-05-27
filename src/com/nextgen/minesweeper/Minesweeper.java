package com.nextgen.minesweeper;

import java.util.Arrays;

public class Minesweeper {

	public char[][] mine(char[][] mineInput) {
		char[][] arr = new char[4][4];
		arr = Arrays.copyOf(mineInput, mineInput.length);
		for (int i = 0; i < mineInput.length; i++) {
			for (int j = 0; j < mineInput[0].length; j++) {

				if (mineInput[i][j] == '*') {
					if ((j + 1 < mineInput.length) && (mineInput[i][j + 1] != '*')) {
						arr[i][j + 1] = increment(arr[i][j + 1]);
					}
					if ((i + 1 < mineInput.length) && (j + 1 < mineInput.length) && (mineInput[i + 1][j + 1] != '*')) {
						arr[i + 1][j + 1] = increment(arr[i + 1][j + 1]);
					}
					if ((j - 1 >= 0) && (mineInput[i][j - 1] != '*')) {
						arr[i][j - 1] = increment(arr[i][j - 1]);
					}
					if ((i - 1 >= 0) && (j - 1 >= 0) && (mineInput[i - 1][j - 1] != '*')) {
						arr[i - 1][j - 1] = increment(arr[i - 1][j - 1]);
					}
					if ((i + 1 < mineInput.length) && (mineInput[i + 1][j] != '*')) {
						arr[i + 1][j] = increment(arr[i + 1][j]);
					}
					if ((i + 1 < mineInput.length) && (j - 1 >= 0) && (mineInput[i + 1][j - 1] != '*')) {
						arr[i + 1][j - 1] = increment(arr[i + 1][j - 1]);
					}
					if ((i - 1 >= 0) && (j + 1 < mineInput.length) && (mineInput[i - 1][j + 1] != '*')) {
						arr[i - 1][j + 1] = increment(arr[i - 1][j + 1]);
					}
					if ((i - 1 >= 0) && (mineInput[i - 1][j] != '*')) {
						arr[i - 1][j] = increment(arr[i - 1][j]);
					}
				}
			}
		}
		return arr;
	}

	private char increment(char c) {
		switch (c) {

		case '-':
			return '1';
		case '1':
			return '2';
		case '2':
			return '3';
		case '3':
			return '4';
		case '4':
			return '5';
		case '5':
			return '6';
		case '6':
			return '7';
		case '7':
			return '8';
		default:
			return c;

		}

	}

}
