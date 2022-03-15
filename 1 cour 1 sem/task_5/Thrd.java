package task_5;

import java.util.Scanner;

public class Thrd {

    static void method(){
        System.out.println("Введите строку: ");
        Scanner a= new Scanner(System.in);
        String listFirst = a.nextLine();
        System.out.println("Введите строку 2: ");
        Scanner d = new Scanner(System.in);
        String listSec = d.nextLine();
        System.out.println("Введите n: ");
        Scanner nInp = new Scanner(System.in);
        int n = nInp.nextInt();
        if(listFirst.substring(0, n).equals(listSec.substring(0, n))){
            System.out.println("Truee");
        }
        else{
            System.out.println("Falsee");
        }

    }



    public static void main(String[] args) {
        method();
    }
}