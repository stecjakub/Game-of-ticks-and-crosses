package com.kodilla.ticksandcrosses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

@SpringBootApplication
public class TicksAndCrossesApplication {
    public static void main(String[] args) {
        System.out.println("Welcome in Ticks and Crosses game:" + "\n"
                + "Enter board size: 3, 5, 10" + "\n" +
                "Avaliable: 3x3, 5x5, 10x10 ");
        int size = new Scanner(System.in).nextInt();
        char[][] basicBoard = new char[size][size];
        System.out.println("Welcome in Ticks and Crosses game:");
        Board.cleanUpBoard(basicBoard);
        do {
            Board.printBoard(basicBoard);
            Board.printMarks(basicBoard);
        } while (!BoardWin.checkWin(basicBoard, Board.getPlayer()));
    }
}