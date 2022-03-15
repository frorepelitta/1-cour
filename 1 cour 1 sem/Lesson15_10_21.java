import java.util.Scanner;
import java.lang.Math;

public class Lesson15_10_21 {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args){
        /*int[] x = new int[3];
        System.out.println(x[2]);

        String[] a;
        int[] a1 = new int[]{3, 2, 5};

        a1[2] = 1000;

        int[] a2 = a1;

        int[] a3 = a1.clone();

        for (int i = 0; i < a3.length; i++){
            System.out.println(a3[i]);
        }
        int count = in.nextInt();
        double[] m = new double[count];
        for (int i = 0; i < m.length; i++){
            System.out.println("Введите число в массив");
            m[i] = in.nextInt();

        }
        for (int i = 0; i < m.length; i++){
            System.out.println(m[i]);

        }*/
        /*if ( (3 - j) < i ){
            a[i][j] = 0;
        }*/

        double[][] a = new double[4][4];

        System.out.println(a.length);
        System.out.println(a[0].length);
        double sum = 0;
        double count = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = (int) (2+Math.random()*4);
                if (a[i][j] % 2 == 0){
                    sum += a[i][j];
                    count++;

                }

                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println(sum / count);

    }
}
