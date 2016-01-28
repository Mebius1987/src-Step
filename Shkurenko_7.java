package Step;

import java.util.Scanner;


public class Shkurenko_7 {
    public static void main(String[] args) {
        task8();
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число сдвиг которого необходимо сделать");
        int number = sc.nextInt();
        System.out.println("на сколько требуется сделать сдвиг");
        int n = sc.nextInt();
        int a;
        for (int i= 1; i <= n; i++) {
            //a = number % 10;
            number /= 10;
            System.out.print(number);
        }
    }

}
