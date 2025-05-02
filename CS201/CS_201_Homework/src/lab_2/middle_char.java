//question 3

package lab_2;

import java.util.Scanner;

public class middle_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a word: ");

        String word = input.next();

        if (word.length() % 2 !=0) //odd-length inputs
            System.out.println("Middle Character is: " + word.charAt(word.length()/2));
        else                        //even-length inputs
            System.out.println("Middle two Letters are: " +
                    word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
    }
}
