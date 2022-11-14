package item1;

import java.util.Scanner;

public class NumToWordGeneratorTester {

    public static void main(String[] args) {
        NumToWordGenerator numConverter = new NumToWordGenerator();
        
        try {
            Scanner scanner = new Scanner(System.in);
            String choice = "y";
            while(choice.equalsIgnoreCase("y")) {
                System.out.print("Please Enter Number: ");
                int numberInput = scanner.nextInt();
                numConverter.convertToWords(numberInput);
                System.out.println("Convert other numbers? [y / n]");
                choice = scanner.next();
                System.out.println("*-------------------------------------*");
            }
            System.out.println("App Closed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
