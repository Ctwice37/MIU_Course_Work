package lab_8_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DNA_complement {


    public static void DNAcomplement() {
        Scanner input = new Scanner(System.in);

        char a = 'A';
        char c = 'C';
        char g = 'G';
        char t = 'T';

        String sequence = "";

        do {
           // String sequence = "";
            System.out.println("Give DNA sequence: ");
            sequence = input.nextLine();
            sequence = sequence.toUpperCase();

            StringBuffer complement = new StringBuffer(sequence);

            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == 'A')
                    complement.setCharAt(i, t);
                else if (sequence.charAt(i) == 'T')
                    complement.setCharAt(i, a);
                else if (sequence.charAt(i) == 'G')
                    complement.setCharAt(i, c);
                else
                    complement.setCharAt(i, g);
            }
            if (!sequence.equals(""))
                System.out.println("complement: " + complement + "\n");




        }while (!sequence.equals(""));
    }




    public static void main(String[] args) {

        DNAcomplement();
    }
}