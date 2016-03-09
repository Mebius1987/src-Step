package Step;


import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Shkurenko_mnogomernii_masivi {
    public static void main(String[] args) {
        task13();
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

    public static void task2() {
    /*
        2.	Дан двумерный массив размерностью M х N, заполненный случайными числами из диапазона от 0 до 20.
        Определить сумму элементов, расположенных на главной диагонали,
        а также сумму элементов, расположенных на побочной диагонали.
        */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int array[][] = new int[m][n];
        int sum1 = 0, sum2 = 0, rangeL = 0, rangeH = 20;

        for (int y = 0; y < array.length; System.out.println(), y++)
            for (int x = 0; x < array[y].length; System.out.printf("%4d", array[y][x]), x++) {
                array[y][x] = (int) Math.round(Math.random() * (rangeH - rangeL) + rangeL);
                if (x == y) sum1 += array[y][x];
                if (m - 1 - x == y) sum2 += array[y][x];
            }

        System.out.print("\n Сумма элементов, расположенных на главной диагонали = " + sum1);
        System.out.print("\n Сумма элементов, расположенных на побочной диагонали = " + sum2);


    }

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
        //System.out.println("Введите какой столбец посчитать ");
        //int stolb = sc.nextInt();
        //System.out.println("Введите какую строку посчитать ");
        //int stroka = sc.nextInt();
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 20);
            }
            System.out.println(Arrays.toString(mas[i]));
        }

        for (int i = 0; i < m; i++) {
            sumn = 0;
            summ = 0;
            for (int j = 0; j < n; j++) {
                if (mas[i][j] == mas[i][j]) {
                    sumn += mas[i][j];
                }
                if (mas[i][j] == mas[i][j]) {
                    summ += mas[i][j];
                }


            }
            System.out.println("Столбцы сумма =  " + summ + ", строки сумма =  " + sumn);

        }
        //System.out.println("Сумма по столбцу " + stolb + "  = " + summ + " сумма по строке " + stroka + " = " + sumn);


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
            for (int j = 0; j < n; j++) {
                mas[i][j] = (i + 1) * 10 + j + 1;

            }
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    public static void task6() {
    /*
    6.	В двумерном массиве размерности M x N поменять местами чётные строки с нечётными.
*/
        int N = 5, M = 7;
        int array[][] = new int[N][M];
        int temp;

        System.out.println("До:");
        for (int y = 0; y < array.length; System.out.println(), y++)
            for (int x = 0; x < array[y].length; System.out.printf("%4d", array[y][x]), x++)
                array[y][x] = (y + 1) * 10 + x + 1;

        System.out.println("После:");
        for (int y = 0; y + 1 < N; y += 2)
            for (int x = 0; x < M; x++) {
                temp = array[y][x];
                array[y][x] = array[y + 1][x];
                array[y + 1][x] = temp;
            }

        for (int y[] : array) {
            for (int yx : y) System.out.printf("%4d", yx);
            System.out.println();
        }


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

    public static void task8() {
    /*
    8.	Заполнить квадратную матрицу размером M x N по спирали. Число 1 ставится в центр матрицы,
    а затем массив заполняется по спирали против часовой стрелки значениями по возрастанию.
    */
        int M = 9;    // вводить только нечетное число
        int array[][] = new int[M][M];
        final byte DIR_L = 0, DIR_D = 1, DIR_R = 2, DIR_U = 3;
        byte dirrection = DIR_L;
        int k = 0;
        int y, x;

        array[y = M / 2][x = M / 2] = ++k;

        Init:
        for (int i = 2; ; dirrection = (byte) (++dirrection % 4), i++)
            for (int j = 0; j < i / 2; j++) {
                if (k == M * M) break Init;
                switch (dirrection) {
                    case DIR_L:
                        array[y][--x] = ++k;
                        break;
                    case DIR_D:
                        array[++y][x] = ++k;
                        break;
                    case DIR_R:
                        array[y][++x] = ++k;
                        break;
                    case DIR_U:
                        array[--y][x] = ++k;
                        break;
                }
            }

        for (int _y[] : array) {
            System.out.println();
            for (int _yx : _y) System.out.printf("%3d", _yx);
        }

    }

    public static void task9() {
    /*
    9.	То же самое, только число 1 ставится в угловой (например, верхний левый) элемент, и спираль закручивается к центру матрицы.
*/
        int M = 9;    // вводить только нечетное число
        int array[][] = new int[M][M];
        final byte DIR_L = 0, DIR_D = 1, DIR_R = 2, DIR_U = 3;
        byte dirrection = DIR_L;
        int k = M * M;
        int y, x;

        array[y = M / 2][x = M / 2] = k--;

        Init:
        for (int i = 2; ; dirrection = (byte) (++dirrection % 4), i++)
            for (int j = 0; j < i / 2; j++) {
                if (k == 0) break Init;
                switch (dirrection) {
                    case DIR_L:
                        array[y][--x] = k--;
                        break;
                    case DIR_D:
                        array[++y][x] = k--;
                        break;
                    case DIR_R:
                        array[y][++x] = k--;
                        break;
                    case DIR_U:
                        array[--y][x] = k--;
                        break;
                }
            }

        for (int _y[] : array) {
            System.out.println();
            for (int _yx : _y) System.out.printf("%3d", _yx);
        }

    }

    public static void task10() {
            /*
            10.	Заполнить массив M x N следующим образом:
*/
        int N = 7, M = 9;
        int array[][] = new int[N][M];

        for (int i = 0; i < N * M; array[i / M][i % M] = ++i) ;

        for (int y[] : array) {
            System.out.println();
            for (int yx : y) System.out.printf("%3d", yx);
        }

    }

    public static void task11() {
/*
            11.	Заполнить массив M x N следующим образом:
*/

        int N = 7, M = 9;
        int array[][] = new int[N][M];

        for (int i = 0; i < N * M; array[i / M][(i / M % 2 == 0) ? (i % M) : (M - 1 - (i % M))] = ++i) ;

        for (int y[] : array) {
            System.out.println();
            for (int yx : y) System.out.printf("%3d", yx);
        }
    }

    public static void task12() {
/*
            12.	Заполнить массив M x N следующим образом:
*/

        class FillArrayByReflaction {
            int X, Y, x = 0, y = 0, value = 0, missing = 0;
            boolean directionYdown = true, directionXright = true;
            boolean enableTeleport = false;
            int array[][];

            FillArrayByReflaction(int array[][]) {
                this.array = array;
                this.Y = array.length;
                this.X = array[0].length;
            }

            boolean doIt() {
                array[y++][x++] = ++value;
                while (value < array.length * array[0].length) {
                    nextStep();
                    if (missing == array.length * array[0].length) return false;
                }
                return true;
            }

            void nextStep() {

                if (enableTeleport) teleport();

                boolean border = y == 0 || x == 0 || y == Y - 1 || x == X - 1;
                boolean corner = y == 0 && x == 0 || y == Y - 1 && x == X - 1 || y == 0 && x == X - 1 || x == 0 && y == Y - 1;

                if (corner) enableTeleport = !enableTeleport;
                else if (border) reflact();

                if (array[y][x] == 0) {
                    array[y][x] = ++value;
                    missing = 0;
                } else missing++;

                y = (directionYdown) ? ++y : --y;
                x = (directionXright) ? ++x : --x;
            }

            void reflact() {
                directionYdown = (y == 0) ? true : (y == Y - 1) ? false : directionYdown;
                directionXright = (x == 0) ? true : (x == X - 1) ? false : directionXright;
            }

            void teleport() {
                x = (x == -1) ? X - 1 : 0;
                y = (y == -1) ? Y - 1 : 0;
            }

        }

        int Y = 7, X = 8;
        int array[][] = new int[Y][X];

        FillArrayByReflaction fillArray = new FillArrayByReflaction(array);

        if (fillArray.doIt()) System.out.printf("Массив успешно заполнен:\n");
        else System.out.printf("Массив размерности %dx%d невозможно заполнить полностью:\n", Y, X);

        for (int y[] : array) {
            System.out.print("\n");
            for (int yx : y) System.out.printf("%4d", yx);
        }
    }

    public static void task13(){
/*
            13.	Заполнить трёхмерный массив N x N x N нулями. В получившийся куб вписать шар,
            состоящий из единиц. После чего, разрезать куб на N слоёв, и показать каждый слой в виде двумерного массива N x N на экране консоли.
            */

        int sizeOfCube;
        boolean error;
        int cube [][][];
        String answer="0";

        do
            try {
                answer = JOptionPane.showInputDialog("Введите размер куба (нечетное число)");
                if (Integer.parseInt(answer)%2==0) throw new Exception();
                error = false;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Размер введен неверно. Попробуйте еще раз.");
                error = true;
            }
        while (error);

        sizeOfCube = Integer.parseInt(answer);
        cube = new int [sizeOfCube][sizeOfCube][sizeOfCube];
        JOptionPane.showMessageDialog(null, "Результат смотри в консоли");

        for (int x=0; x<sizeOfCube; System.out.printf("\n\n"), x++)
            for (int y=0; y<sizeOfCube; System.out.printf("\n"), y++)
                for (int z=0; z<sizeOfCube; System.out.printf("%2d",cube[x][y][z]), z++)
                    if ( Math.pow(x-sizeOfCube/2,2) + Math.pow(y-sizeOfCube/2,2)
                            + Math.pow(z-sizeOfCube/2,2) < Math.pow(sizeOfCube/2+0.1,2) )
                        cube[x][y][z]++;
    }

    public static void task14(){
    /*
    14.	Реализовать преобразование двумерного массива в одномерный, и наоборот.
    */

    }
    /*
    15.	Создать массив размерностью M x N, заполненный случайными числами. Вывести на экран  строку, для которой среднее арифметическое элементов максимально отличается от среднего арифметического значения для всех элементов массива.
            /*
            16.	В кинотеатре M рядов по N мест в каждом. В двумерном массиве хранится информация о проданных билетах. Число 1 означает, что билет на данное место уже продан, число 0 означает, что место свободно.  Поступил запрос на продажу K билетов на соседние места в одном ряду. Определите, можно ли выполнить такой запрос. Число занятых мест, и какие места заняты на момент запроса, определяется случайным образом. Вывести исходный массив на экран консоли.
            /*
            17.	* Клиент банка хочет снять со своего счёта N гривен при помощи банкомата.  Внутри банкомата есть от 4 до 6 кассет с купюрами (определяется случайным образом). В кассету помещается от 2 до 3 тысяч купюр (количество купюр определяется случайным образом для каждой кассеты). Каждая кассета настроена на определённый номинал (номиналы задаются отдельным массивом на K элементов, например – 1, 2, 5, 10, 20, 50, 100, 200, 500). На какой именно номинал настроена кассета – определяется случайным образом, номиналы кассет могут повторяться. Более 40 купюр за раз не выдаётся. Банкомат должен выдать сумму минимальным количеством банкнот, или же сообщить, что запрашиваемую сумму выдать нельзя.
*/
}
