package com.company;

public class Maze_01 {

    public static void main(String[] args) {
        int[][] myArr = {
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };

        System.out.println(maze(myArr));
    } // end of main


    public static int maze(int[][] arr)                             // public MAZE
    {
        return maze(arr, 3, 3, 0);
    } // end of public


    private static int maze(int[][] arr, int x, int y, int count)              // private MAZE
    {
        if (onBorder(arr, x, y)) {
            arr[y][x] = 7;
            show(arr);
            return count + 1;
        } else {
            //System.out.println(x + "," + y + " " + count);
            if (isLegal(arr, x + 1, y)) {
                arr[y][x] = 7;
                count = maze(arr, x + 1, y, count);
            }
            if (isLegal(arr, x - 1, y)) {
                arr[y][x] = 7;
                count = maze(arr, x - 1, y, count);
            }
            if (isLegal(arr, x, y - 1)) {
                arr[y][x] = 7;
                count = maze(arr, x, y - 1, count);
            }
            if (isLegal(arr, x, y + 1)) {
                arr[y][x] = 7;
                count = maze(arr, x, y + 1, count);
            }
        }

        return count;

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
        if (x >= 0 && y >= 0 && x <= arr[0].length - 1 && y <= arr.length - 1) {
            if (arr[y][x] == 1) return true;
        }


        return false;
    }


    private static void show(int[][] arr) {                             //SHOW

        for (int x = 0; x <= arr.length - 1; x++) {
            for (int y = 0; y <= arr.length - 1; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


} // end of class
