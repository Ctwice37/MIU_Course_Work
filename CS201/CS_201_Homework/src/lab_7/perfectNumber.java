package lab_7;

import java.util.ArrayList;
import java.util.List;

public class perfectNumber {

    public static void PerfectNumbers(int lowerBound, int upperBound) {
        List<Integer> nums = new ArrayList<Integer>();
        String properDivisors = "";
        int sum = 0;
        int perfect = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
           properDivisors = "";
           sum = 0;
            for (int j = i - 1; j >= 1; j--) {
                if (i % j == 0) {
                    sum += j;
                    properDivisors += Integer.toString(j);
                    properDivisors += " ";
                    nums.add(i);
                }


                if (i == sum && j == 1) {
                    System.out.println(i + " is perfect.");
                    perfect++;
                    String temp = "";
                    System.out.print("Proper Divisors:\n" + i + " = ");
                    for (int z = 0; z < properDivisors.length(); z++) {
                        if (properDivisors.charAt(z) != ' ')
                            System.out.print(properDivisors.charAt(z));
                        else
                            System.out.print(" + ");

                        temp = "";


                    }System.out.println("\n\n");


                }else continue;
            }

        }
        System.out.println("There were a total of " + perfect + " perfect number(s)\n" +
                "is the range" + " [" + lowerBound +", "+ upperBound + "]");

    }
        public static void main(String[] args){
            PerfectNumbers(1,1000);

        }
    }

