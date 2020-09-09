package Skiena_Revilla.Chapter_1;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_10189 {
    /**
     * Takes a series of input minesweeper grids. The size of the grid (r x c) is input first.
     * Then r lines with c items each are entered with '*' representing mines and '.' represent safe spaces.
     * The solved grid with '*' representing mines and integers representing the number of adjacent mines is printed
     * out for each grid input.
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));

        ArrayList<char[][]> grids = new ArrayList<>();

        while (in.hasNextLine()) {
            // Get the size of the grid
            // If grid is not 0 x 0:
            // Create empty r x c array of characters
            // Get the next r lines of data, for each line store each item in a separate cell in a 2D array
            // Add the array to the ArrayList of grids

            // Process the the next grid
        }

        // OUTPUT
        /* For each grid in the ArrayList of grids:
         *   For each row in the grid:
         *     For each item in the row:
         *       Count the number of adjacent mines and print it out
         */
    }

    /**
     * Counts the number of mines adjacent to a given cell position
     * @param row the row of the cell
     * @param col the column of the cell
     * @return the number of adjacent mines
     */
    public static int countAdjacentMines(int row, int col) {
        // Check the surrounding cells for mines
        return 0;
    }
}
