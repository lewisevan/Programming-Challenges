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

        ArrayList<char[][]> grids = new ArrayList<>(); // A list of all grids

        while (in.hasNextLine()) {
        /* Get and process input */
        while (in.hasNextInt()) {
            int rows = in.nextInt();
            int cols = in.nextInt();
            in.nextLine(); // Collect empty carriage return

            // Stop input if size is 0 x 0
            if (rows == 0 && cols == 0) {
                break;
            }

            // Create an empty grid
            char[][] grid = new char[rows][cols];

            // Get r rows of input. For each input row, fill corresponding row in grid
            for (int r = 0; r < rows; r++) {
                String line = in.nextLine();
                for (int c = 0; c < cols; c++) {
                    grid[r][c] = line.charAt(c);
                }
            }

            grids.add(grid);
        }

        /* Process the output */
        for (int i = 0; i < grids.size(); i++) {
            char[][] grid = grids.get(i);

            System.out.println("Field #" + (i + 1) + ":");

            for (int row = 0; row < grid.length; row ++) {
                for (int col = 0; col < grid[row].length; col++) {
                    if (grid[row][col] == '*') {
                        // If cell is a mine, print the mine symbol
                        System.out.print("*");
                    } else {
                        // Print the number of adjacent mines
                        int count = countAdjacentMines(grid, row, col);
                        System.out.print(count);
                    }
                }
                System.out.println("");
            }
            if (i < grids.size() - 1) {
                System.out.println("");
            }
        }
    }

    /**
     * Counts the number of mines adjacent to a given cell position
     * @param row the row of the cell
     * @param col the column of the cell
     * @return the number of adjacent mines
     */
    public static int countAdjacentMines(char[][] grid, int row, int col) {
        // Check the surrounding cells for mines
        int count = 0;

        // Check above cell
        if (row > 0) {
            count += grid[row-1][col] == '*' ? 1 : 0;
        }
        // Check above-left cell
        if (row > 0 && col > 0) {
            count += grid[row-1][col-1] == '*' ? 1 : 0;
        }
        // Check above-right cell
        if (row > 0 && col < grid[row].length - 1) {
            count += grid[row-1][col+1] == '*' ? 1 : 0;
        }
        // Check left cell
        if (col > 0) {
            count += grid[row][col-1] == '*' ? 1 : 0;
        }
        // Check left cell
        if (col < grid[row].length - 1) {
            count += grid[row][col+1] == '*' ? 1 : 0;
        }
        // Check below cell
        if (row < grid.length - 1) {
            count += grid[row+1][col] == '*' ? 1 : 0;
        }
        // Check row below-left cell
        if (row < grid.length - 1 && col > 0) {
            count += grid[row+1][col-1] == '*' ? 1 : 0;
        }
        // Check row below-right cell
        if (row < grid.length - 1 && col < grid[row].length - 1) {
            count += grid[row+1][col+1] == '*' ? 1 : 0;
        }

        return count;
    }
}
