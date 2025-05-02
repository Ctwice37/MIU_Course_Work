package lab_5;

import javax.swing.*;
import java.util.Scanner;

public class names_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("10 to which power? ");
        int power = input.nextInt();

        if(power == 6)
            System.out.println("10 to the power of " + power +
                    " is a Million");

        else if (power == 9)
            System.out.println("10 to the power of " + power +
                    " is a Billion");

        else if (power == 12)
            System.out.println("10 to the power of " + power +
                    " is a Trillion");

        else if (power == 15)
            System.out.println("10 to the power of " + power +
                    " is a Quadrillion");

        else if (power == 18)
            System.out.println("10 to the power of " + power +
                    " is a Quintillion");

        else if (power == 21)
            System.out.println("10 to the power of " + power +
                    " is a Sextillion");

        else if(power == 30)
            System.out.println("10 to the power of " + power +
                    " is a Nonillion");

        else if(power == 100)
            System.out.println("10 to the power of " + power +
                    " is a Googol");
        else
            System.out.println("Program is not sophisticated enough to process your input... ");




    }
}
