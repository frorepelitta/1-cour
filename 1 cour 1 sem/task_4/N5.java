package task_4;

public class N5 {

    public static void main(String[] args) {

        double[][] array = new double[10][10];
        double min = Integer.MIN_VALUE;
        double min1 = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++) {
                array[i][a] = ((int) (Math.random() * 100) + 50 );
            }
        }
        for (int i = 0; i < array.length; i++) {
            min = Integer.MIN_VALUE;
            for (int a = 0; a < array.length; a++) {min = Math.min(min, array[i][a]);}
            System.out.print(min + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            min1 = Integer.MIN_VALUE;
            for (int a = 0; a < array.length; a++) {min1 = Math.min(min1, array[a][i]);}
            System.out.print(min1 + " ");
        }
    }
}