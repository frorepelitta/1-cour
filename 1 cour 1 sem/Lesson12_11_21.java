import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lesson12_11_21 {

    public static void main(String[] args) throws Exception {
        /*Scanner inScanner = new Scanner(System.in);
        String str = inScanner.nextLine().strip();
        String[] arr = str.split("[ ]+");
        int maxValueArr = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() < maxValueArr){
                maxValueArr = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() == maxValueArr){
                count++;
                System.out.println(arr[i]);
            }
            }
        System.out.println(count);*/

        /*Открытие файла на запись( потока вывода )
        FileWriter fw = new FileWriter("temp.txt",true);
        fw.write("aboba bb\n");
        fw.close();*/
        /*FileReader fr = new FileReader("src\\Lesson12_11_21.java");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine() == true) {
            String str = in.nextLine();
            System.out.println(str);
        }

        fr.close();*/

        /*Вывод каждого символа файла.
        FileReader fr = new FileReader("temp.txt");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine()) {
            String str = in.nextLine().strip().replaceAll("[ ]+", " ");
            String[] a = str.split(" ");
            for (int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }

        }*/
        //Посчитать сколько раз в слове встречется слово
        FileReader fr = new FileReader("temp.txt");
        Scanner in = new Scanner(fr);

        while (in.hasNextLine()) {
            String str = in.nextLine().strip().replaceAll("[ ]+", " ");
            String[] a = str.split(" ");
            for (int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }

        }


    }
}

