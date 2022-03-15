package task_4;

public class N4 {

    public static void main(String[] args) {

        double[][] array = new double[10][10];
        double[][] arr = new double[10][10];


        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++ ){
                array[i][a] = ((int)(Math.random() * 20) + 10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++ ){
                arr[i][a] = ((int)(Math.random() * 20) + 10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++ ){
                System.out.print(array[i][a] + arr[i][a] + " ");
            }
            System.out.println();
        }



    }
}