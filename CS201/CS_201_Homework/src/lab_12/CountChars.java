package lab_12;

public class CountChars {
    public static void main(String[] args) {

        System.out.println(CharacterCount("four", 0));

    }
    public static int CharacterCount(String s, int index){
        if (s.length() == index)
            return 0;
        else
            return 1 + CharacterCount(s, index + 1);



    }
}
