import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = 3;
        char krest = 'X';
        char noll = 'O';
        char[][] krestiki = new char[size][size];
        char s = '$';
        for (int i = 0; i < size; i++) { // берем ячейку и заносим туда элемент $
            for (int y = 0; y < size; y++) {
                krestiki[i][y] = s;
            }
        }
        battlefield(size, s, krestiki);
        while (true) {
            startGame(size, krestiki, s, krest);
            if (checkWinPlayer(size, s, krestiki, krest)) {
                return;
            }
            startGame(size, krestiki, s, noll);
            if (checkWinPlayer(size, s, krestiki, noll)) {
                return;
            }
        }
    }

    public static void startGame(int size, char[][] krestiki, char s, char symbol) {

        boolean f = false;
        int x, y;
        do {
            System.out.println("ходит игрок с символом " + symbol);
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            f = checkError(size, krestiki, x, y, s, symbol);
        } while (!f);
        krestiki[x][y] = symbol;
        battlefield(size, s, krestiki);
    }

    public static void battlefield(int size, char s, char[][] krestiki) {
        for (int i = 0; i < 4; i++) { //выводит строку
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int u = 0; u < size; u++) {
                System.out.print(krestiki[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static boolean checkWinPlayer(int size, char s, char[][] krestiki, char symbol) {


        if (win(krestiki, symbol)) {
            System.out.println("Победа " + symbol);
            battlefield(size, s, krestiki);
            return true;
        } else if (draw(size, krestiki, s)) {
            System.out.println("Ничья!");
            battlefield(size, s, krestiki);
            return true;
        } else {
            return false;
        }
    }

    public static boolean win(char[][] krestiki, char c) {
        if (krestiki[0][0] == c && krestiki[1][1] == c && krestiki[2][2] == c) {
            return true;
        }
        if (krestiki[0][0] == c && krestiki[0][1] == c && krestiki[0][2] == c) {
            return true;
        }
        if (krestiki[0][1] == c && krestiki[1][1] == c && krestiki[2][1] == c) {
            return true;
        }
        if (krestiki[0][0] == c && krestiki[1][0] == c && krestiki[2][0] == c) {
            return true;
        }
        if (krestiki[0][2] == c && krestiki[1][1] == c && krestiki[2][0] == c) {
            return true;
        }
        if (krestiki[1][0] == c && krestiki[1][1] == c && krestiki[1][2] == c) {
            return true;
        }
        if (krestiki[2][0] == c && krestiki[2][1] == c && krestiki[2][2] == c) {
            return true;
        }
        if (krestiki[0][2] == c && krestiki[1][2] == c && krestiki[2][2] == c) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean draw(int size, char[][] krestiki, char s) {
        boolean draw = false;
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                if (krestiki[i][y] == s) {
                    draw = false;
                    break;
                } else {
                    draw = true;


                }
            }
        }
        return draw;
    }

    public static boolean checkError(int size, char[][] krestiki, int x, int y, char s, char symbol) {
        if (x < 0 || y < 0 || x > size || y > size) {
            System.out.println("Ошибка.Веедите цифру от 1 до 3");
            return false;
        } else if (krestiki[x][y] != s) {
            System.out.println("Ошибка.Данная ячейка занята");
            return false;
        } else {
            return true;
        }
    }


}
