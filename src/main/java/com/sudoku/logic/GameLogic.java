package com.sudoku.logic;

import com.sudoku.constants.GameState;
import com.sudoku.domain.SudokuGame;
import static com.sudoku.domain.SudokuGame.GRID_BOUNDARY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameLogic {

    public static SudokuGame getNewGame() {
        return new SudokuGame(
                GameState.NEW,
                getSolvedGame()
        );
    }

    private static final int[][] unolvedGame = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public static int[][] getSolvedGame() {
        return SudokuUtilities.copyToNewArray(unolvedGame);
    }

    public static GameState checkForCompletion(int[][] grid) {
        if (sudokuIsInvalid(grid)) return GameState.ACTIVE;
        if (tilesAreNotFilled(grid)) return GameState.ACTIVE;
        return GameState.COMPLETE;
    }

    public static boolean sudokuIsInvalid(int[][] grid) {
        if (rowsAreInvalid(grid)) return true;
        if (columnsAreInvalid(grid)) return true;
        if (squaresAreInvalid(grid)) return true;
        else return false;
    }

    private static boolean rowsAreInvalid(int[][] grid) {
        for (int y = 0; y < GRID_BOUNDARY; y++) {
            List<Integer> row = new ArrayList<>();
            for (int x = 0; x < GRID_BOUNDARY; x++) {
                row.add(grid[x][y]);
            }
            if (collectionHasRepeats(row)) return true;
        }
        return false;
    }

    private static boolean columnsAreInvalid(int[][] grid) {
        for (int x = 0; x < GRID_BOUNDARY; x++) {
            List<Integer> column = new ArrayList<>();
            for (int y = 0; y < GRID_BOUNDARY; y++) {
                column.add(grid[x][y]);
            }
            if (collectionHasRepeats(column)) return true;
        }
        return false;
    }

    private static boolean squaresAreInvalid(int[][] grid) {
        for (int y = 0; y < GRID_BOUNDARY; y += 3) {
            for (int x = 0; x < GRID_BOUNDARY; x += 3) {
                List<Integer> square = new ArrayList<>();
                for (int yOffset = 0; yOffset < 3; yOffset++) {
                    for (int xOffset = 0; xOffset < 3; xOffset++) {
                        square.add(grid[x + xOffset][y + yOffset]);
                    }
                }
                if (collectionHasRepeats(square)) return true;
            }
        }
        return false;
    }

    private static boolean collectionHasRepeats(List<Integer> collection) {
        for (int i = 1; i <= GRID_BOUNDARY; i++) {
            if (Collections.frequency(collection, i) > 1) return true;
        }
        return false;
    }

    public static boolean tilesAreNotFilled(int[][] grid) {
        for (int x = 0; x < GRID_BOUNDARY; x++) {
            for (int y = 0; y < GRID_BOUNDARY; y++) {
                if (grid[x][y] == 0) return true;
            }
        }
        return false;
    }
}