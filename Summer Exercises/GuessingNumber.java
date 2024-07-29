import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        System.out.println("##### WELCOME TO THE GUESSING NUMBER GAME #####\n");

        System.out.println("Please enter a number [between 0-99]: ");
        int number1 = input.nextInt();

        while (number1 < 0 || number1 > 99) {

            System.out.println("Invalid Input! Please enter the number [between 0-99]: ");
            number1 = input.nextInt();
        }

        int counter = 3;

        while (counter > 0) {
            if (number1 > randomNumber) {

                if ((number1 - randomNumber) > 10) {

                    System.out.println("Your guess is too high :( \nYou have " + (counter - 1) + " rights left.");
                } else {

                    System.out.println("Your guess is high but so close \nYou have " + (counter - 1) + " rights left.");
                }
            } else if (number1 < randomNumber) {

                if ((randomNumber - number1) > 10) {

                    System.out.println("Your guess is too low :( \nYou have " + (counter - 1) + " rights left.");
                } else {

                    System.out.println("Your guess is low but so close \nYou have " + (counter - 1) + " rights left.");
                }

            } else {

                System.out.println("Your guess is right. \nCONGRATS ");
                break;
            }

            counter--;

            if (counter > 0) {

                System.out.println("Please enter another guess: ");
                number1 = input.nextInt();
            }
        }

        if (number1 != randomNumber) {

            System.out.println("\nYOU LOSE");
            System.out.println("\nThe correct answer is " + randomNumber);
        }
    }
}
