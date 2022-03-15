package task_6;

import java.util.Date;
import java.util.Calendar;
import java.io.FileReader;
import java.util.Scanner;

public class ShapaSha {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("temp.txt");
        Scanner in = new Scanner(fr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        int count20More = 0;
        while (in.hasNext()) {
            String str = in.nextLine().strip().replaceAll("[ ]+", " ");
            if (str.isEmpty()){
                continue;
            }
            str = str.trim();
            String[] a = str.split(":");
            if(a[1].isEmpty()){
                assert true;
            }
            else{
            int intA = Integer.parseInt(a[1]);
                if ((year - intA) > 20) {
                    count20More++;
                }
            }
        }
        System.out.println(count20More);
        fr.close();
    }
}
