package Skiena_Revilla.Chapter_5;

import java.util.Scanner;

public class Problem_10018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCases = scan.nextInt();
        scan.nextLine();

        // Collect input
        long[] nums = new long[numCases];
        for (int i = 0; i < numCases; i++) {
            nums[i] = scan.nextInt();
            scan.nextLine();
        }

        // Process data
        for (int i = 0; i < numCases; i++) {
            int iterations = 0;
            long num1 = nums[i];
            long num2 = reverseNum(num1);

            do {
                iterations++;
                num1 = num1 + num2;
                num2 = reverseNum(num1);
            } while (num1 != num2);

            System.out.println(iterations + " " + num1);
        }
    }


    /**
     * Returns the reverse numerical order of a given number
     * @param num the given number
     * @return the reversed number
     */
    public static long reverseNum(long num) {
        String s = Long.toString(num);
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return Long.parseLong(reverse);
    }
}
