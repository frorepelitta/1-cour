package task_3;

import java.util.Scanner;

public class Nmb4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int intBefore = Integer.MIN_VALUE;
        int counter = 0;
        int secCounter = 0;
        int maxCounter = 1;

        while (in.hasNextInt()) {
            int s = in.nextInt();

            if (s == intBefore || s == intBefore + 1){
                counter +=1;
                secCounter = counter;
            }
            if (s == intBefore -1){
                counter +=1;
                secCounter = counter;
            }
            else {counter = 1;}
            if (secCounter > maxCounter){maxCounter = secCounter;}

            System.out.println(maxCounter);
            intBefore = s;
        }
        //System.out.println(maxCounter);


    }
}