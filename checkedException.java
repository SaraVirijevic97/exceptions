package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {

            public static void main(String[] args) {
                try {
                    FileReader file = new FileReader("sara_virijevic.txt");

                } catch (FileNotFoundException e) {
                  
                    System.out.println("Not existing file");
                }
            }
    }
