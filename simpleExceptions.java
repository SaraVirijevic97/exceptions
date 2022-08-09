package exceptions;

public class simpleExceptions {

    public static void main(String[] args) {
        
        try {
            String[] number = {"one", "two", "three", "four", "five"};
            System.out.println(number[7]);
        }
        catch (NullPointerException e){
            System.out.println("This array is null!");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Indes is out of bounds!");
        }
        catch (Exception e) {
            System.out.println("This is an exception.");
        }
        
    }
}
