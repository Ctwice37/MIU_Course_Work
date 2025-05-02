//question 1

package lab_2;
import java.util.Scanner;

public class name_initial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input your First, Middle, and Last Name: ");
        
        String first = input.next();
        String middle = input.next();
        String last = input.next();

        System.out.println(first + " " + middle.charAt(0) + "." + " " + last);


    }
}
