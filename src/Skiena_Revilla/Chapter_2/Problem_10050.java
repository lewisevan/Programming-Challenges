package Skiena_Revilla.Chapter_2;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_10050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));

        // Number of test cases
        int numberOfCases = in.nextInt();
        in.nextLine();

        // Stored results
        int [] results = new int[numberOfCases];

        for (int i = 0; i < numberOfCases; i++) {
            // Number of days to simulate
            int days = in.nextInt();
            in.nextLine();

            // Number of political parties to simulate
            int numberOfParties = in.nextInt();
            in.nextLine();

            ArrayList<Integer> hartals = new ArrayList<>();

            for (int j = 0; j < numberOfParties; j++) {
                // Get the hartal parameter of each party. Only store unique parameters
                int p = in.nextInt();
                in.nextLine();

                if (!hartals.contains(p)) {
                    hartals.add(p);
                }
            }

            // Calculate number of working days lost
            int lostDays = 0;
            for (int day = 1; day <= days; day++) {
                // Skip Fridays and Saturdays
                if (!(day % 7 == 0 || day % 7 == 6)) {
                    // Check if at least one hartal takes place on this day
                    for (int h = 0; h < hartals.size(); h++) {
                        if (day % hartals.get(h) == 0) {
                            lostDays++;
                            break;
                        }
                    }
                }
            }

            // Store result
            results[i] = lostDays;
        }

        for (int i = 0; i < numberOfCases; i++) {
            System.out.println(results[i]);
        }
    }
}
