package lab_3;


import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What year were you born?");
        age(input.nextInt());

    }

    public static void age(int birthYear) {
        int age = 2021 - birthYear;
        System.out.println("You were born in " + birthYear +
                " and will be (are) " + age +
                " this year.");


    }
}