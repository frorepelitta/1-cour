package task_8;


import java.awt.geom.NoninvertibleTransformException;
import java.util.Scanner;

public class F1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        NodDigits(x, y);
    }

    public static void NodDigits(int first, int second){
        int max;
        int nodMax = 0;
        max = Math.max(first, second);

        for(int i = 1; i<max; i++){
            if(first%i == 0 & second%i == 0){
                nodMax = i;
            }
        }
        System.out.println(nodMax);
    }


}