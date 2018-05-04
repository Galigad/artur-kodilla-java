package com.kodilla.sudoku;

public class SudokuSolver {

    public int[][] fillSudoku(int[][] board) {
        return board;
    }

    public int[][] fillSingleField(int[][] board, String userInput) {
        String[] splited = userInput.split("\\s+");
        int xPosition = Integer.parseInt(splited[0]) - 1;
        int yPosition = Integer.parseInt(splited[1]) - 1;
        int fillField = Integer.parseInt(splited[2]);

        board[xPosition][yPosition] = fillField;
        return board;
    }
    public boolean isMoveLegal(int[][] board, int xPostion, int yPostion, int value) {
        for(int i=0; i<9; i++) {
            if(board[xPostion][i]==value) {
                return false;
            }
            if(board[i][yPostion]==value) {
                return false;
            }
            if(xPostion % 3 == 0) {
                //board[xPostion][yPostion];
                //board[xPostion + 1][yPostion];
                //board[xPostion + 2][yPostion];
            }
        }
        return true;
    }

}
