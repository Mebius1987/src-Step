package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 14.03.2016.
 */
/*
3. Точная степень двойки.
Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
Операцией возведения в степень пользоваться нельзя!
Ввод: 3 8
Вывод: NO YES
 */
public class Stepen2_3 {
    public static void stepen(float n) {
        if (n > 1) {
            stepen(n / 2);
        } else if (n == 1) {
            System.out.println("YES");
        } else if (n != 1) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

        stepen(8);
    }

}

