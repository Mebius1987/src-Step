package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
public class natyral_1 {
    /*
    1. От 1 до n.
Дано натуральное число n. Выведите все числа от 1 до n.
Ввод: 5
Вывод: 1 2 3 4 5

    */

    public static int N(int n) {
        if (n == 0 )
            return 1;//условие выхода из рекурсии
        System.out.println(n);
        return N(n - 1) ;// условие входа

    }

    public static void main(String[] args) {

        N(5);
    }
}

