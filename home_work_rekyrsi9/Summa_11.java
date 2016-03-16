package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 16.03.2016.
 */
/*
11. Сумма чисел в диапазоне.
Вычислить сумму чисел в определённом диапазоне. Начало и конец диапазона задаётся параметрами.

 */
public class Summa_11 {
    public static int summa(int a, int b) {
        if (a > b)
            return 0;
            return summa (a + 1, b) + a;
            }

    public static void main(String[] args) {
        System.out.println(summa(5, 8));
    }
}