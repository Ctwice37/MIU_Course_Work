package lab_8_9;
import java.lang.Character;
public class UpperCase {

    public static void isUpperCase(String str) {
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                upperCount++;


        }
        System.out.println("Number of capitals in sentence, \"" + str + "\"" + "\n--> " +upperCount);

    }

    public static void main(String[] args) {
        isUpperCase("There Are Capitals");
    }

}
