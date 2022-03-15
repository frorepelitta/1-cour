package task_5;

import java.util.Scanner;

public class Ftrh {

    static void method(){
        System.out.println("Введите строку: ");
        Scanner a= new Scanner(System.in);
        String listFirst = a.nextLine();
        System.out.println("Введите строку 2: ");
        Scanner d = new Scanner(System.in);
        String listSec = d.nextLine();
        int flag = listFirst.compareTo(listSec);
        if(flag>0){
            System.out.println("1");
        }
        if(flag<0){
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }
    }



    public static void main(String[] args) {
        method();

    }
}