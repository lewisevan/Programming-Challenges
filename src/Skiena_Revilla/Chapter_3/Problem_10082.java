package Skiena_Revilla.Chapter_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10082 {
    public static void main(String[] args) {
        String chars = "QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./`1234567890-=";
        ArrayList<String> lines = new ArrayList<>(); // Stores lines of input

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            // Collect input
            String line = scan.nextLine();

            if (line.equals("")) {
                break;
            }

            lines.add(line);
        }

        // Process data and print output
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c == ' ' || c == 'Q' || c == 'A' || c == 'Z' || c == '\n') {
                    System.out.print(c);
                } else {
                    System.out.print(chars.charAt(chars.indexOf(c) - 1));
                }
            }
            System.out.println();
        }
    }
}