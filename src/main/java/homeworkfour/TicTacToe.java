package homeworkfour;

import java.util.Scanner;

public class TicTacToe {
    public static int SIZE =5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static int humanX;     //new
    public static int humanY;     //new
    public static int humanPreviousX; //new
    public static int humanPreviousY; //new

    public static void main(String[] args) {
        StartGame();
    }

    private static void StartGame() {

    initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("you won!");
                break;
            }
            if (isMapFull()) {
                System.out.println("draw!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("you lost '(");
                break;
            }
            if (isMapFull()) {
                System.out.println("draw!");
                break;
            }
        }
        System.out.println("Game Over");
    }


    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {   // проверяем по горизонтали
            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) {
                if (map[i][j] == symb && map[i][j + 1] == symb && map[i][j + 2] == symb && map[i][j + 3] == symb)
                    return true;
            }
        }
        for (int j = 0; j < SIZE; j++) {   // проверяем по вертикали
            for (int i = 0; i <= SIZE - DOTS_TO_WIN; i++) {
                if (map[i][j] == symb && map[i + 1][j] == symb && map[i + 2][j] == symb && map[i + 3][j] == symb)
                    return true;
            }
        }
        for (int i = 0; i <= SIZE-DOTS_TO_WIN; i++) {   // проверяем диагональ1
            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) {
                if (map[i][j] == symb && map[i+1][j + 1] == symb && map[i+2][j + 2] == symb && map[i+3][j + 3] == symb)
                    return true;
            }
        }
        for (int i = 0; i <= SIZE-DOTS_TO_WIN; i++) {   // проверяем диагональ2
            for (int j = SIZE-1; j >= DOTS_TO_WIN-1; j--) {
                if (map[i][j] == symb && map[i+1][j-1] == symb && map[i+2][j - 2] == symb && map[i+3][j - 3] == symb)
                    return true;
            }
            }
            return false;
        }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void humanTurn() {
        int x, y;
        do {
            humanPreviousX=humanX;
            humanPreviousY=humanY;
            System.out.println("Your turn. Input coordinates in format: X Y (X - line, Y - column)");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            humanX = x;
            humanY = y;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        } while (!isCellValidForAI(x, y));  // новый метод
        System.out.println("your opponent move " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    private static boolean isCellValidForAI(int x, int y) {
        if ((x < 0 || x >= SIZE || y < 0 || y >= SIZE) ||
        //диагональ
        ((humanX + humanY)==SIZE && (humanPreviousX + humanPreviousY) == SIZE && x+y!= SIZE && map[x][y] == DOT_EMPTY)||
        ((humanX+ humanY)==(SIZE+2) && (humanPreviousX+humanPreviousY) == (SIZE+2) && (x+y)!= (SIZE+2) && map[x][y] == DOT_EMPTY) ||
        ((humanX + humanY)==(SIZE+1) && humanPreviousX+humanPreviousY ==(SIZE+1) && (x+y)!=(SIZE+1) && map[x][y] == DOT_EMPTY) ||
        (humanX == humanY  && humanPreviousX == humanPreviousY  && x != y && map[x][y] == DOT_EMPTY) ||
         //горизонталь
        (humanX == humanPreviousX && (Math.abs(humanY - humanPreviousY) == 1 || Math.abs(humanY - humanPreviousY) == 2) && x!= humanX && map[x][y] == DOT_EMPTY) ||
        // вертикаль
        (humanY == humanPreviousY && (Math.abs(humanX - humanPreviousX) == 1 || Math.abs(humanX - humanPreviousX) == 2) && y!= humanY && map[x][y] == DOT_EMPTY)) {
            return  false;
        }
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
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
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
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

}
//   вариант без добавления логики AI
//    public static int SIZE =5;
//    public static int DOTS_TO_WIN = 4;
//    public static final char DOT_EMPTY = '•';
//    public static final char DOT_X = 'X';
//    public static final char DOT_O = 'O';
//    public static char[][] map;
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        initMap();
//        printMap();
//
//        while (true) {
//            humanTurn();
//            printMap();
//            if (checkWin(DOT_X)) {
//                System.out.println("you won!");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("draw!");
//                break;
//            }
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_O)) {
//                System.out.println("you lost '(");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("draw!");
//                break;
//            }
//        }
//        System.out.println("Game Over");
//    }
//
//
//    public static boolean checkWin(char symb) {
//        for (int i = 0; i < SIZE; i++) {   // проверяем по горизонтали
//            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) {
//                if (map[i][j] == symb && map[i][j + 1] == symb && map[i][j + 2] == symb && map[i][j + 3] == symb)
//                    return true;
//            }
//        }
//        for (int j = 0; j < SIZE; j++) {   // проверяем по вертикали
//            for (int i = 0; i <= SIZE - DOTS_TO_WIN; i++) {
//                if (map[i][j] == symb && map[i + 1][j] == symb && map[i + 2][j] == symb && map[i + 3][j] == symb)
//                    return true;
//            }
//        }
//        for (int i = 0; i <= SIZE-DOTS_TO_WIN; i++) {   // проверяем диагональ1
//            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) {
//                if (map[i][j] == symb && map[i+1][j + 1] == symb && map[i+2][j + 2] == symb && map[i+3][j + 3] == symb)
//                    return true;
//            }
//        }
//        for (int i = 0; i <= SIZE-DOTS_TO_WIN; i++) {   // проверяем диагональ2
//            for (int j = SIZE-1; j >= DOTS_TO_WIN-1; j--) {
//                if (map[i][j] == symb && map[i+1][j-1] == symb && map[i+2][j - 2] == symb && map[i+3][j - 3] == symb)
//                    return true;
//            }
//            }
//            return false;
//        }
//
//    public static boolean isMapFull() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == DOT_EMPTY) return false;
//            }
//        }
//        return true;
//    }
//
//    public static void humanTurn() {
//        int x, y;
//        do {
//            System.out.println("Your turn. Input coordinates in format: X Y (X - line, Y - column)");
//            x = sc.nextInt() - 1;
//            y = sc.nextInt() - 1;
//        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
//        map[x][y] = DOT_X;
//    }
//
//    public static void aiTurn() { // добавить логику
//        int x, y;
//        do {
//            x = (int) (Math.random() * SIZE); // от 0 до 4
//            y = (int) (Math.random() * SIZE);
//        } while (!isCellValid(x, y));
//        System.out.println("your opponent move " + (x + 1) + " " + (y + 1)); // от 1 до 5
//        map[x][y] = DOT_O;
//    }
//
//    public static boolean isCellValid(int x, int y) {
//        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
//        if (map[x][y] == DOT_EMPTY) return true;
//        return false;
//    }
//
//    public static void initMap() {
//        map = new char[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                map[i][j] = DOT_EMPTY;
//            }
//        }
//    }
//
//    public static void printMap() {
//        System.out.print("  ");
//        for (int i = 1; i <= SIZE; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
//
