package Step;

import java.util.Scanner;


public class Shkurenko_7 {
    public static void main(String[] args) {
        task11();
    }


    public static void task5() {
        /*
         * 5. Показать на экране равнобедренный треугольник (пользователь вводит
		 * высоту). Затем сделать то же самое, но чтоб фигура внутри была пустая
		 * (остаётся только контур).
		 */
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = h * 2 - 1;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < a; x++) {
                if (y == h - 1 || x + y == h - 1 || x - y == h - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void task8() {
        //8.	Осуществить циклический сдвиг влево введённого числа на N разрядов (например, при сд
        // виге числа 12345 влево на 3 разряда получится число 45123).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            int count = 1;
            int result = 0;
            for (int i = 10; value / i > 0; i *= 10) {
                count++;
            }
            for (int i = 10, j = (int) Math.pow(10, count); ; i *= 10, j /= 10) {
                int ostatok = value % i;
                value -= ostatok;
                ostatok /= i / 10;
                result += ostatok * j;
                if (value / i == 0) {
                    break;
                }
            }
            System.out.println(result / 10);
        }

    }

    public static void task9() {
    /*
    9.	Вывести на экран каркас параллелепипеда размерностью AxBxC.
    */
    }

    public static void task10() {
    /*
10.	Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до 10.000.000.
*/
        int konec = 10000000;

        metka:
        for (int i = 2; i < konec; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    continue metka;
            }
            System.out.println(i);


        }
    }

    public static void task11() {
/*
11.	Показать на экране все числа Армстронга в диапазоне от 0 до 10.000.000.
*/

        int konec = 100;
        int temp = 0;//считаем сколько цифр
        int sum = 0;
        for (int i = 1; konec / i > 0; i *= 10) {
            temp++;
        }
        for (int i = 0; i < konec; i++) {
            //for (int i = 0; i < konec; i++) {
                sum += Math.pow(i % 10, temp);
                temp = temp / 10;

                if (sum == i) {
                    System.out.println(i);
                //}
            }
        }

    }

/*
12.	Показать на экране все совершенные числа в диапазоне от 0 до 10.000.000.
13.	Показать на экране все числа Фибоначчи в диапазоне от 0 до 10.000.000.

15.	Вывести лестницу из отрезков определённой длины. Длина (например, 14) и количество ступенек (например, 4) указывается с клавиатуры.
	**************
	   **************
	      **************
	         **************
16.	Показать на экране лесенку. Количество ступенек (например, 5) указывает пользователь.











17.	Пользователь указывает с клавиатуры нечётное число. Рисуется фигура с заданной стороной:












18.	Нарисовать двойным циклом for - домик, с крышей, окном и трубой. Высота домика указывается с клавиатуры.
19.	Скоро ведь Новый год! Необходимо срочно нарисовать ёлочку. С клавиатуры вводится количество ярусов, и высота каждого яруса ёлочки. Например, на картинке 4 яруса, высота каждого яруса – 5 символов.






















20.	Пользователь вводит дату (по отдельности день, месяц, год). Определить день недели, соответствующий введенной дате. При написании программы следует исходить из того, что 01.01.01 – это понедельник.
21.	В американской армии считается несчастливым число 13, а в китайской — 4. Перед совместными  учениями с американской и китайской армией,  штаб украинской армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13373, 12345 или 61342), чтобы не смущать иностранных коллег. Написать программу, которая определит, сколько номеров придется исключить, если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999. Дополнительно вывести на экран все номера, которые необходимо исключить.
22.	Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его в таком виде (см.  рисунок ниже):
Дополнительно: сделайте так, чтобы "большая цифра" состояла не из звёздочек, а из соответствующих маленьких (обычных) цифр.




     */

}
