package lab_7;

import java.util.Scanner;

public class primeNumber {


    public static boolean checkPrime(int Number) {
        boolean x = true;
        for (int i = 2; i < Number; i++) {
            if (Number % i == 0)
                x = false;
        }
        if (Number == 1)
            x = false;
        return x;
    }

    public static void IsPrime() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number >= 0) {
            System.out.println("give a number? ");
            number = input.nextInt();
            if(number <= 0)
                continue;
            else if (checkPrime(number))
                System.out.println(" is Prime**\n");
            else
                System.out.println("Not Prime\n");

        }
    }

    public static void main(String[] args) {
        IsPrime();

    }
}
