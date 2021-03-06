package Step;


import java.util.Scanner;

public class Shkurenko_7 {
    public static void main(String[] args) {
        task5();
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

        int konec = 10000000;
        int temp = 0;//считаем сколько цифр
        int sum = 0;
        for (int i = 0; i < konec; i++) {
            for (int j = 1; i / j > 0; j *= 10) {
                temp++;
            }
            int cisl = i;
            for (int a = 0; a < temp; a++) {
                sum += Math.pow(cisl % 10, temp);
                cisl /= 10;

            }
            if (sum == i) {
                System.out.println(sum);

            }
            sum = 0;
            temp = 0;
        }


    }

    public static void task12() {
/*
12.	Показать на экране все совершенные числа в диапазоне от 0 до 10.000.000.
*/
        int konec = 10000000;
        int sum = 0;
        for (int i = 1; i < konec; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if (i == sum) {
                    System.out.println(sum);
                }

            }
        }

    }

    public static void task13() {
/*
13.	Показать на экране все числа Фибоначчи в диапазоне от 0 до 10.000.000.
*/
        int konec = 10000000;
        int a = 0;
        int b = 1;
        int sum_fib;
        for (int i = 0; i < konec; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + ", ");
            if (sum_fib > konec)
                return;
        }
    }


    public static void task15() {
/*
15.	Вывести лестницу из отрезков определённой длины. Длина (например, 14) и количество ступенек (например, 4) указывается с клавиатуры.
	**************
	   **************
	      **************
	         **************
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ступенек");
        int dlina = sc.nextInt();
        System.out.println("Введите количество ступенек");
        int visota = sc.nextInt();
        int probel = 0;
        for (int i = 0; i < visota; i++) {
            System.out.println("");
            probel += 3;
            for (int j = 0; j < probel; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < dlina; a++) {
                System.out.print("*");

            }
        }
    }

    public static void task16() {
    /*
16.	Показать на экране лесенку. Количество ступенек (например, 5) указывает пользователь.
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ступенек");
        int count = sc.nextInt();
        System.out.println(" * * *");
        for (int i = 0; i < count; i++) {
            for (int spaces = 0; spaces < (i + 1) * 2; spaces++) System.out.print("  ");
            System.out.println(" *");
            for (int spaces = 0; spaces < (i + 1) * 2; spaces++) System.out.print("  ");
            for (int stars = 0; stars < 3; stars++) System.out.print(" *");

            System.out.println("");
        }

    }

    public static void task17() {
/*

17.	Пользователь указывает с клавиатуры нечётное число. Рисуется фигура с заданной стороной:
*/


    }

    /*
    18.	Нарисовать двойным циклом for - домик, с крышей, окном и трубой. Высота домика указывается с клавиатуры.

    */
    public static void task19() {
   /*
19.	Скоро ведь Новый год! Необходимо срочно нарисовать ёлочку. С клавиатуры вводится количество ярусов, и высота каждого яруса ёлочки. Например, на картинке 4 яруса, высота каждого яруса – 5 символов.
*/
        byte hight = 3, count = 9;

        for (byte i = 0; i < count; i++)
            for (byte j = 0; j < hight; System.out.println(""), j++) {
                for (byte k = 0; k < hight - 1 - j + count - i; k++) System.out.print("  ");
                for (byte k = 0; k < 1 + j * 2 + i * 2; k++) System.out.print("<>");
            }
        for (byte i = 0; i < (hight + count) / 3; System.out.println(""), i++) {
            for (byte k = 0; k < (hight + count - 1) - (hight + count) / 6; k++) System.out.print("  ");
            for (byte k = 0; k < 1 + 2 * ((hight + count) / 6); k++) System.out.print("<>");
        }

    }

    /*
    20.	Пользователь вводит дату (по отдельности день, месяц, год). Определить день недели, соответствующий введенной дате.
     При написании программы следует исходить из того, что 01.01.01 – это понедельник.
    */
    public static void task21() {
/*
21.	В американской армии считается несчастливым число 13, а в китайской — 4. Перед совместными
учениями с американской и китайской армией,  штаб украинской армии решил исключить номера боевой техники,
содержащие числа 4 или 13 (например, 40123, 13373, 12345 или 61342), чтобы не смущать иностранных коллег.
Написать программу, которая определит, сколько номеров придется исключить, если в распоряжении армии имеется 100 тыс.
единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999. Дополнительно вывести на экран все номера,
которые необходимо исключить.
*/

        boolean success;
        int copy;
        for (int i = 1; i < 100000; i++) {
            copy = i;
            success = true;// vse DigitalSpeaker podxod9t'
            while (copy > 0) {
                if (copy % 10 == 4 || copy % 100 == 13) {
                    System.out.println("номер будет исключен " + i);
                    success = false;
                    break;
                }
                copy /= 10;
            }

            if (success)

            {
                System.out.printf("%05d\n", i);
            }
        }
    /*
22.	Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его в таком виде (см.  рисунок ниже):
Дополнительно: сделайте так, чтобы "большая цифра" состояла не из звёздочек, а из соответствующих маленьких (обычных) цифр.




     */

    }
}
