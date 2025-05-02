package lab_3;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        


        Scanner input = new Scanner(System.in);
        System.out.println("Give celsius temperature: ");

        convertCtoF(input.nextInt());
    }
    public static void convertCtoF(int temp){
        double f = 1.8 * temp + 32;
        System.out.println(temp + " Celsius is " + f + " Fahrenheit");

    }
}
