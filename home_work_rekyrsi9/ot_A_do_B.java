package Step.home_work_rekyrsi9;

/**
 * Created by Mebius on 13.03.2016.
 */
public class ot_A_do_B {
    /*
  2. От A до B.
Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
Ввод: 5 1
Вывод: 5 4 3 2 1


            */

    public static int N(int n, int b) {
        if (n < b + 1)
            return 1;//условие выхода из рекурсии
        System.out.println(n);
        return N(n + 1, b);// условие входа
    }

    public static void main(String[] args) {
        N(1, 15);
    }
}
