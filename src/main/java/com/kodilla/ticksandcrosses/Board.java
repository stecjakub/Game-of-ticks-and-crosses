package com.kodilla.ticksandcrosses;

import java.util.Scanner;

public class Board {
    private static final char MARK_X = 'X';
    private static final char MARK_O = 'O';
    private static char player = MARK_X;

    public static char getPlayer() {
        return player;
    }

    public static void cleanUpBoard(char[][]basicBoard){
        for(int i =0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard[i].length; j++) {
                basicBoard[i][j] = ' ';
            }
        }
    }
    public static void printBoard(char[][] basicBoard){
        for(int i =0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard[i].length; j++) {
                System.out.print(basicBoard[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public static void printMarks(char[][] basicBoard) {

        System.out.println("Wprowadź ruch dla wiersza:");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Wprowadź ruch dla kolumny:");
        int column = new Scanner(System.in).nextInt();
        makeMove(basicBoard, row, column);
        //printBoard(basicBoard);
    }
    public static void makeMove(char[][] basicBoard, int row, int column) {
        if (!(basicBoard[row][column] == ' ')) {
            System.out.println("Wrong move, try again!");
        } else {
            basicBoard[row][column] = player;
            selectPlayer();
        }
    }
    private static void selectPlayer() {
        if (player == MARK_X) {
            player = MARK_O;
        } else {
            player = MARK_X;
        }
    }
}
