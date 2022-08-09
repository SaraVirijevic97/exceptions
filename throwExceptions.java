package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwExceptions {

    public static void main(String[] args) {

        try {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the number of age");
            int n = keyboard.nextInt();
            System.out.println(n);

            if (n >= 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("You are not an adult, you are under 18 years old.");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Error. Enter the number!");
        }
        catch (ArithmeticException e) {
        System.out.println("You are adult, you have more than 18 years.");
        }
        catch (Exception e)
        {
            System.out.println("This is an exception!");
        }

    }
}
