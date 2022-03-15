package task_2;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int streak = 0;
        int maxStreak = 0;
        int digitBefore = Integer.MIN_VALUE;
        while (in.hasNextInt()){
            int digit = in.nextInt();
            if (digit == digitBefore){
                streak += 1;
                //System.out.println(maxStreak);
            }
            else {

                streak = 1;
            }
            if (streak > maxStreak){
                maxStreak = streak;

            }
            System.out.println(maxStreak);
            digitBefore = digit;
        }
        //System.out.println(maxStreak+1);
    }
}
