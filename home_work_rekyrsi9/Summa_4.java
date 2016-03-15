package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 15.03.2016.
 */
/*
4. Сумма цифр числа.
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
Ввод: 179
Вывод: 17

 */
public class Summa_4 {

    public static int summa(int n) {
        if (n / 10 != 0) {
            return (n % 10) + summa(n / 10);
        } else
            return (n % 10);
    }



    public static void main(String[] args) {
        System.out.println(summa(179));
    }
}
