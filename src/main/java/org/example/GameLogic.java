package org.example;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите: 1 - камень, 2 - ножницы, 3 - бумага");
        int userChoice = scanner.nextInt();

        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        if (userChoice == computerChoice) {
            System.out.println("Ничья!");
        } else if (userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 3
                || 3 == userChoice && computerChoice == 1) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли!");
        }

        if (computerChoice == 1) {
            System.out.println("computerChoice: камень");
        } else if (computerChoice == 2) {
            System.out.println("computerChoice: ножницы");
        } else {
            System.out.println("computerChoice: бумага");
        }
    }
}


