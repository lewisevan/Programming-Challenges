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
        }

        /* Process and output data */
        // For each payments array in the trips ArrayList
            // Calculate the average payment
            // Search through the payments array and identify all payments above the average payment
                // Find the difference between the payment amount and avg payment, and add this difference to exchange
            // Print the total amount that must be exchanged
    }

    public static double calculate_average(double[] arr) {
        return 0;
    }
}
