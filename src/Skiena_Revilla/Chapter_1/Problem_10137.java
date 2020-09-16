package Skiena_Revilla.Chapter_1;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        ArrayList<double[]> trips = new ArrayList(); // Each index holds an array containing the amounts each student paid during the trip

        /* Input data */
        int student_count = in.nextInt();
        while (student_count != 0) {
            double[] payments = new double[student_count];
            for (int i = 0; i < student_count; i++) {
                payments[i] = in.nextDouble();
            }
            trips.add(payments);

            student_count = in.nextInt();
        }

        /* Process and output data */
        for (int i = 0; i < trips.size(); i++) {
            double[] payments = trips.get(i);
            double avg = calculate_average(payments);

            double exchange = 0;
            for (int j = 0; j < payments.length; j++) {
                if (payments[j] > avg) {
                    exchange += (payments[j] - avg);
                }
            }
            System.out.println("$" + exchange);
        }
    }

    public static double calculate_average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
