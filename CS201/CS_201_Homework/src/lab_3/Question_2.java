package lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input number of centimeters to be converted: ");
        //int cm = input.nextInt();

        convert(input.nextInt());


    }
    public static void convert(int cm){
        DecimalFormat df = new DecimalFormat("#.##");

        double totalInches = cm / 2.54;
        int feet = (int)totalInches % 12;
        double remainingInches = totalInches / 12;

        System.out.println(cm + " centimeters is " + feet + " feet " + df.format(remainingInches) + " inches");
        
    }
}