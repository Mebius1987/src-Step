package Step.while_part2;

import java.util.Scanner;

/**
 * Created by Mebius on 22.03.2016.
 */
public class bolwii_cifri_22 {
    /*
    22.	Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его в таком виде (см.  рисунок ниже):
Дополнительно: сделайте так, чтобы "большая цифра" состояла не из звёздочек, а из соответствующих маленьких (обычных) цифр.
     */
    public static void main(String[] args) {

        task22();
    }
    public static void task22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        int num = sc.nextInt();
        int pow = 0;
        int dig;
        String str1;
        String str0 = " ";
        for (int i = num; i > 0; i /= 10) {
            pow++;
        }

        for (int y = 1; y <= 7; y++) {
            for (int n = 1; n <= pow; n++) {
                dig = num / (int) Math.pow(10, pow - n) % 10;
                str1 = dig + "";
                for (int x = 1; x <= 7; x++) {
                    if (dig == 0) {
                        if ((y == 1 || y == 7) && x > 2 && x < 6 || (y == 2 || y == 6) && (x == 2 || x == 6)
                                || y > 2 && y < 6 && (x == 1 || x == 7)) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 1) {
                        if (x == 4 || y == 2 && x == 3 || y == 7 && (x == 3 || x == 5)) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 2) {
                        if (y == 7 || y == 1 && (x == 3 || x == 4 || x == 5) || x == 1 && (y == 2 || y == 3)
                                || x == 7 - y + 1 && x != 7) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 3) {
                        if ((y == 1 || y == 4 || y == 7) && x > 2 && x < 6 || y != 1 && y != 4 && y != 7 && x == 7) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 4) {
                        if (y == 5 || x == 5 || x == 6 - y) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 5) {
                        if ((y == 3 || y == 7) && x > 2 && x < 6 || x == 1 && (y == 2 || y == 3)
                                || x == 7 && y > 3 && y < 7 || y == 1 || x == 1 && y == 6) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 6) {
                        if (x == 1 && y != 1 && y != 7 || (y == 1 || y == 7) && x > 1 && x < 6 || y == 4 && x < 6
                                || x == 7 && (y == 5 || y == 6)) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 7) {
                        if (y == 1 || x == 8 - y) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 8) {
                        if ((y == 1 || y == 4 || y == 7) && x > 2 && x < 6
                                || y != 1 && y != 4 && y != 7 && (x == 7 || x == 1)) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    } else if (dig == 9) {
                        if (x == 7 && y != 7 && y != 1 || (y == 1 || y == 4 || y == 7) && x > 2 && x < 7
                                || x == 1 && (y == 2 || y == 3)) {
                            System.out.print(str1);
                        } else {
                            System.out.print(str0);
                        }
                    }
                }
                System.out.print(str0);
            }
            System.out.println();
        }
    }
}

