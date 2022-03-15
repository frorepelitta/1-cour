package task_5;

import java.util.Scanner;

public class Fifth {

    static void method(){
        System.out.println("Введите строку: ");
        Scanner a= new Scanner(System.in);
        String listFirst = a.nextLine();
        System.out.println("Введите строку 2: ");
        Scanner d = new Scanner(System.in);
        String listSec = d.nextLine();
        System.out.println(listFirst+listSec);
    }
    public static void main(String[] args) {
        method();




    }
}