import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float result = 0;

        System.out.println("####### WELCOME THE CALCULATOR #######\n");

        System.out.println("Please select the action and write the number [(1+) (2-) (3*) (4/)]");
        int action = scanner.nextInt();

        while (action < 0 || action > 4) {

            System.out.println("Please enter the number between 1-4");
            action = scanner.nextInt();
        }

        System.out.println("Please enter a number:");
        float number1 = scanner.nextFloat();

        System.out.println("Please enter a number: ");
        float number2 = scanner.nextFloat();

        while (action == 4 && number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");

            System.out.println("Please enter a non-zero number for division: ");
            number2 = scanner.nextFloat();
        }

        switch (action) {

            case 1:
                result = number1 + number2;
                break;

            case 2:
                result = number1 - number2;
                break;

            case 3:
                result = number1 * number2;
                break;

            case 4:
                result = number1 / number2;
                break;
        }

        System.out.println("The result is " + result);

    }
}