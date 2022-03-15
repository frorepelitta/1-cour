package task_6;

import java.util.Date;
import java.util.Calendar;
import java.io.FileReader;
import java.util.Scanner;

public class ShapaShashaSecond {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("temp.txt");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine()) {
            String str = in.nextLine().strip().replaceAll("[ ]+", " ");
            String[] a = str.split(":");
            if (str.isEmpty()){
                continue;
            }

            for (int i = 0; i < a.length; i++){

                if(a[i].isEmpty() || a.length <= 2){
                    System.out.println(String.join(" ", a).strip());
                }
            }

        }



    }
}