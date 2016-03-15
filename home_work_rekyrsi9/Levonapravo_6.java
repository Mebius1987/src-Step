package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 15.03.2016.
 */
/*
6. Цифры числа слева направо.
Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.
Ввод: 179
Вывод: 1 7 9

 */
public class Levonapravo_6 {
    public static void levonapravo(int n) {

        if (n / 10 != 0) {
            levonapravo(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        levonapravo(179);
    }
}

