package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleExceptions {

    public static void main(String[] args) {

        try {
            String[] number = {"one", "two", "three", "four", "five"};
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the index");
            int n = keyboard.nextInt();
            System.out.println(number[n]);
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e ){

            System.out.println("Exception occurs"+e);
            
        }

    }
    
}
