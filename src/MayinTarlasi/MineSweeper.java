package MayinTarlasi;

import java.util.Scanner;

public class MineSweeper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır Sayısı: ");
        int row = scanner.nextInt();
        System.out.print("Sütun Sayısı: ");
        int col = scanner.nextInt();

        char[][] mineField = createMineField(row, col);
        System.out.println("Mayınların Konumu");
        printMineField(mineField);
        System.out.println("\nMayın Tarlası Oyuna Hoşgeldiniz !");

        char[][] emptyField = createEmptyField(row, col);
        int remainingCells = row * col - countMines(mineField);

        while (remainingCells > 0) {
            printMineField(emptyField);
            System.out.print("Satır Giriniz : ");
            int selectedRow = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selectedCol = scanner.nextInt();

            if (!isValidInput(selectedRow, selectedCol, row, col) || emptyField[selectedRow][selectedCol] != '-') {
                System.out.println("Geçersiz giriş. Lütfen tekrar deneyin.");
                continue;
            }

            if (mineField[selectedRow][selectedCol] == '*') {
                System.out.println("Game Over!!");
                //printMineField(mineField);
                break;
            } else {
                int numberOfMines = countAdjacentMines(mineField, selectedRow, selectedCol);
                emptyField[selectedRow][selectedCol] = (char) (numberOfMines + '0');
                remainingCells--;

                if (remainingCells == 0) {
                    System.out.println("Oyunu Kazandınız !");
                    //printMineField(emptyField);
                    break;
                }
            }
        }

        scanner.close();
    }


    public static char[][] createMineField(int row, int col) {
        char[][] mineField = new char[row][col];
        int numberOfMines = row * col / 4;

        for (int i = 0; i < numberOfMines; i++) {
            int randomRow, randomCol;
            do {
                randomRow = (int) (Math.random() * row);
                randomCol = (int) (Math.random() * col);
            } while (mineField[randomRow][randomCol] == '*');

            mineField[randomRow][randomCol] = '*';
        }

        return mineField;
    }

    public static void printMineField(char[][] mineField) {
        for (char[] row : mineField) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static char[][] createEmptyField(int row, int col) {
        char[][] emptyField = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                emptyField[i][j] = '-';
            }
        }
        return emptyField;
    }

    public static int countMines(char[][] mineField) {
        int count = 0;
        for (char[] row : mineField) {
            for (char cell : row) {
                if (cell == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countAdjacentMines(char[][] mineField, int row, int col) {
        int count = 0;
        int[][] directions = {
                {-1, 0}, {-1, 1}, {0, 1}, {1, 1},
                {1, 0}, {1, -1}, {0, -1}, {-1, -1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValidCell(newRow, newCol, mineField.length, mineField[0].length) &&
                    mineField[newRow][newCol] == '*') {
                count++;
            }
        }

        return count;
    }

    public static boolean isValidInput(int row, int col, int maxRow, int maxCol) {
        return row >= 0 && row < maxRow && col >= 0 && col < maxCol;
    }

    public static boolean isValidCell(int row, int col, int maxRow, int maxCol) {
        return row >= 0 && row < maxRow && col >= 0 && col < maxCol;
    }

}
