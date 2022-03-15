package task_1;

import java.util.Objects;
import java.util.Scanner;

public class Nmb2 {
    public static void main(String[] args){
        carWay();

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
}
