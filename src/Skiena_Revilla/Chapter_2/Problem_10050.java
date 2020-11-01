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

        for (int i = 0; i < numberOfCases; i++) {
            // Number of days to simulate
            int days = in.nextInt();
            in.nextLine();

            // Number of political parties to simulate
            int numberOfParties = in.nextInt();
            in.nextLine();

            int [] hartals = new int[numberOfParties];

            for (int j = 0; j < numberOfParties; j++) {
                // Get the hartal parameter of each party
                hartals[j] = in.nextInt();
                in.nextLine();
            }

            // Calculate number of working days lost
        }
    }
}
