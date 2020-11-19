package Skiena_Revilla.Chapter_4;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem_10041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<int []> cases = new ArrayList<>();

        int numCases = scan.nextInt();
        scan.nextLine();

        // Collect input
        for (int i = 0; i < numCases; i++) {
            int numRelatives = scan.nextInt();
            int[] arr = new int[numRelatives];

            for (int j = 0; j < numRelatives; j++) {
                arr[j] = scan.nextInt();
            }
            scan.nextLine();
            cases.add(arr);
        }

        // Process each case
        for (int i = 0; i < cases.size(); i++) {
            // For each case, check all possible house numbers and store the one which
            // provides the minimum total distance. Not very efficient, but it works.
            int minDistance = Integer.MAX_VALUE;
            int maxLocation = findMax(cases.get(i));
            for (int j = 0; j < maxLocation; j++) {
                int dist = totalDistance(j, cases.get(i));
                if (dist < minDistance) {
                    minDistance = dist;
                }
            }
            System.out.println(minDistance);
        }
    }

    /**
     * Finds the maximum value in a given array
     * @param arr an array of integers greater than 0
     * @return the maximum value
     */
    public static int findMax(int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Return the total distance between the optimal location and the other relatives
     * @param location the optimal location
     * @param houses an array that is n houses long with each cell representing the number of relatives living in that house
     * @return the total distance
     */
    public static int totalDistance(int location, int [] houses) {
        int total = 0;
        for (int i = 0; i < houses.length; i++) {
            total += Math.abs(houses[i] - location);
        }
        return total;
    }
}
