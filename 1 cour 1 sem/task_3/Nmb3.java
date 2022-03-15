package task_3;

import java.util.Scanner;

public class Nmb3 {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MAX_VALUE;
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        boolean secFlag = false;
        while (in.hasNextInt()) {
            int s = in.nextInt();
            if (s > max) {

                if (secMax == Integer.MAX_VALUE){
                    System.out.println("No");
                    secMax = max;
                    max = s;
                    //continue;
                }

                secMax = max;
                max = s;


            }
            System.out.println(secMax);


        }
    }
}