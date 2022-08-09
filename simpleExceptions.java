package exceptions;

import java.util.Scanner;

public class simpleExceptions {

    public static void main(String[] args) {

        try {
            String[] number = {"one", "two", "three", "four", "five"};
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the index");
            int n = keyboard.nextInt();
            System.out.println(number[n]);
        }
        catch (NullPointerException e){
            System.out.println("This array is null!");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bounds!");
        }
        catch (Exception e) {
            System.out.println("This is an exception.");
        }

    }
}
