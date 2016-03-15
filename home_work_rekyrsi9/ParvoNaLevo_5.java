package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 15.03.2016.
 */
/*
5. Цифры числа справа налево.
        Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами.
        При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.
        Ввод: 179
        Вывод: 9 7 1
*/

public class ParvoNaLevo_5 {
    public static void pravonalevo(int n) {
        System.out.print(n % 10 + " ");
        if (n / 10 != 0) {
            pravonalevo(n / 10);
        }
    }

    public static void main(String[] args) {
        pravonalevo(179);
    }
}


