import java.util.Random;
import java.util.Scanner;

public class homeWork4 {
    public static char[][] map;
    public static final int SIZE = 3;

    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static final char DOT_EMPTY = '.';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;

        Random rand = new Random();

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + (y + 1));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }

        if (map[y][x] == DOT_EMPTY) {
            return true;
        }

        return false;
    }

    public static boolean isWinner(char symb) {
        return (isDiagonalsFilledWith(symb) || isLineFilledWith(symb));
    }

    static boolean isLineFilledWith(char symb) {
        for (int row = 0; row < SIZE; row++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == symb) {
                    horizontalWinCounter++;
                } else {
                    horizontalWinCounter = 0;
                }

                if (map[column][row] == symb) {
                    verticalWinCounter++;
                } else {
                    verticalWinCounter = 0;
                }
            }
            if ((horizontalWinCounter == SIZE) || (verticalWinCounter == SIZE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDiagonalsFilledWith(char symb) {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;

        for (int row = 0; row < SIZE; row++) {
            if (map[row][row] == symb) {
                mainDiagonalCounter++;
            } else {
                mainDiagonalCounter = 0;
            }

            if (map[row][SIZE - 1 - row] == symb) {
                sideDiagonalCounter++;
            } else {
                sideDiagonalCounter = 0;
            }
        }

        return ((mainDiagonalCounter == SIZE) || (sideDiagonalCounter == SIZE));
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
