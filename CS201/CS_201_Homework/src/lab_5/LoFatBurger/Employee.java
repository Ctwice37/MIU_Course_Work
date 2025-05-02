package lab_5.LoFatBurger;

public class Employee {

        private String name;
        private Income paycheck;

        public Employee(String name, Income paycheck) {
            this.name = name;
            this.paycheck = paycheck;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Income getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(Income paycheck) {
        this.paycheck = paycheck;
    }

}

