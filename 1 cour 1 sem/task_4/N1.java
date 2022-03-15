package task_4;

import java.util.Scanner;

public class N1 {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length;) {
            array[i] = ((int)(Math.random() * 20) + 10);
            System.out.print(array[i] + " ");
            i++;

        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }




    }
}