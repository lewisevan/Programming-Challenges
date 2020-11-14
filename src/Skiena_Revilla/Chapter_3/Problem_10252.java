package Skiena_Revilla.Chapter_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10252 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<int[]> words = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            if (line.equals("")) {
                break;
            }

            int[] word = new int[alphabet.length()]; // Create a 26 element array representing the number of occurrences of each letter in the word

            for (int i = 0; i < line.length(); i++) {
                word[alphabet.indexOf(line.charAt(i))] += 1;
            }

            words.add(word); // Store in the array list
        }

        // Process data and print output
        for (int i = 0; i < words.size(); i += 2) {
            int[] word1 = words.get(i);
            int[] word2 = words.get(i + 1);

            for (int j = 0; j < alphabet.length(); j++) {
                for (int k = 0; k < Math.min(word1[j], word2[j]); k++) {
                    System.out.print(alphabet.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
