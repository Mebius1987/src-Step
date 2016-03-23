package Step;

import java.util.Scanner;

/**
 * Created by Mebius on 02.02.2016.
 */
public class Shkurenko_8_1 {
    public static void main(String[] args) {
        task10();
    }

    /*
    ВНИМАНИЕ !!!

            В этих задачах нельзя использовать арифметические операции (+, -, *, /, %) и метод Math.pow(). Также могут быть и другие ограничения в каких-то конкретных задачах. Рекомендуются к использованию побитовые операторы &, |, ~, ^, <<, >>, >>>. Удачи 

            /////////////////////////////////////////////////////////////////////////////////////////
            */
    public static void task1() {
    /*

        1. Дано число n, значение которого меньше 32. Покажите число 2n, то есть число, у которого энный бит равен 1, а все остальные – по нулям.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int a = 1;
        a <<= n;
        System.out.println("ответ = " + a);
    }

    public static void task2() {
/*
        2. Даны два неравных числа: n и m, не превосходящие 31. Вычислите 2n + 2m (да, здесь можно использовать операцию + ).
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        System.out.println("Введите число");
        int m = sc.nextInt();
        int otvet = 0;
        otvet = 1 << n | 1 << m;
        System.out.println("ответ = " + otvet);
    }

    public static void task3() {
/*
        3. Дано целое число A и натуральное число n. Обнулите у числа A его последние n бит, и выведите результат на экран консоли.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число n");
        double n = sc.nextInt();
        int mask = 0xFE;
        for (int j = 0; j < n; n++)
            a = a & mask;
        mask <<= 1;

        System.out.println("ответ = " + a);
    }

    public static void task4() {
/*
        4. Дано целое число A и натуральное число n. Выведите число, которое получается из числа A установкой значения n-го бита в единицу.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        a |= (1 << n);
        System.out.println(a);
    }

    public static void task5() {
/*
        5. Дано целое число A и натуральное число n. Выведите число, которое получается из числа A инвертированием n-го бита.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        a ^= (1 << n);
        System.out.println(a);
    }

    public static void task6() {
        /*
        6. Дано целое число A и натуральное число n. Выведите число, которое состоит только из n последних бит числа A (то есть обнулите все биты числа A, кроме последних n).
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        a &= (1 << n) - 1;
        System.out.println(a);
    }

    public static void task7() {
    /*
        7. Дано целое число A и натуральное число n. Выведите значение n-го бита числа A, то есть 0 или 1.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        int a = sc.nextInt();
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        a |= (n << n);
        System.out.println(a);
    }

    public static void task8() {
/*
        8. Дано целое число типа short. Выведите его в битовой форме (16 бит).
  */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число A");
        short a = sc.nextShort();
        for (int i = 15; i >= 0; i--)
            System.out.print((a >> i & 1));
    }

    public static void task9() {
/*
        9. Есть переменная типа int (32 бита), равная нулю. Присвоить трём случайным битам значение 1. Показать получившееся значение переменной.
*/
        int a = 0;
        int temp = 0;
        for (int i = 2; i >= 0; i--) {
            temp = (int) (Math.random() * 32);
            a |= (1 << temp);
        }
        System.out.println(a);
    }

    public static void task10() {
/*
        10. Сохранить в одной переменной типа int два значения типа short. Затем вытащить из переменной каждое из двух значений по отдельности.
*/
        short temp = (short) (Math.random() * 32767);
        short temp2 = (short) (Math.random() * 32767);
        System.out.println("temp - " + temp);
        System.out.println("temp2 - " + temp2);
        int a = 0;
        a = a | temp;
        a = (a << 16) | temp2;
        System.out.println("Во временной переменной - " + a);
        System.out.println("temp - " + (short) (a >> 16));
        System.out.println("temp2 - " + (short) a);

    }

}