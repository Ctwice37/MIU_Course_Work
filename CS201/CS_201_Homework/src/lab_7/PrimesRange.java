package lab_7;


public class PrimesRange {

    public static boolean checkPrime(int Number) {
        boolean x = true;
        for (int i = 2; i < Number; i++) {
            if (Number % i == 0)
                x = false;
        }
        if (Number == 1)
            x = false;
        return x;
    }

    public static int PrimeRange(int upperBound){
        int count = 0;
        for (int i = 2; i <= upperBound; i++){
            if(checkPrime(i))
                count++;

        }return count;

    }

    public static void main(String[] args) {
        System.out.println(PrimeRange(10000));
    }

}
