package task_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class FirstTask {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("task7.txt");
        Scanner digits = new Scanner(fr);
        String readDigits = digits.nextLine();
        char[] a = readDigits.toCharArray();
        String[][] q = new String[readDigits.length()][7];

        FileWriter fw = new FileWriter("task7In.txt");

        String[] s1 = new String[7];
        s1[0] = "   ";
        s1[1] = " | ";
        s1[2] = " | ";
        s1[3] = "   ";
        s1[4] = " | ";
        s1[5] = " | ";
        s1[6] = "   ";

        String[] s2 = new String[7];
        s2[0] = " -- ";
        s2[1] = "   |";
        s2[2] = "   |";
        s2[3] = " __ ";
        s2[4] = "|   ";
        s2[5] = "|   ";
        s2[6] = " -- ";

        String[] s3 = new String[7];
        s3[0] = " -- ";
        s3[1] = "   |";
        s3[2] = "   |";
        s3[3] = " __ ";
        s3[4] = "   |";
        s3[5] = "   |";
        s3[6] = " -- ";

        String[] s4 = new String[7];
        s4[0] = "    ";
        s4[1] = "|  |";
        s4[2] = "|  |";
        s4[3] = " __ ";
        s4[4] = "   |";
        s4[5] = "   |";
        s4[6] = "    ";

        String[] s5 = new String[7];
        s5[0] = " -- ";
        s5[1] = "|   ";
        s5[2] = "|   ";
        s5[3] = " __ ";
        s5[4] = "   |";
        s5[5] = "   |";
        s5[6] = " -- ";

        String[] s6 = new String[7];
        s6[0] = " -- ";
        s6[1] = "|   ";
        s6[2] = "|   ";
        s6[3] = " __ ";
        s6[4] = "|  |";
        s6[5] = "|  |";
        s6[6] = " -- ";

        String[] s7 = new String[7];
        s7[0] = " -- ";
        s7[1] = "   |";
        s7[2] = "   |";
        s7[3] = " __ ";
        s7[4] = "   |";
        s7[5] = "   |";
        s7[6] = "    ";

        String[] s8 = new String[7];
        s8[0] = " -- ";
        s8[1] = "|  |";
        s8[2] = "|  |";
        s8[3] = " __ ";
        s8[4] = "|  |";
        s8[5] = "|  |";
        s8[6] = " -- ";

        String[] s9 = new String[7];
        s9[0] = " -- ";
        s9[1] = "|  |";
        s9[2] = "|  |";
        s9[3] = " __ ";
        s9[4] = "   |";
        s9[5] = "   |";
        s9[6] = " -- ";

        String[] s0 = new String[7];
        s0[0] = " -- ";
        s0[1] = "|  |";
        s0[2] = "|  |";
        s0[3] = "    ";
        s0[4] = "|  |";
        s0[5] = "|  |";
        s0[6] = " -- ";

        for(int i = 0; i < q.length; i++) {
            if(a[i] == '0'){
                q[i] = s0;
            }

            if(a[i] == '1'){
                q[i] = s1;
            }

            if(a[i] == '2'){
                q[i] = s2;
            }

            if(a[i] == '3'){
                q[i] = s3;
            }
            if(a[i] == '4'){
                q[i] = s4;
            }

            if(a[i] == '5'){
                q[i] = s5;
            }

            if(a[i] == '6'){
                q[i] = s6;
            }

            if(a[i] == '7'){
                q[i] = s7;
            }

            if(a[i] == '8'){
                q[i] = s8;
            }

            if(a[i] == '9'){
                q[i] = s9;
            }

        }

        for (int j = 0; j < 7;j++) {
            for (int i = 0;i< q.length;i++){
                fw.write(q[i][j]);
            }
            fw.write("\n");
        }

        fr.close();
        fw.close();
    }

}