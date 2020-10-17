package Skiena_Revilla.Chapter_2;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_10038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        ArrayList<int[]> lists = new ArrayList();

        // Collect input
        //while (in.hasNextLine()) {
            int size = in.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            lists.add(arr);
            in.nextLine();
        //}

        // Process data
        for (int i = 0; i < lists.size(); i++) {
            int[] list = lists.get(i);
            int[] diffs = new int[list.length - 1];

            // Calculate differences
            for (int j = 0; j < list.length - 1; j++) {
                diffs[j] = Math.abs(list[j+1] - list[j]);
            }

            // Sort the data
            Arrays.sort(diffs);

            // Make sure all values 1 to n-1 are present
            boolean jolly = true;
            for (int j = 0; j < diffs.length; j++) {
                if (diffs[j] != j + 1) {
                    jolly = false;
                }
            }
            if (jolly) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }
}
