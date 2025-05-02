package lab_12;

public class reverseString {
    public static void main(String[] args) {

        reverseString("Hello", "", 0);
    }


    public static void reverseString(String s, String empty, int index) {
        if (s.length() == index)
            return;
        else{
            reverseString(s, empty, index + 1);
            empty += Character.toString(s.charAt(index));
            System.out.print(empty);
        }
    }
}