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
        for (int i = 0; i < 4; i++) { //выводит строку
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) { // выводит массив в виде
            //           0 1 2 3
//            1 $ $ $
//            2 $ $ $
//            3 $ $ $
            System.out.print((i + 1) + " ");
            for (int u = 0; u < size; u++) {
                System.out.print(krestiki[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();
        while (true) {
            boolean f = false;
            do {
                System.out.println("Ходит первый игрок");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                if (x < 0 || y < 0 || x > size || y > size) {
                    System.out.println("Ошибка.Веедите цифру от 1 до 3");
                } else if (krestiki[x][y] != s) {
                    System.out.println("Ошибка.Данная ячейка занята");

                } else {
                    krestiki[x][y] = krest;
                    f = true;
                }
            } while (f != true);
            for (int i = 0; i < 4; i++) {
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
            boolean win = false;
            if (krestiki[0][0] == krest && krestiki[1][1] == krest && krestiki[2][2] == krest) {
                win = true;
            }
            if (krestiki[0][0] == krest && krestiki[0][1] == krest && krestiki[0][2] == krest) {
                win = true;
            }
            if (krestiki[0][1] == krest && krestiki[1][1] == krest && krestiki[2][1] == krest) {
                win = true;
            }
            if (krestiki[0][0] == krest && krestiki[1][0] == krest && krestiki[2][0] == krest) {
                win = true;
            }
            if (krestiki[0][2] == krest && krestiki[1][1] == krest && krestiki[2][0] == krest) {
                win = true;
            }
            if (krestiki[1][0] == krest && krestiki[1][1] == krest && krestiki[1][2] == krest) {
                win = true;
            }
            if (krestiki[2][0] == krest && krestiki[2][1] == krest && krestiki[2][2] == krest) {
                win = true;
            }
            if (krestiki[0][2] == krest && krestiki[1][2] == krest && krestiki[2][2] == krest) {
                win = true;
            }
            if (win == true) {
                System.out.println("Победа первого игрока!");
                for (int i = 0; i < 4; i++) {
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
                return;
            }
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
            if (draw == true) {
                System.out.println("Ничья!");
                for (int k = 0; k < 4; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
                for (int l = 0; l < size; l++) {
                    System.out.print((l + 1) + " ");
                    for (int u = 0; u < size; u++) {
                        System.out.print(krestiki[l][u] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }

            boolean f1 = false;


            do {
                System.out.println("Ходит второй игрок");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                if (x < 0 || y < 0 || x > size || y > size) {
                    System.out.println("Ошибка.Веедите цифру от 1 до 3");
                } else if (krestiki[x][y] != s) {
                    System.out.println("Ошибка.Данная ячейка занята");

                } else {
                    krestiki[x][y] = noll;
                    f1 = true;
                }
            } while (f1 != true);
            for (int i = 0; i < 4; i++) {
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


            boolean win1 = false;
            if (krestiki[0][0] == noll && krestiki[1][1] == noll && krestiki[2][2] == noll) {
                win1 = true;
            }
            if (krestiki[0][0] == noll && krestiki[0][1] == noll && krestiki[0][2] == noll) {
                win1 = true;
            }
            if (krestiki[0][1] == noll && krestiki[1][1] == noll && krestiki[2][1] == noll) {
                win1 = true;
            }
            if (krestiki[0][0] == noll && krestiki[1][0] == noll && krestiki[2][0] == noll) {
                win1 = true;
            }
            if (krestiki[0][2] == noll && krestiki[1][1] == noll && krestiki[2][0] == noll) {
                win1 = true;
            }
            if (krestiki[1][0] == noll && krestiki[1][1] == noll && krestiki[1][2] == noll) {
                win1 = true;
            }
            if (krestiki[2][0] == noll && krestiki[2][1] == noll && krestiki[2][2] == noll) {
                win1 = true;
            }
            if (krestiki[0][2] == noll && krestiki[1][2] == noll && krestiki[2][2] == noll) {
                win1 = true;
            }
            if (win1 == true) {
                System.out.println("Победа второго игрока!");
                for (int i = 0; i < 4; i++) {
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
                return;
            }
            boolean draw1 = false;
            for (int i = 0; i < size; i++) {
                for (int y = 0; y < size; y++) {
                    if (krestiki[i][y] == s) {
                        draw1 = false;
                        break;
                    } else {
                        draw1 = true;


                    }
                }
            }
            if (draw1 == true) {
                System.out.println("Ничья!");
                for (int k = 0; k < 4; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
                for (int l = 0; l < size; l++) {
                    System.out.print((l + 1) + " ");
                    for (int u = 0; u < size; u++) {
                        System.out.print(krestiki[l][u] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }


        }


    }


}