package exceptions;

import java.util.Scanner;

public class myExceptions {

    public myExceptions(String s) {
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter how much coffee cost:");
        int coffee = keyboard.nextInt();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Enter how much money you have:");
        int money = keyboard2.nextInt();


        try {
            if (money < coffee){
                throw new NotEnoughMoneyExceptions("Sorry, you don't have enough money.");
            }
            else
                System.out.println("You have enough money for coffee.");
             }
        catch(NotEnoughMoneyExceptions e)
        {
            System.out.println(e.getMessage());
        }
    }
}
