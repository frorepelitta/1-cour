package task_3;
import java.util.Scanner;

public class testng {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;

        while (true) {
            double number = in.nextDouble();
            String str = in.nextLine();
            if (number == 0) {
                System.out.println(x + 1);
                break;
            }
            if (str == null) {
                System.out.println(0);
                break;
            }
            else {
                x++;
            }


        }

    }
}