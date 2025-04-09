
//Calculator by, Arvan Kadkol

package S03Calc;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    /**
     * The calculate function takes user input for two numbers and an operation choice, then performs
     * the selected operation and displays the result.
     */
    public static void calculate(){
        double num1;
        double num2;
        double result = 0;
        int operation;

        System.out.println("Choose a task. Press 1 to add, 2 to subtract, 3 to multiply, and 4 to divide");

        operation = scanner.nextInt();

        System.out.println("Please enter the first number");

        num1 = scanner.nextDouble();

        System.out.println("Please enter the second number");

        num2 = scanner.nextDouble();

        if (operation == 1){
            result = num1 + num2;
        } else if (operation == 2){
            result = num1 - num2;
        } else if (operation == 3) {
            result = num1 * num2;
        } else if (operation == 4){
            result = num1 / num2;
        }

        System.out.println("The answer is...");
        System.out.println(result);



    }



    
    public static void main(String[] args) {

        boolean done = false;

        while (!done) {
            calculate();
            System.out.println("Would you like to continue? Press 1 to continue, Press 2 to exit");
            done = scanner.nextInt() == 2;
        }

        System.out.println("Goodbye!");

        scanner.close();


    }


}
