package Step;


import java.util.Arrays;
import java.util.Scanner;

public class Shkurenko_mnogomernii_masivi {
    public static void main(String[] args) {
        task5();
    }

    public static void task1() {
    /*
    1.	Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
    Определить сумму элементов массива, среднее арифметическое, минимальный и максимальный элемент.
      */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 21;
        int max = 0;
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 20);
                sum += mas[i][j];
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
            }
            System.out.println(Arrays.toString(mas[i]));

        }
        System.out.println("Сумма = " + sum + " среднее арифметическое = " + (sum / (m * n)) + " минимальный элемент = " + min + " максимальный элемент = " + max);
    }

    /*
        2.	Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
        Определить сумму элементов, расположенных на главной диагонали,
        а также сумму элементов, расположенных на побочной диагонали.

        */
    public static void task3() {
             /*
        3.	Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от -10 до 10.
        Определить количество положительных, отрицательных и нулевых элементов.
                */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nul = 0;
        int otr = 0;
        int pol = 0;
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 20 - 10);
                if (mas[i][j] > 0) {
                    pol++;
                }
                if (mas[i][j] < 0) {
                    otr++;
                }
                if (mas[i][j] == 0) {
                    nul++;
                }
            }
            System.out.println(Arrays.toString(mas[i]));

        }
        System.out.println("положительных элементов = " + pol + " отрицательных элементов = " + otr + " нулевых элементов = " + nul);

    }

    public static void task4() {
    /*
    4.	Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
     Определить сумму по каждой строке и по каждому столбцу массива.
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько будет столбецов и строк");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sumn = 0;
        int summ = 0;
        System.out.println("Введите какой столбец посчитать ");
        int stolb = sc.nextInt();
        System.out.println("Введите какую строку посчитать ");
        int stroka = sc.nextInt();
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 20);
            }
            System.out.println(Arrays.toString(mas[i]));
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] == mas[stolb][j]) {
                    sumn += mas[i][j];
                }
                if (mas[i][j] == mas[i][stroka]) {
                    summ += mas[i][j];
                }
            }

        }
        System.out.println("Сумма по столбцу " + stolb + "  = " + summ + " сумма по строке " + stroka + " = " + sumn);


    }

    public static void task5() {
    /*
    5.	Заполнить массив M x N двузначными числами так, чтобы первая цифра указывала  номер строки,
     а вторая – номер столбца.
    */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                mas[i][j]= (i + 1) * 10 + j + 1;

            }
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    /*
    6.	В двумерном массиве размерности M x N поменять местами чётные строки с нечётными.
*/
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
