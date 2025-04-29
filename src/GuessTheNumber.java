import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) throws IOException {
        int randnumber;
        int attempts;
        int max = 10;
        int min = 1;
        int range = max - min  + 1 ;
        int user_number;
        int diff;
        int score = 0;
        String user_continue="";
        String start="";
        boolean user_continue_option = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Welcome to Guess the Number");
        System.out.println("----------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Instructions:");
        System.out.println("This program will choose a random number, your task is to guess what number the program chose.");
        System.out.println("You have 5 attempts to guess, if you don't guess the random number , you will lose.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

       do{
           System.out.println("Press Enter Key to start");
           start = scanner.nextLine();
       }while (!start.equals(""));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        do {

            attempts = 5;
            System.out.println();
            System.out.println("Program is choosing the random number.");
            for (int i = 0; i < 5; i++) {
                System.out.printf(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            randnumber = (int) (Math.random() * range) + min;
            System.out.println();
            System.out.println("Program has chosen the number.");

            for (int i = 0; i < 5; i++) {
                System.out.printf(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
            System.out.println("Now is your turn to guess the random number.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Good luck!");


            while (attempts >= 1) {
                System.out.println("Write the number you think is the number chosed");
                user_number = scanner.nextInt();
                diff = Math.abs(randnumber - user_number);
                if (attempts == 1){
                    System.out.println("----------------------------------------");
                    System.out.println("Game over , you didn't guessed the random number :C");
                    System.out.println("The random number was: " + randnumber);
                    System.out.println("----------------------------------------");
                    break;
                }
                else if (user_number == randnumber) {
                    System.out.println("----------------------------------------");
                    System.out.println("Congrats you found the random number!!!");
                    System.out.println("The random number was: " + randnumber);
                    System.out.println("----------------------------------------");
                    break;
                } else if (diff <3) {

                    attempts--;
                    System.out.println("----------------------------------------");
                    System.out.println("You are so close ");
                    System.out.println("You have: " + attempts + " attemps");
                    System.out.println("----------------------------------------");
                } else if(diff >3) {
                    attempts--;
                    System.out.println("----------------------------------------");
                    System.out.println("You are far");
                    System.out.println("You have: " + attempts + " attemps");
                    System.out.println("----------------------------------------");
                }


            }
            System.out.println("Do you want to play again?");
            System.out.println("Yes: 'Y'      No: 'N' ");
            user_continue = scanner.next();
            System.out.println();
            switch (user_continue){
                case "Y":
                    user_continue_option = true;
                    break;
                case "N":
                    user_continue_option = false;
                    break;
            }
        }while(user_continue_option);
        System.out.println("Thanks for play c:");
        scanner.close();



    }
}
