package Step;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Mebius on 19.02.2016.
 */
public class Stroki {
    public static void main(String[] args) {
        task2();
    }


    public static void task1() {
//1.	Ввести с клавиатуры строку текста, а затем один символ.
// Показать на экран индексы и количество совпадений (ищем вхождения символа в строку).
        Scanner sc = new Scanner(System.in);
        String a = sc.next();// вводим строку
        String find = sc.next();// вводим что искать
        int index = 0;
        int kol = 0;

        while ((index = a.indexOf(find, index)) != -1) {
            System.out.println("Индекс " + index);
            index++;
            kol++;
        }

        System.out.println("Всего нашли " + find + " = " + kol + " раза.");
    }

    public static void task2() {
        /*
        2.	Написать программу, подсчитывающую количество слов, а также гласных и согласных букв в строке,
        введённой пользователем. Дополнительно выводить количество знаков пунктуации, цифр и других символов.
         Учесть, что между словами (а также до и после слов) может быть более одного пробела!
         Текст строки должен быть на английском языке. Пример вывода программы:
Всего символов в строке текста – 38, из них:
Слов – 6
Гласных букв - 12
Согласных букв - 21
Знаков пунктуации - 2
Цифр – 01
Других символов – 3

         */
        Scanner sc = new Scanner(System.in);
        String pred = sc.next();// вводим строку
        int length = pred.length();
        System.out.println("Длина строки = " + length);


    }

}
