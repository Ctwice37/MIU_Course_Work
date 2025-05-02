package lab_10;

import java.util.*;

public class fortuneTeller {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);

        ArrayList<String> ll = new ArrayList<>();
        ll.add("You will get 4.0 GPA this semester");
        ll.add("Happiness is Programming");
        ll.add("Satisfaction follows hard work.");
        ll.add("Patience is a virtue");

        System.out.println("Fortune (y/N)?");
        while (input.next().equals("y")) {
            int fortune = random.nextInt(4);
            System.out.println(ll.get(fortune));
        }


        }

    }
