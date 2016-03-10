package Step;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class metodi {

    //public static void main(String[] args) {
    //task1();
    //}
    //public static void task1() {


    public static void myLine(int length, char symbol, boolean c) {
              /*
        1.	Написать статический метод myLine, который можно будет вызвать так:
        myLine(20, '@', true);
        и при этом на экране консоли нарисуется горизонтальная линия, состоящая из 20 «собачек».
        Если передать в последнем параметре false – линия станет вертикальной.
*/

            for (int i = 0; i < length; i++) {
                if (c) {
                    System.out.print(symbol);
                }
                    System.out.println(symbol);
            }
        }


    public static void myRectangle(int Height, int Width, char ramka, char a) {
/*
        2.	Написать статический метод myRectangle, который выводит на экран консоли прямоугольник.
        Метод принимает 4 параметра: ширина, высота, символ рамки, символ заливки.
*/

        for (int y = 0; y < Height; y++) {
            for (int x = 0; x < Width; x++) {
                if (y == Height + 1) {
                    System.out.print(ramka);
                }
                System.out.println(a);
            }
        }
    }


    public static void cube(int chislo) {
        /*
        3.	Написать статический метод cube, который возвращает куб переданного числа.
*/
        System.out.println(Math.pow(chislo, 3));

    }

    public static void isSimple(int number) {
        /*
        4.	Написать статический булевский метод isSimple, который проверяет, является ли переданное ему число простым.
        Число называется простым, если оно делится без остатка только на себя и на единицу.
*/

        int start = 2;
        boolean isSimple = true; //сколько раз получился 0
        while (start < number) {

            if (number % start == 0) {
                isSimple = false;
                break;

            }
            start++;
        }
        System.out.println(isSimple);
    }

    public static void sumBetween(int first, int second) {
        /*
        5.	Написать статический метод sumBetween, который получает в качестве параметров 2 целых числа и возвращает сумму чисел из диапазона между ними.
*/
        int sum = 0;
        for (int i = first + 1; i < second; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void arrayAvg(int ar[]) {
        /*
        6.	Написать статический метод arrayAvg, определяющий среднее арифметическое элементов передаваемого ему массива.
*/
        int s = 0;
        for (int current : ar) {
            s += current;
        }
        System.out.println(s/ar.length);
    }
    public static void metod1(int ar[]) {
        /*
        7.	Написать 4 метода, которые позволят: вернуть ссылку на созданный одномерный массив типа int указанного размера,
        заполнить массив случайными числами, показать массив на экран консоли, отсортировать массив, вставить целое
         число в указанный массив типа int по указанному индексу.
*/

    }


    public static void main(String[] args) {

        myLine(20, '@', false);
        //myRectangle(5, 5, '@', '*');
        //cube(5);
        //isSimple(22);
        //sumBetween(12, 14);
        //arrayAvg(new int[]{1, 2, 3, 4, 5});
    }
}




/*
        8.	Написать статический метод, показывающий на экран минимум и максимум (значение и индекс) среди элементов передаваемого ему массива.

/*
        9.	Написать статический метод, меняющий порядок следования элементов передаваемого ему массива на противоположный.

/*
        10.	Есть два игральных кубика со значениями от 1 до 6. Игра происходит с компьютером, кубики бросаются поочерёдно.
         Побеждает тот, у кого сумма выпавших очков по итогам пяти бросков больше.
         Кубики отображаются при помощи псевдографики. В конце игры необходимо вывести среднее арифметическое по броскам для обоих соперников.

/*
        11.	 Написать статический метод myRound для округления заданного числа до указанного количества знаков после запятой.
        Метод возвращает полученное число.

/*
        12.	Оптимизировать коды решений по одиннадцатому блоку (введение в Java FX).
         В новой версии проекта «Лабиринт» должно получиться не менее 20 пользовательских методов.
*/
