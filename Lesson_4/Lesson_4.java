package HomeWorkPartOne.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {

    private static Random rnd = new Random();
    private static Scanner scan = new Scanner(System.in);

    private static final int DOT_TO_WINS = 3;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';

    private static final int SIZE = 3;
    private static char[][] map;
    private static final int NUMBER_FIELD = SIZE + 1;
    //private static  char[][] value;

    /*
    принт карты
    ход человека
    проверка
    ход ии
    проверка
    повтор цикла, пока не выиграет или не заполнится карта
    проверка на заполнение и ничью
    */

    public static void main(String[] args) {
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkForWin(DOT_X)) {
                System.out.println("Победа человека");
                break;
            }
            if (mapfull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkForWin(DOT_O)) {
                System.out.println("Победа компьютера");
                break;
            }
            if (mapfull()) {
                System.out.println("Ничья!");
                printMap();
                break;
            }
        }
    }


    private static boolean mapfull() {
        /* если клетка не DOT_EMPTY
        пройтись по клеткам
        вернуть значение
         */
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static void aiTurn() {
        int row, column;
        do {
            row = rnd.nextInt(3);
            column = rnd.nextInt(3);
        }
        while (!isCellValid(row, column));
        map[row][column] = DOT_O;
        printMap();
    }

    private static void humanTurn() {
        System.out.println("Введите коориднаты первая Х (строка), вторая Y (столбец)");
        int row, column;
        do {
            row = scan.nextByte() - 1;
            column = scan.nextByte() - 1;
        }
        while (!isCellValid(row, column));
        map[row][column] = DOT_X;
    }

    private static boolean isCellValid(int row, int column) {
        if (row < 0 || row > SIZE || column < 0 || column > SIZE) return false;
        if (map[row][column] == DOT_EMPTY) return true;
        return false;
    }

    /*
       .   .   .

       .   .   .

       .   .   .
     */
    private static boolean checkForWin(char symb) {
        int point = 0;
        boolean isWin = false;
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map.length; column++) {
                if (map[row][column] == symb || map[column][row] == symb || (column = SIZE - row - 1) == symb) {
                    point++;
                    if (point == DOT_TO_WINS) {
                        isWin = true;
                    }
                } else {
                    isWin = false;
                    break;
                }
            }
            if (isWin) break;
        }
        return isWin;
    }


    private static void initMap() {
        for (int numb = 1; numb < NUMBER_FIELD; numb++) {
            System.out.print("\t");
            System.out.print(numb + "\t");
        }
        System.out.println();
        int numb = 1;
        map = new char[SIZE][SIZE];
        for (int row = 0; row < map.length; row++) {
            System.out.print(numb);
            numb++;
            for (int column = 0; column < map.length; column++) {
                map[row][column] = DOT_EMPTY;
                System.out.print("\t" + map[row][column] + "\t" + " ");
            }
            System.out.println("\n");
        }
    }

    private static void printMap() {
        System.out.println("=======================");
        for (int numb = 1; numb < NUMBER_FIELD; numb++) {
            System.out.print("\t");
            System.out.print(numb + "\t");
        }
        System.out.println();
        int numb = 1;
        for (char[] row : map) {
            System.out.print(numb);
            numb++;
            for (int column = 0; column < map.length; column++) {
                System.out.print("\t");
                System.out.print(row[column] + "\t");
            }
            System.out.println("\n");
        }
    }
}
