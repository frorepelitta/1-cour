package task_4;

public class N3 {

    public static void main(String[] args) {

        int[] array = new int[10];
        int mod = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) - 500);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int a = 0; a < array.length; a++) {
            mod = Math.abs(array[a]);
            System.out.print(mod + " ");
        }



    }
}