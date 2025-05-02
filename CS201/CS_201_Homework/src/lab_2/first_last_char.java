//question 2


package lab_2;

import java.util.Scanner;

public class first_last_char {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a String: ");

        String str = input.nextLine();

        System.out.println(str.length());
        System.out.println(str.charAt(0) + "\n" + str.charAt(str.length()-1));

    }
}
