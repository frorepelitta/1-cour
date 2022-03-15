package task_3;

import java.util.Scanner;

public class Nmb6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int maxCounter = 0;
        int x1 = Integer.MIN_VALUE;
        int x2 = Integer.MIN_VALUE;
        int x3 = Integer.MIN_VALUE;
        int x4 = Integer.MIN_VALUE;
        int x5 = Integer.MIN_VALUE;
        int x6 = Integer.MIN_VALUE;


        while (in.hasNextInt()) {
            int digit = in.nextInt();
            x1 = x2;
            x2 = x3;
            x3 = x4;
            x4 = x5;
            x5 = x6;
            x6 = digit;
            if (x1==1&x2==2&x3==3&x4==4&x5==5&x6==6){
                counter += 1;
                System.out.println(counter);
            }




        }




        /*Scanner in = new Scanner(System.in);
        String targat = "1 2 3 4 5 6";
        int counter = 0;
        String digit = in.nextLine();
        System.out.println((digit).split(targat).length - 1);*/
    }

}