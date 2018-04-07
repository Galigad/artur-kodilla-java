package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args) {

        ConsoleManager consoleManager = new ConsoleManager();
        SudokuSolver sudokuSolver = new SudokuSolver();
        int[][] board = new int[10][10];
        boolean solved = false;
        while (!solved) {
            consoleManager.printBoard(board);
            String userInput = consoleManager.readUserInput();
            if (userInput.equals("SUDOKU")) {
                board = sudokuSolver.fillSudoku(board);
                solved = true;
            } else {
                board = sudokuSolver.fillSingleField(board, userInput);
            }
        }
    }




}
