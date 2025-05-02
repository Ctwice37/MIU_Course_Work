package lab_8_9;

public class lambMary {

    public static void vowelCount(String s){
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int z = 0; z < s.length(); z++){
            if(s.charAt(z) == 'a')
                a++;
            else if(s.charAt(z) == 'e')
                e++;
            else if(s.charAt(z) == 'i')
                i++;
            else if(s.charAt(z) == 'o')
                o++;
            else if(s.charAt(z) == 'u')
                u++;
            else
                continue;

        }
        System.out.println("Vowel counts for hte sentence:");
        System.out.println("\t" + s);
        System.out.println("# of 'a' : " + a +
                            "\n# of 'e' : " + e +
                            "\n# of 'i' : " + i +
                            "\n# of 'o' : " + o +
                            "\n# of 'u' : " + u);

    }

    public static void main(String[] args) {
        vowelCount("Mary had a little lamb");
    }
}
