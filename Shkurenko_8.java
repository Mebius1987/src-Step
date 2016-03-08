package Step;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Mebius on 29.01.2016.
 */
public class Shkurenko_8 {
    public static void main(String[] args) {
        task17();
    }

    public static void task1() {
        /*
        1.	Ввести массив из 5 чисел, а затем вывести его в обратном порядке.
        */
        int mas[] = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10000000);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; --i) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void task2() {
        /*
        2.	Создать массив из 20 случайных чисел. Вывести все элементы массива с чётными индексами.
        */
        int a = 20;//dlina massiva
        int mas[] = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10000);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0)
                System.out.print(i + " - " + mas[i] + ", ");
        }
    }

    public static void task3() {
         /*
        3.	Создать массив из 10 случайных чисел в диапазоне от -20 до 20. Определить количество, сумму  и среднее арифметическое положительных элементов массива.
        */
        int a = 10;//dlina massiva
        int mas[] = new int[a];
        int kol = 0;
        int sum = 0;
        int arf = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 40 - 20);
            //System.out.print(mas[i] + " ");
            System.out.println(i + "  " + mas[i] + ", ");
            if (mas[i] > 0) {
                kol++;
                sum += mas[i];
            }
            arf = sum / mas.length;
        }
        System.out.println("Положительных элеметов масива =" + kol + "\n Сумма =" + sum + "\n  Среднее арифметическое положительных элементов массива =" + arf);
    }

    public static void task4() {
        /*
        4.	Создать символьный массив из 100 случайных элементов. Определить, сколько в нём цифр, букв и знаков пунктуации.
        */
        int a = 100;
        char mas[] = new char[a];
        int cifra = 0;
        int bukva = 0;
        int znak = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (char) (Math.random() * 96 + 33);
            System.out.println(i + "  " + mas[i]);
            if (Character.isDigit(mas[i])) {
                cifra++;
            } else if (Character.isLetter(mas[i])) {
                bukva++;
            } else
                znak++;


        }
        System.out.println("Цифр " + cifra);
        System.out.println("Знаков " + znak);
        System.out.println("Букв " + bukva);
    }

    public static void task5() {
        /*
        5.	Написать программу, которая предлагает пользователю ввести число, и затем подсчитывает,
        сколько раз это число встречается в массиве на 100 случайных элементов.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для поиска в массиве");
        int number = sc.nextInt();
        int dlina = 100;
        int kol = 0;
        int mas[] = new int[dlina];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mas.length; i++) {
            if (number == mas[i]) {
                kol++;
            }
        }
        System.out.println("Число встречается в массиве на 100 случайных элементов " + kol);
    }

    public static void task6() {
        /*
        6.	Создать массив из 20 случайных чисел в диапазоне от -10 до 30. Написать программу, определяющую сумму элементов
         массива, находящихся в массиве после первого отрицательного элемента.
        */
        int razmer = 20;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 40 - 10);
        }
        System.out.println(Arrays.toString(mas));
        boolean found = false;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!found) {
                found = mas[i] < 0;
                continue;
            }
            //System.out.println(mas[i]);
            sum += mas[i];

        }
        System.out.println("Сумма = " + sum);
    }

    public static void task7() {
    /*
        7.	Создать массив из 20 случайных чисел в диапазоне от -30 до 10. Написать программу, определяющую сумму элементов массива, находящихся
        в массиве до первого положительного элемента.
        */
        int razmer = 20;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 40 - 30);
        }
        System.out.println(Arrays.toString(mas));
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                break;
            }
            sum += mas[i];
        }
        System.out.println("Сумма = " + sum);
    }

    public static void task8() {
        /*
        8.	Создать массив из 20 случайных чисел. Определить минимальный и максимальный элемент массива (вывести значение и порядковый номер).
        */
        int razmer = 20;
        int min, max;
        int mini = 0;
        int maxi = 0;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mas));
        min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                mini = i;

            }
        }

        max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxi = i;
            }
        }
        System.out.println("Минимальное значение = " + min + ", его порядковый номер = " + mini);
        System.out.println("Максимальное значение = " + max + ", его порядковый номер = " + maxi);
    }

    public static void task9() {
    /*
        9.	Создать массив на 100 вещественных чисел. Определить, сколько элементов массива не имеют вещественной части.
        */
        int razmer = 1000000;
        int a = 0;
        float mas[] = new float[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (float) Math.random() * 100;
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == (int) mas[i]) {
                a++;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(a);
    }

    public static void task10() {
        /*
        10.	Создать массив из 200 случайных чисел в диапазоне от 0 до 200. Определить количество одноразрядных,
        двухразрядных и трёхразрядных чисел в процентном отношении.
        */
        int razmer = 200;
        float odin = 0;
        float dva = 0;
        float tri = 0;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 200);

        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= 0 && mas[i] <= 9) {
                odin++;
            }
            if (mas[i] >= 10 && mas[i] <= 99) {
                dva++;
            }
            if (mas[i] >= 100 && mas[i] <= 200) {
                tri++;
            }
        }
        System.out.println(((float) ((100 * odin) / razmer)));
        System.out.println(((float) ((100 * dva) / razmer)));
        System.out.println(((float) ((100 * tri) / razmer)));

    }

    public static void task11() {
        /*
        11.	Создать массив из 10 целых случайных чисел. Изменить порядок следования элементов массива на противоположный
         (1-й элемент меняется с 10-м, 2-й элемент с 9-м и тд).
        */
        int razmer = 10;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mas));
        int m;

        for (int i = 0; i < mas.length / 2; i++) {
            m = mas[i];
            int n = mas.length - i - 1;
            mas[i] = mas[n];
            mas[n] = m;
        }

        System.out.println(Arrays.toString(mas));
    }

    public static void task12() {
        /*
        12.	Создать два массива A и B по 5 элементов. Создать третий массив C на 10 элементов, в который копируются
         элементы из первого и второго массива поочередно (например, С[0]=A[0], c[1]=B[0], C[2]=A[1], C[3]=B[1] и тд).
        */
        int razmer = 5;
        int a[] = new int[razmer];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        //System.out.println(Arrays.toString(a));

        int b[] = new int[razmer];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        //System.out.println(Arrays.toString(b));
        int j = 0;
        int g = 0;
        int c[] = new int[razmer * 2];
        for (int i = 0; i < c.length; i++, j++, g++) {
            c[i] = a[j];
            i++;
            c[i] = b[g];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void task13() {
    /*
    13.	Написать программу, копирующую один массив в другой следующим образом: сначала копируются последовательно все
    элементы, большие 0, затем последовательно все элементы, равные 0, а затем последовательно все элементы, меньшие 0.
    */
        int razmer = 10;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println(Arrays.toString(mas));
        int masa[] = new int[razmer];
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                System.arraycopy(mas, i, masa, j, 1);
                j++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                System.arraycopy(mas, i, masa, j, 1);
                j++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                System.arraycopy(mas, i, masa, j, 1);
                j++;
            }

        }
        System.out.println(Arrays.toString(masa));

    }

    public static void task14() {
    /*
    14.	Даны 2 массива размерности M и N соответственно. Необходимо переписать в третий массив общие элементы первых двух массивов, без повторений.
    */


        class Array {
            int data[], size;

            Array (int size) {
                data = new int[size];
                this.size = size;
            }

            void fillRandomInt (int rangeL, int rangeH) {
                for (int i=0; i<size; i++)
                    data[i] = (int)Math.round(Math.random()*(rangeH-rangeL)+rangeL);
            }

            void print () {
                for (int x:data)
                    System.out.printf("%4d", x);
                System.out.println();
            }
        }

        int M=16, N=12;

        Array A = new Array (M);
        A.fillRandomInt(0, 10);

        Array B = new Array (N);
        B.fillRandomInt(0, 10);

        System.out.printf("\nМассив A из %d случайных чисел:\n",A.size);
        A.print();
        System.out.printf("\nМассив B из %d случайных чисел:\n",B.size);
        B.print();

        HashSet<Integer> common = new HashSet<Integer>();

        for (int a:A.data)
            for (int b:B.data)
                if (a==b) common.add(a);

        Array C = new Array (common.size());

        int i=0;
        for (Integer val:common)
            C.data[i++] = val;

        System.out.printf("\nОбщие элементы первых двух массивов:\n");
        C.print();
    }



    public static void task15() {
    /*
    15.	Даны 2 массива размерности M и N соответственно. Необходимо переписать в третий массив те элементы первого массива, которых нет во втором массиве,  без повторений.
    */
        class Array {
            int data[], size;

            Array (int size) {
                data = new int[size];
                this.size = size;
            }

            void fillRandomInt (int rangeL, int rangeH) {
                for (int i=0; i<size; i++)
                    data[i] = (int)Math.round(Math.random()*(rangeH-rangeL)+rangeL);
            }

            void print () {
                for (int x:data)
                    System.out.printf("%4d", x);
                System.out.println();
            }
        }
        int M=14, N=10;

        Array A = new Array (M);
        A.fillRandomInt(0, 10);

        Array B = new Array (N);
        B.fillRandomInt(0, 10);

        System.out.printf("\nМассив A из %d случайных чисел:\n",A.size);
        A.print();
        System.out.printf("\nМассив B из %d случайных чисел:\n",B.size);
        B.print();

        HashSet<Integer> common = new HashSet<Integer>();

        for (int a:A.data) {
            boolean repeat=false;
            for (int b:B.data)
                if (a==b) repeat=true;
            if (!repeat)common.add(a);
        }

        Array C = new Array (common.size());

        int i=0;
        for (Integer val:common)
            C.data[i++] = val;

        System.out.printf("\nЭлементы первого массива, которых нет во втором массиве:\n");
        C.print();
    }



    public static void task16() {
    /*
    16.	Реализовать программу-лотерею. Программа загадывает 5 случайных неповторяющихся чисел в диапазоне от 1 до 42, но
    не показывает их на экран. Пользователь пытается их угадать – вводит какие-то свои 5 чисел с клавиатуры. Назначить
    призы за совпадения. Например, если пользователь угадал три числа - приз 100 кредитов, если 4 - 500 кредитов,
    если 5 – 2500 кредитов. И в целом, какова вероятность того, что пользователь угадает все 5 чисел?
    */
        int razmer = 5;
        int mas[] = new int[razmer];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 41 + 1);
        }
        Scanner sc = new Scanner(System.in);
        //System.out.println(Arrays.toString(mas));
        int polz[] = new int[razmer];
        for (int i = 0; i < polz.length; i++) {
            polz[i] = sc.nextInt();
        }
        int b = 0;
        for (int a = 0; a < mas.length; a++, b++) {
            if (mas[a] == polz[b]) {

            }
        }
    }
    public static void task17() {
    /*
    17.	Создать массив из 20 случайных чисел в диапазоне от -10 до 20. Определить максимальное количество подряд идущих положительных элементов, не прерываемых ни нулями, ни отрицательными числами. Вывести найденный фрагмент.
    */
        class Array {
            int data[], size;

            Array (int size) {
                data = new int[size];
                this.size = size;
            }

            void fillRandomInt (int rangeL, int rangeH) {
                for (int i=0; i<size; i++)
                    data[i] = (int)Math.round(Math.random()*(rangeH-rangeL)+rangeL);
            }

            void print () {
                for (int x:data)
                    System.out.printf("%4d", x);
                System.out.println();
            }
        }

        Array A = new Array (20);
        A.fillRandomInt(-10, 20);

        System.out.printf("\nМассив A из %d случайных чисел:\n",A.size);
        A.print();

        int begin=0, end=0, count=0, newBegin=0;
        boolean counting=false;

        for (int i=0; i<A.size; i++) {
            if (!counting && A.data[i]>0) {newBegin=i; counting=true;}
            if (counting && (A.data[i]<=0)) {
                counting=false;
                if (i-newBegin>count) {begin=newBegin; end=i; count=end-begin;}
            }
        }
        if (counting && A.size-newBegin>count) {begin=newBegin; end=A.size; count=end-begin;}

        System.out.printf("\nМаксимальное количество подряд идущих положительных элементов = %d", count);
        System.out.printf("\nНайденный фрагмент:");
        for (int i=begin; i<end; i++)
            System.out.printf("%3d",A.data[i]);
    }


    /*
    18.	Создать массив из 10 вещественных чисел. Преобразовать массив так, чтобы сначала шли все элементы с вещественной частью, а потом без нее.
    19.	Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100. Найти элемент, максимально близкий к среднему арифметическому значений массива.
    20.	Осуществить циклический сдвиг массива на N элементов. Направление сдвига указывает пользователь (например, массив 0,1,2,3,4,5,6,7,8,9 при циклическом сдвиге вправо на 3 элемента примет вид 7,8,9,0,1,2,3,4,5,6).
    21.	Создать массив строк на 4000 элементов. Заполнить его римскими числами от 1 до 3999, показать на экране все элементы.
    22.	Ввести число в диапазоне от 0 до 1000000. Озвучить его словами. Например, при вводе числа 25 вывести на экране «двадцать пять».
    23.	Дана последовательность: 1, 11, 21, 1211, 111221, 312211, 13112221, … Ввести число N. Показать N-ный по счёту элемент последовательности.
   */
    public static void task24() {
        /*
        24.написать программу, которая рассчитает среднегодовую температуру (среднюю, максимальную и минимальную),
        по предоставленным данным. Между какими двумя месяцами года происходит максимальный перепад средних температур?
        */
        double min[] = {-26.2, -28, -16, -5.9, 0.3, 5.2, 7.5, 7, 0.9, -0.8, -13.3, -14.6, -19.6};
        double sr[] = {-0.5, -0.2, 3.5, 9.4, 15.6, 20, 22.6, 22.3, 17.2, 11.6, 5.7, 1.1};
        double max[] = {15.1, 18.6, 24.1, 29.4, 33.3, 35.6, 39.3, 38, 32.4, 30.5, 26, 16.3};
        float mins = 0;
        for (int i = 0; i < min.length; i++) {
            mins += min[i];
        }
        float srs = 0;
        for (int i = 0; i < sr.length; i++) {
            srs += sr[i];
        }
        float maxs = 0;
        for (int i = 0; i < max.length; i++) {
            maxs += max[i];
        }
        System.out.println("Среднегодовая температура минимальная = " + mins / 12);
        System.out.println("Среднегодовая температура средняя = " + srs / 12);
        System.out.println("Среднегодовая температура максимальная = " + maxs / 12);
        double minx = 0;
        double b = minx;
        for (int i = 0; i < min.length-1; i++) {
                if ((min[i] - min[i + 1] < b)) {
                    b = min[i] - min[i+1];
                }
            }
        System.out.println(b);
        }

    }
