package Skina_Revilla.Chapter_1;


/*
 * Sample Input
   1 10
   100 200
   201 210
   900 1000
 *
 * Sample Output 1 10 20 100 200 125 201 210 89 900 1000 174
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

class Problem_100 {
    public static void main(String args[])
    {
        Scanner in;
        in = new Scanner(new BufferedInputStream(System.in)); // #3. FAST READING

        while (in.hasNext()) {
            int first = in.nextInt();
            int second = in.nextInt();
            int a = first;
            int b = second;
            int max = Integer.MIN_VALUE;

            if (first > second) {
                int temp = second;
                second = first;
                first = temp;
            }

            for (int i = first; i <= second; i++) {
                int cyl;
                cyl = cycleLength(i);

                if (cyl >= max) {
                    max = cyl;
                }
            } // end of loop

            System.out.println(a + " " + b + " " + max);
        } // end of while
        in.close();
    }

    public static int cycleLength(int n) {
        int cycleLength = 1;
        for (; n != 1; cycleLength++) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return cycleLength;
    }
}

