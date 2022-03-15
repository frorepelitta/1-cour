package task_3;

import java.util.Scanner;

public class Nmb1 {


    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        int count = 0;
        int zeroCounter = 0;

        while (in.hasNextInt()) {
            int number = in.nextInt();

            if (number == 0 && flag) {
                zeroCounter = count + 1;

                flag = false;
            }
            else {
                count+=1;

            }
            System.out.println(zeroCounter);
            //System.out.println(count);
        }
        if (flag){
            System.out.println(0);
        }
        else {
            System.out.println(zeroCounter);
        }


    }
}