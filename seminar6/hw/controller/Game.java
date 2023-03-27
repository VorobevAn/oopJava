package seminar6.hw.controller;

import seminar6.hw.view.CheckForVictory;
import seminar6.hw.view.Move;
import seminar6.hw.view.PrintFiled;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public String start() {
        PrintFiled printFiled = new PrintFiled();
        Move move = new Move();
        Scanner scanner = new Scanner(System.in);
        CheckForVictory checkForVictory = new CheckForVictory();
        while (!checkForVictory.finish()) {
            System.out.println("Введите число от 1 до 9 ");
            move.miMove(scanner.nextInt());
            printFiled.printField();
            if (checkForVictory.finish()) {
                return "Вы победили";
            }
            System.out.println("Ход компьютера");
            move.move();
            printFiled.printField();
            checkForVictory.finish();

        }
        return "Победа компьютера";
    }
}

