package com.company;

public class Maze_01 {

    public static void main(String[] args) {
        int[][] myArr = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };

        System.out.println(maze(myArr));


    } // end of main


    public static int maze(int[][] arr)                                 // public MAZE
    {
        return maze(arr, 3, 3, 0);
    } // end of public


    private static int maze(int[][] arr, int x, int y, int count)       // private MAZE
    {

        if (onBorder(arr, x, y)) {
            return 1;
        } else
            return 333;  // Now i need to go all directions


    } // end of private


    private static boolean onBorder(int[][] arr, int x, int y)          // BORDER
    {
        if (x == 0 || y == 0 || x == arr[0].length - 1 || y == arr.length - 1)
            return true;
        else
            return false;
    }

    private static boolean isLegal(int[][] arr, int x, int y)           //LEGAL
    {
        if (x > 0 && y > 0 && x <= arr[0].length - 1 && y <= arr.length - 1)
            return true;
        else return false;
    }


} // end of class
