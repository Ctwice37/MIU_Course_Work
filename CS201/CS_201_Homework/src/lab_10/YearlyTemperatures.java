package lab_10;

import java.util.Scanner;

public class YearlyTemperatures {
    static double hottestTempYear = 0;
    static double coldestTempYear = 0;

    static double hottestTempMonth = 0;
    static double coldestTempMonth = 0;


    static String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};
    static int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static double[] avgMonthTemp = new double[12];
    static double[] tempMonthlyDiff = new double[12];
    static double[] TempsYearly = new double[365];


    public static void main(String[] args) {
        for (int i = 0; i < TempsYearly.length; i++) {
            TempsYearly[i] = -5;
        }
        //double [] temps = AvgTempMonth(TempsYearly);
            //for(double month : avgMonthTemp)
                //System.out.println(month);

        System.out.println(tempOfDayOfMonth());


        }

        public static void hottestColdestDayYear(double[] temperatures){
            for (int i = 0; i < temperatures.length; i++) {
                if (hottestTempMonth < temperatures[i])
                    hottestTempMonth = temperatures[i];
                else if (coldestTempMonth > temperatures[i])
                    coldestTempMonth = temperatures[i];
            }
            System.out.println(hottestTempMonth);
            System.out.println(coldestTempMonth);

        }

        public static double [] AvgTempMonth(double [] temperatures){

       double average = 0;
       double sum = 0;
       int month = 0;
       int start = 0;

       while (month < 12){
           for (int i = start; i < monthLength[month] + start; i++) {
               sum += TempsYearly[i];
           }average = sum / monthLength[month];
           avgMonthTemp[month]  = average;
           sum = 0;
           average = 0;
           start += monthLength[month];
           month++;

           }return avgMonthTemp;


            }

        public static double [] monthMaxMin(double [] temperatures){
            double max = 0;
            double min = 0;
            int month = 0;
            int start = 0;
            double difference = 0;

            while (month < 12){
                for (int i = start; i < monthLength[month] + start; i++) {
                    if(temperatures[i] > max)
                        max = temperatures[i];
                    else if (temperatures[i] < min)
                        min = temperatures[i];

                }difference = max - min;
                tempMonthlyDiff[month]  = difference;
                max = 0;
                min = 0;
                start += monthLength[month];
                month++;

            }return tempMonthlyDiff;

        }

        public static double tempOfDayOfMonth() {
            double temperature = 0;
            int daysCount = 0;
            int month = 0;
            int day = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Temperature in What Month? ");

            int monthTest = input.nextInt() -1;
            if(monthTest > 0 && monthTest <=12)
                month = monthTest -1;
            System.out.println("Temperature on what day? ");
            int dayTest = input.nextInt();
            if(dayTest > 0 && dayTest <= 31 )
                day = dayTest -1;

            if (month == 0)
                temperature = TempsYearly[(day + 1)];
            else{
                for (int i = 0; i < month; i++) {
                    daysCount += monthLength[i];
                } temperature = TempsYearly[(daysCount + day + 1)];}
            return temperature;

        }


            }


