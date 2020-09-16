package Skiena_Revilla.Chapter_1;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        ArrayList<int[]> trips = new ArrayList(); // Each index holds an array containing the amounts each student paid (in cents) during the trip

        /* Input data */
        int student_count = in.nextInt();
        in.nextLine();
        while (student_count != 0) {
            int[] payments = new int[student_count];
            for (int i = 0; i < student_count; i++) {
                payments[i] = (int) (in.nextDouble() * 100);
                in.nextLine();
            }
            trips.add(payments);

            student_count = in.nextInt();
        }

        /* Process and output data */
        for (int i = 0; i < trips.size(); i++) {
            int[] payments = trips.get(i);
            int avg = calculate_average(payments);

            int exchange = 0;
            for (int j = 0; j < payments.length; j++) {
                if (payments[j] > avg) {
                    exchange += (payments[j] - avg);
                }
            }
            double min_exchange = exchange / 100.00;
            System.out.printf("$%.2f%n", min_exchange);
        }
    }

    public static int calculate_average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (int) Math.round(1.0*sum / arr.length);
    }
}
