
import java.util.Scanner;
import java.lang.Math;

public class Lesson23_10_21 {

    public static void main(String[] args){


    Scanner input = new Scanner(System.in);// 1 Задание
    System.out.println("Размер массива : ");
    int size = input.nextInt();
    int array[] = new int[size];
    System.out.println("Элементы массива( Через пробел ) : ");

    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();
    }
    System.out.print ("Полученный масив : ");
    for (int i = array.length - 1; i >= 0; i--) {
        System.out.print (" " + array[i]);
    }
    System.out.println(); // Конец 1 задания

        System.out.println("Количество строк матрицы : ");
        int line = input.nextInt();
        System.out.println("Количество столбцов матрицы : ");
        int column = input.nextInt();
        int[][] array2 = new int[line][column];

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[0].length; j++){
                array2[i][j] = ((int)(Math.random() * 21) - 12);
            }
        }
        System.out.println("Какой элемент выводим?(строка) : ");
        int element = input.nextInt();
        System.out.println("Какой элемент выводим?(столбец) : ");
        int element0 = input.nextInt();
        System.out.println(array2[element][element0]);



}

}