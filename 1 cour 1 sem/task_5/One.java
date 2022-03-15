package task_5;

import java.lang.reflect.Parameter;
import java.sql.Array;
import java.util.Scanner;

public class One {
    public static void main(String[] args){
        method();

    }

    static void method() {
        Scanner in = new Scanner(System.in);

        System.out.println("Количество элементов массива - ");
        int size = in.nextInt()+1;
        String arr[] = new String[size];
        System.out.println("Элементы массива - ");
        boolean flag = false;
        for (int i = 0; i<size; i++){
            arr[i] = in.nextLine();
        }
        System.out.println("Символ, что нужно найти - ");
        String symbol = in.nextLine();
        for (int i = 0; i<size; i++){
            if (arr[i].equals(symbol)){
                System.out.println("Номер символа - "+ i);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(-1);
        }


    }

}

