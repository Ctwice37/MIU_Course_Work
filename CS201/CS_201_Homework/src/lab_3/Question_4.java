package lab_3;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give weight in pounds: ");

        calcCals(input.nextInt());
    }
    public static void calcCals(int weight){
        int cals = weight * 19;
        System.out.println("Given your weight of " + weight +
                        " lbs, you need to consume " + cals +
                            " calories per day.");

    }
}
