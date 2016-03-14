package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
public class Natyral_1 {
    /*
    1. От 1 до n.
Дано натуральное число n. Выведите все числа от 1 до n.
Ввод: 5
Вывод: 1 2 3 4 5

    */
    public static int count =0;
    public static int N(int n) {
        count++;
        if (n < count)
            return n;//условие выхода из рекурсии

        System.out.println(count);
        return N(n);// условие входа
    }

    public static void main(String[] args) {

        N(5);
    }
}

