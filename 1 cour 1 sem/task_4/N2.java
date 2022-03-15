package task_4;

public class N2 {



    public static void main(String[] args) {

        int[] array = new int[30];
        int max = 0;
        int min = 9999999;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 500) + 2);
            System.out.print(array[i] + " ");
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);

        }
        System.out.println();
        System.out.println(min);
        System.out.print(max);




    }
}