package Step;


public class Shkurenko_mnogomernii_masivi {
    public static void main(String[] args) {
        task7();
    }

    public static void task7() {
        /*
        7.	Дан двумерный массив размерностью M x N, заполненный случайными числами из диапазона от -100 до 100.
         Определить сумму элементов массива, расположенных между минимальным и максимальным элементами.
        */

        int m = 10;// строки
        int n = 15;// столбцы
        int[][] ar = new int[m][n];
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                ar[y][x] = (int) (Math.random() * 200 - 100);
                System.out.printf("%6d", ar[y][x]);
            }
            System.out.println();
        }
        int xmin = 0, ymin = 0;
        int xmax = 0, ymax = 0;
        int min = ar[0][0], max = ar[0][0];
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (ar[y][x] < min) {
                    min = ar[y][x];
                    xmin = x;
                    ymin = y;
                }
                if (ar[y][x] > max) {
                    max = ar[y][x];
                    xmax = x;
                    ymax = y;
                }
            }

        }
        System.out.println(ymin + "," + xmin);
        System.out.println(ymax + "," + xmax);
        int[] om = new int[m * n];
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                om[y * n + x] = ar[y][x];
                System.out.print(om[y * n + x] + ",");
            }
        }
        //ymin
               // xmin
        //imin = ymin*n+xmin;
    }
}
