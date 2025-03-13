package homework4;

import java.util.Scanner;

public class TicTacToe {
    static final char X = 'X';
    static final char O = '0';
    public int number = 3;
    Scanner scanner = new Scanner(System.in);
    char[][] array = new char[number][number];

    public void printArray() {
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fillArray() {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = '*';
            }
        }
    }

    public boolean isCellAvailable(int x, int y) {
        if (x < 0 || y < 0 || x >= number || y >= number) {
            return false;
        } else
            return array[y][x] == '*';
    }

    public void firstPlayerMove() {

        int x, y;
        do {
            System.out.println("Ход первого игрока. Введите координаты Вашего хода: X, Y!");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellAvailable(x, y));
        array[y][x] = X;
    }

    public void secondPlayerMove() {

        int x, y;
        do {
            System.out.println("Ход второго игрока. Введите координаты Вашего хода: X, Y!");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellAvailable(x, y));
        array[y][x] = O;
    }


    public boolean checkDraw() {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (array[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char playerField) {
        if (array[0][0] == playerField && array[0][1] == playerField && array[0][2] == playerField) {
            return true;
        }
        if (array[1][0] == playerField && array[1][1] == playerField && array[1][2] == playerField) {
            return true;
        }
        if (array[2][0] == playerField && array[2][1] == playerField && array[2][2] == playerField) {
            return true;
        }
        if (array[0][0] == playerField && array[1][0] == playerField && array[2][0] == playerField) {
            return true;
        }
        if (array[0][1] == playerField && array[1][1] == playerField && array[2][1] == playerField) {
            return true;
        }
        if (array[0][2] == playerField && array[1][2] == playerField && array[2][2] == playerField) {
            return true;
        }
        if (array[0][0] == playerField && array[1][1] == playerField && array[2][2] == playerField) {
            return true;
        }
        if(array[0][2] == playerField && array[1][1] == playerField && array[2][0] == playerField) {
            return true;
        }
        return false;
    }
}

