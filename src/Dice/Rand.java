package Dice;

import java.util.Random;
import java.util.Scanner;

public class Rand {

    void Guess() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;

        System.out.println("Enter number 1 to 10: ");
        number = sc.nextInt();

        choice = random.nextInt(10);

        if (choice == number) {
            System.out.println("You've guessed right!");
        } else {
            System.out.println("Sorry, Wrong guess, try again");
        }

    }


    public static void main(String[] args) {
        Rand guess = new Rand();
        guess.Guess();
    }
}