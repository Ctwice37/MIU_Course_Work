package lab_5.LoFatBurger;

import java.text.DecimalFormat;

public class Income {
    final double HOURLY_PAY = 7.50;
    private double hours;
    private double commission;



    //constructor
    public Income(double hours, double commission) {
        this.hours = hours;
        this.commission = commission;
    }


    //Methods
    public double salary(double hours) {
        if (hours <= 40) {
            return this.hours * HOURLY_PAY;
        } else {
            return 40 * HOURLY_PAY + ((hours - 40) * HOURLY_PAY * 1.5);
        }
    }
    public double commissionCalc(double commission){
        if (commission >= 1.00 && commission <= 99.99)
            return this.commission * 0.05;
        else if (commission >= 100.00 && commission <= 299.99)
            return this.commission * 0.1;
        else if (commission >= 300.00)
            return this.commission * 0.15;
        else
            return this.commission * 0.0;
    }





    public void displayPay(){

        DecimalFormat df1 = new DecimalFormat("#.##");


        double pay = salary(this.hours) + commissionCalc(this.commission);
        System.out.println("Your pay this week was: \n\n$ " + df1.format(pay));
    }







    //Getters+Setters
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }


}
