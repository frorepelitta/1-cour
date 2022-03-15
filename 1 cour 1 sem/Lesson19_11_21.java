import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lesson19_11_21 {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("temp1.txt");
        FileWriter fw = new FileWriter("temp2.txt");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] a = str.split(":");

            for (int i = 126; i > a.length; i--){


            }

            }
        }
    }