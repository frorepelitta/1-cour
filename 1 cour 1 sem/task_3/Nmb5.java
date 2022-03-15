package task_3;

import java.util.Scanner;

public class Nmb5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 1;
        int maxCounter = 0;
        int intBefore = 2;

        while (in.hasNextInt()){
            int digit = in.nextInt();

            if (digit == intBefore){
                counter += 1;
            }
            else{
                counter = 1;
                if (intBefore == 0) {maxCounter += 1;}
            }
            System.out.println(maxCounter+1);
            intBefore = digit;

        }
        //System.out.println(maxCounter+1);



    }
}
