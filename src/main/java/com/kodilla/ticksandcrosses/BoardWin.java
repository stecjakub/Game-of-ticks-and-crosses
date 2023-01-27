package com.kodilla.ticksandcrosses;

public class BoardWin{
    private static boolean winOrLoseRows(char[][] basicBoard, char player) {
        for (int row = 0; row < basicBoard.length; row++) {
            boolean win = true;
            for (int column = 0; column < basicBoard.length; column++) {
                if (basicBoard[row][column] != player) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Player: " + "'"+ player + "'" + " WON! Congratulation");
                return true;
            }
        }
        return false;
    }

    private static boolean winOrLoseColumns(char[][] basicBoard,char player) {
        for (int column = 0; column < basicBoard.length; column++) {
            boolean win = true;
            for (int row = 0; row < basicBoard.length; row++) {
                if (basicBoard[row][column] != player) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Player: " + "'"+ player + "'" + " WON! Congratulation");
                return true;
            }
        }
        return false;
    }

    private static boolean winOrLose1(char[][] basicBoard, char player) {
        for (int i = 0; i < basicBoard.length; i++) {
            if (basicBoard[i][i] != player) {
                return false;
            }
        }
        System.out.println("Player: " + "'"+ player + "'" + " WON! Congratulation");
        return true;
    }
    private static boolean winOrLose2(char[][] basicBoard, char player){
        for(int i = 0; i < basicBoard.length; i++){
            if(basicBoard[i][basicBoard.length - i - 1] != player){
                return false;
            }
        }
        System.out.println("Player: " + "'"+ player + "'" + " WON! Congratulation");
        return true;
    }

    public static boolean checkWin(char[][] basicBoard, char player) {
        return winOrLose1(basicBoard, player) ||
                winOrLose2(basicBoard, player) ||
                winOrLoseRows(basicBoard, player) ||
                winOrLoseColumns(basicBoard, player);
    }
}
