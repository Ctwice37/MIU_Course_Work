package lab_10;

import java.util.ArrayList;

public class DNAcodon {
    public static void main(String[] args) {

        String DNA_sequence = "ATGGCTACGATCTAGTAGCT";

    ArrayList<String> nucleotides = extractCodon(DNA_sequence);

    for(String s: nucleotides){
        System.out.println(s);
    }


    }


    public static ArrayList<String> extractCodon(String sequence){
        ArrayList<String> condons = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sequence.length(); i++) {
            sb.append(sequence.charAt(i));
            if((i+1) % 3 == 0){
                condons.add(sb.toString());
                sb.setLength(0);
            }


        }return condons;
    }
}
