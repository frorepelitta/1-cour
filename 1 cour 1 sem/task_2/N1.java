package task_2;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sumEven = 0;
        int countEven = 0 ;
        double average = 0;
        while (in.hasNextInt()){
            double digit = in.nextInt();
            if (digit%2 == 0){
                sumEven += digit;
                countEven += 1;
                average = sumEven / countEven;
                System.out.println(average);
            }
            else {
                System.out.println(average);
            }
        }
        //average = sumEven / countEven;
        //System.out.println(average);
    }
}
