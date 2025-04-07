
//Arvan Kadkol

package S02IO;

import java.util.Scanner;

public class Hello2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("\n\nHello, " + name + "!");
        System.out.print("\n\nEnter You Age: ");
        int age = scanner.nextInt();
        System.out.print("\nYou are: " + age + " years old this year!\n");

        scanner.close();
    }

}
