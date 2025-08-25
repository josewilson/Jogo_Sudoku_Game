package com.sudoku.logic;

import com.sudoku.domain.SudokuGame;

public class SudokuUtilities {
    public static void copySudokuArray(int[][] oldArray, int[][] newArray) {
        for (int x = 0; x < SudokuGame.GRID_BOUNDARY; x++) {
            for (int y = 0; y < SudokuGame.GRID_BOUNDARY; y++) {
                newArray[x][y] = oldArray[x][y];
            }
        }
    }

    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int x = 0; x < SudokuGame.GRID_BOUNDARY; x++) {
            for (int y = 0; y < SudokuGame.GRID_BOUNDARY; y++) {
                newArray[x][y] = oldArray[x][y];
            }
        }
        return newArray;
    }
}