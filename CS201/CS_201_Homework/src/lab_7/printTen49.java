package lab_7;

public class printTen49 {

    public static void printTable() {
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 0; j <= 9; j++){
                System.out.print(i + "" + j + " ");
            }

        }
    }

    public static void main(String[] args) {
        printTen49.printTable();
    }
}