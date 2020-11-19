package Skiena_Revilla.Chapter_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10188 {
    public static void main(String[] args) {
        ArrayList<String> standardInputStrings = new ArrayList<>();
        ArrayList<String> standardInputNums = new ArrayList<>();
        ArrayList<String> teamInputStrings = new ArrayList<>();
        ArrayList<String> teamInputNums = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // Collect input
        int inputLines = scan.nextInt();
        scan.nextLine();
        while (inputLines != 0) {
            // Collect standard input
            String standardInput = "";
            for (int i = 0; i < inputLines; i++) {
                standardInput += scan.nextLine();
                standardInput += "\n";
            }
            standardInputStrings.add(standardInput);
            standardInputNums.add(extractInts(standardInput));

            // Collect team input
            inputLines = scan.nextInt();
            scan.nextLine();

            String teamInput = "";
            for (int i = 0; i < inputLines; i++) {
                teamInput += scan.nextLine();
                teamInput += "\n";
            }
            teamInputStrings.add(teamInput);
            teamInputNums.add(extractInts(teamInput));

            inputLines = scan.nextInt();
            scan.nextLine();
        }

        // Process data
        for (int i = 0; i < standardInputStrings.size(); i++) {
            System.out.print("Run #" + (i + 1) + ": ");

            if (standardInputStrings.get(i).equals(teamInputStrings.get(i))) {
                System.out.println("Accepted");
            }
            else if (standardInputNums.get(i).equals(teamInputNums.get(i))) {
                System.out.println("Presentation Error");
            }
            else {
                System.out.println("Wrong Answer");
            }
        }
    }

    /**
     * Removes all characters from a given string and returns a string consisting only of numbers
     * @param s the given string
     * @return a string of numbers
     */
    public static String extractInts(String s) {
        String nums = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                nums += s.charAt(i);
            }
        }
        return nums;
    }
}
