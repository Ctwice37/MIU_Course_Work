package lab_10;

public interface StandardDeviation {
    public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Standard_Deviation(arr));
    }


    public static int Average(int[] real) {
        int sum = 0;
        double average = 0.0;
        int length = real.length;
        for (int i = 0; i < real.length; i++) {
            sum += real[i];
        }
        return sum / length;
    }

    public static double Standard_Deviation(int[] real) {
        int avg = Average(real);
        int sum = 0;
        for (int i = 0; i < real.length; i++) {
            sum += Math.pow(real[i] - avg, 2);



        }double standardDeviation = Math.sqrt(sum / real.length);
        return standardDeviation;

    }
}

