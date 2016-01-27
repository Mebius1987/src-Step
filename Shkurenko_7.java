package Step;

import java.util.Scanner;

/**
 * Created by Mebius on 27.01.2016.
 */
public class Shkurenko_7 {
    public static void main(String[] args) {
        task5();
    }
    Scanner sc = new Scanner(System.in);
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

}
