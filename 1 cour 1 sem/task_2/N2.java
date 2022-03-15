package task_2;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        int maxDigitOnTheCount = 0;
        while (in.hasNextInt()){
            int digits = in.nextInt();
            if (digits == max){
                maxCount += 1;

            }
            if (digits > max){
                max = digits;
                maxCount = 0;

            }
            System.out.println(maxCount+1);
        }
        //System.out.println(maxCount+1);
    }
}
