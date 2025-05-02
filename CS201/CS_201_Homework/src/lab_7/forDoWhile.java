package lab_7;

public class forDoWhile {

            //3 pairs of methods -- accumulate by 1 or 5.
            //demonstrated using for loop, while loop, do-while loop

            public static void for_loop_BY1() {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 25 == 0)//                               see output more easily
                System.out.println("\n");
            sum += i;
            if (i <= 99)
                System.out.print(i + " + ");
            else
                System.out.println(i + " = " + sum);

        }

    }
            public static void for_loop_BY5() {

            int sum1 = 0;
            for (int j = 5; j <= 50; j += 5) {
                if (j % 25 == 0)//                               see output more easily
                    System.out.println("\n");
                sum1 += j;
                if (j <= 49)
                    System.out.print(j + " + ");
                else
                    System.out.println(j + " = " + sum1);

            }
            }

            public static void doWhile_loop_BY1 () {
            int count = 1;
            int amount = 0;
            do{
                amount += count;
                System.out.println(count + " + ");
                count++;
            }while (count <= 100);
                System.out.println(" = " + amount);

            }
            public static void doWhile_loop_BY5 () {
                int count1 = 5;
                int amount1 = 0;
                do{
                    amount1 += count1;
                    System.out.println(count1 + " + ");
                    count1+=5;
                }while (count1 <= 50);
                System.out.println(" = " + amount1);
    }

            public static void while_loop_BY1 () {
                int countUp = 1;
                int accumulate = 0;
                while (countUp <= 100) {
                    accumulate += countUp;
                    System.out.println(countUp + " + ");
                    countUp++;

                }
                System.out.println(" = " + accumulate);
            }
            public static void while_loop_BY5 () {
                int countUp1 = 5;
                int accumulate1 = 0;
                while (countUp1 <= 50) {
                    accumulate1 += countUp1;
                    System.out.println(countUp1 + " + ");
                    countUp1+=5;

                }
                System.out.println(" = " + accumulate1);

    }

            public static void main (String[]args){
                forDoWhile.while_loop_BY5();
            }
        }

