package task_3;

import java.util.Scanner;

public class Nmb2 {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int intBefore = Integer.MIN_VALUE;

        int counter = 0;
        int maxCounter = 0;

        while (in.hasNextInt()){
            int s = in.nextInt();
            if (s > intBefore){
                counter += 1;
                maxCounter +=1;

                intBefore = s;
            }
            else {
                intBefore = s;
                counter = 0;
            }
            System.out.println(maxCounter);
        }
        System.out.println(maxCounter);




    }


}