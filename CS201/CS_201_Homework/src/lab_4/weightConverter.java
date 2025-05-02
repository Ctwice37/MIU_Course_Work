package lab_4;

public class weightConverter {

    //instance variable
    private double relativeGravity;

    //constructor
    public weightConverter(double relativeGravity){
        this.relativeGravity = relativeGravity;
    }

    //convert method
    public void convert(int bodyWeight){
        System.out.println("Your Weight: " + this.relativeGravity * bodyWeight);

    }

    //main class
    //creates two objects
    //calls convert() method on each object
    public class gravityMain {
        public static void main(String[] args) {

            weightConverter moonWeight = new weightConverter(0.167);
            weightConverter marsWeight = new weightConverter((0.38));

            moonWeight.convert(175);
            marsWeight.convert(175);

        }

    }
}
