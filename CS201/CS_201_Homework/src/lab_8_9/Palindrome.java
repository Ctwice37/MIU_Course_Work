package lab_8_9;



public class Palindrome {

    public static boolean ItsReversible(String s){
            s = s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }return true;
    }

    public static void main(String[] args) {

        System.out.println(ItsReversible("aSdfdsa"));
    }
}

