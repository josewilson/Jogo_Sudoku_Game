package com.sudoku;

import com.sudoku.logic.GameLogic; // <-- ESTA LINHA ESTAVA FALTANDO
import com.sudoku.ui.IUserInterfaceContract;
import com.sudoku.ui.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException {
        uiImpl = new UserInterfaceImpl(primaryStage);
        // Agora esta linha funcionará, pois o import foi adicionado
        uiImpl.updateBoard(GameLogic.getNewGame());
    }

    public static void main(String[] args) {
        launch(args);
    }
}