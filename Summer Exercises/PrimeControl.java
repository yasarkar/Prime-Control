import java.util.Scanner;

public class PrimeControl {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int number1;
        int primeControl = 0;

        System.out.print("Enter a positive number: ");
        number1 = input.nextInt();

        while (number1 < 0){

            if (number1 < 0){

            System.out.print("İnvalid Input!\nPlease enter a positive number:");
            number1 = input.nextInt();
            }
        }

        for (int counter = 1; number1 >= counter; counter++){

            if (number1 % counter == 0){

                primeControl++;
            }
        }

        if (primeControl == 2 ){

            System.out.println("Number is Prime");
        }

        else if (number1 == 0 || number1 == 1){

            System.out.println("Number is NOT PRİME");
        }
        
        else {

            System.out.println("Number is NOT PRİME");
        }    
    }
    
}