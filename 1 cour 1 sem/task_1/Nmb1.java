package task_1;

import java.util.Objects;
import java.util.Scanner;

public class Nmb1 {
    public static void main(String[] args) {
        thermometer(26);
        //carWay();
        //tax(60000);

    }

    public static void thermometer(int temp) {
        if (temp > 25) {
            System.out.print("жарко");
        }
        if (temp < 10) {
            System.out.print("холодно");
        }
        if ((temp >= 10) && (temp <= 25)){
            System.out.print("тепло");
        }

    }
    public static void carWay(){
        Scanner in = new Scanner(System.in);
        System.out.println("Направление: ");
        String way = in.nextLine();
        System.out.println("Длинна пути:");
        int roadLong = in.nextInt();
        System.out.println("Текущая позиция");
        int position = in.nextInt();
        if (position >99){
            position = 99;
        }
        if (position < 0){
            position = 0;
        }
        if (Objects.equals(way, "вперед")){
            position += roadLong;
        }
        if (Objects.equals(way, "назад")){
            position -= roadLong;
        }
        if (position >99){
            position = 99;
        }
        if (position < 0){
            position = 0;
        }
        System.out.println("текущая позиция: " + position);

    }
    public static void tax(double cash){
        double taxSum = 0;
        if (cash <= 35000){
            taxSum = cash * 0.15;
            System.out.println("Сумма налога - " + taxSum);
        }
        if (cash > 35000 &&  cash <= 100000){
            taxSum = cash * 0.25;
            if (cash > 50000){
                taxSum += (cash - 50000) * 0.05;
            }
            System.out.println("Сумма налога - " + taxSum);
        }
        if (cash > 100000){
            taxSum = cash * 0.35;
            System.out.println("Сумма налога" + taxSum);
        }

    }


}
