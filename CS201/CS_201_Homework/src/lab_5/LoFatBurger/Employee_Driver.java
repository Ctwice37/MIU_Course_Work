package lab_5.LoFatBurger;

import java.util.Scanner;

public class Employee_Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("How Many Hours did you work this week? ");
        double hours = input.nextDouble();
        System.out.println("How much money in Sales did you accumulate? ");
        double commission = input.nextDouble();



        Employee emp1 = new Employee(name, new Income(hours, commission));

        emp1.getPaycheck().displayPay();


    }


}
