package task_3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Nmb8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int mid = Integer.MIN_VALUE;
        int left = Integer.MIN_VALUE;
        int counter = 0;
        int right = Integer.MIN_VALUE;

        while (in.hasNextInt()){

            left = mid;
            mid = right;
            right = in.nextInt();

            if (mid > right && mid > left){
                counter += 1;
            }
            System.out.println(counter);
        }


        System.out.println(counter);
    }


}
